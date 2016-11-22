package taeyoung.dicegame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taeyoung.dicegame.enumclass.WinningStatus;
import taeyoung.dicegame.vo.Cell;
import taeyoung.dicegame.vo.Status;

@Service
public class DiceService {

	@Autowired
	Status status;

	@Autowired
	Cell cell;

	final private int Goal = 29;

	public void initGame() {
		status.setAlphaValue(0);
		status.setCell(cell.getCell());
		status.setCurCellForAlphaDice(0);
		status.setCurCellForUser(0);
		status.setUserValue(0);
	}

	public WinningStatus rollingDice() {

		int userValue = status.getR1().roll();
		int alphaValue = status.getR2().roll();

		int curCellForUser = status.getCurCellForUser() + userValue;
		int curCellForAlphaDice = status.getCurCellForAlphaDice() + alphaValue;

		status.setUserValue(userValue);
		status.setAlphaValue(alphaValue);

		status.setCurCellForUser(curCellForUser);
		status.setCurCellForAlphaDice(curCellForAlphaDice);

		if (curCellForUser > Goal && curCellForAlphaDice > Goal)
			return WinningStatus.Draw;
		else if (curCellForUser > Goal && curCellForAlphaDice <= Goal)
			return WinningStatus.Player;
		else if (curCellForUser <= Goal && curCellForAlphaDice > Goal)
			return WinningStatus.AlphaDice;

		else {
			if (curCellForUser != cell.getCell()[curCellForUser]){
				status.setCurCellForUser(cell.getCell()[curCellForUser]);
			}
			if (curCellForAlphaDice != cell.getCell()[curCellForAlphaDice]){
				status.setCurCellForAlphaDice(cell.getCell()[curCellForAlphaDice]);
			}

			return WinningStatus.NotYet;
		}
	}
}
