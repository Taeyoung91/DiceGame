package taeyoung.dicegame.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Status {

	@Autowired
	@Qualifier("userDice")
	private Dice r1;
	@Autowired
	@Qualifier("alphaDice")
	private Dice r2;

	private int userValue;
	private int alphaValue;
	private int[] cell;

	public int[] getCell() {
		return cell;
	}

	public void setCell(int[] cell) {
		this.cell = cell;
	}

	private int curCellForUser;
	private int curCellForAlphaDice;

	public Dice getR1() {
		return r1;
	}

	public void setR1(Dice r1) {
		this.r1 = r1;
	}

	public Dice getR2() {
		return r2;
	}

	public void setR2(Dice r2) {
		this.r2 = r2;
	}

	public int getUserValue() {
		return userValue;
	}

	public void setUserValue(int userValue) {
		this.userValue = userValue;
	}

	public int getAlphaValue() {
		return alphaValue;
	}

	public void setAlphaValue(int alphaValue) {
		this.alphaValue = alphaValue;
	}

	public int getCurCellForUser() {
		return curCellForUser;
	}

	public void setCurCellForUser(int curCellForUser) {
		this.curCellForUser = curCellForUser;
	}

	public int getCurCellForAlphaDice() {
		return curCellForAlphaDice;
	}

	public void setCurCellForAlphaDice(int curCellForAlphaDice) {
		this.curCellForAlphaDice = curCellForAlphaDice;
	}

}
