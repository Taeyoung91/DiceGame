package taeyoung.dicegame.controller;

import java.util.Collections;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import taeyoung.dicegame.service.ConfigureService;

@Controller
public class HomeController {

	@Autowired
	ConfigureService configureService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
//		configureService.initConfigure();
		return "home";
	}

}
