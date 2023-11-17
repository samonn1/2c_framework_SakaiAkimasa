package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class gitLoginController {

	//一覧表示用
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String viewPage() {

		return "gitlogin";
	}

	//ログイン検証用
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	public String loginPost(String userid, String password, HttpSession session) {

		session.setAttribute("userid", userid);
		session.setAttribute("password", password);

		if ("gitlogin".equals(userid) && "gitpw".equals(password)) {
			return "redirect:/gititemlist";
		} else {
			return "redirect:/gitpralogin";
		}
	}
}
