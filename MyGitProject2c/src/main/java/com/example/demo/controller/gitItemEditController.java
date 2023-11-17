package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemEditController {
	//一覧表示用
	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String doEditGet() {

		return "gititemedit";
	}

	//ログイン検証用
	@RequestMapping(path = "/gititemlist33", method = RequestMethod.GET)
	public String doEditPost() {

		return "gititemedit";
	}

}
