package taeyoung.dicegame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taeyoung.dicegame.vo.Cell;
import taeyoung.dicegame.vo.Status;

@Service
public class ConfigureService {

	@Autowired
	Status status;

	@Autowired
	Cell cell;

	public void initConfigure() {
		int tmpCell[] = cell.getCell();
		
		for(int i=0; i<tmpCell.length; i++){
			tmpCell[i] = i;
		}

	}

	public void setConfigure(int beforeCell, int settedCell) {
		int tmpCell[] = cell.getCell();

		tmpCell[beforeCell] = settedCell;

		cell.setCell(tmpCell);
		
		status.setCell(cell.getCell());
	}

}
