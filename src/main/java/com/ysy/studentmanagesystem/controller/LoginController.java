package com.ysy.studentmanagesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;
import com.ysy.studentmanagesystem.service.LoginService;

@Controller
public class LoginController {

	@Resource(name="loginService")
	public LoginService loginService;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(@RequestParam("loginId") String loginId,@RequestParam("password") String password)
	{
		String result = loginService.confirmLoginer(loginId, password);
		if ("student".equalsIgnoreCase(result))
		{
			return "student";
		}
		if ("manager".equalsIgnoreCase(result))
		{
			return "manager";
		}
		return "redirect:/";
	}
}
