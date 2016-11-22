package taeyoung.dicegame.controller;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import taeyoung.dicegame.service.ConfigureService;
import taeyoung.dicegame.vo.Cell;

@Controller
public class ConfigureController {

	@Autowired
	ConfigureService configureService;

	@Autowired
	Cell cell;
	
	@RequestMapping(value = "/initconfig", method = RequestMethod.POST)
	public String initConfig(HttpServletRequest request, Model model) {
		configureService.initConfigure();
		model.addAttribute("settedCells", cell.getCell());
		return "configure";
	}

	@RequestMapping(value = "/confighome", method = RequestMethod.GET)
	public String configHome(HttpServletRequest request, Model model) {
		model.addAttribute("settedCells", cell.getCell());
		return "configure";
	}

	@RequestMapping(value = "/setconfig", method = RequestMethod.POST)
	public String setConfig(HttpServletRequest request, Model model) {
		String before = request.getParameter("beforeCell");
		String setted = request.getParameter("settedCell");

		int beforeCell = Integer.parseInt(before);
		int settedCell = Integer.parseInt(setted);

		configureService.setConfigure(beforeCell, settedCell);
		model.addAttribute("settedCells", cell.getCell());

		return "configure";
	}

}
