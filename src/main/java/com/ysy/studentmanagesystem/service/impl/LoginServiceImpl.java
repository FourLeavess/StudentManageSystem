package com.ysy.studentmanagesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysy.studentmanagesystem.mapper.Loginer;
import com.ysy.studentmanagesystem.mapper.LoginerMapper;
import com.ysy.studentmanagesystem.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	public LoginerMapper loginerMapper;
	
	public String confirmLoginer(String loginId, String password) {
		Loginer loginer = loginerMapper.getLoginerByLoginId(loginId);
		if (loginer == null)
		{
			return "this loginer doew not exist!";
		}

		System.out.println("[INFO] LoginService confirmLoginer,  " + loginer.toString());
		if ( ! password.equals(loginer.getPassword()))
		{
			return "password is not correct!";
		}
		
		if (loginer.isManager())
		{
			return "manager";
		}
		return "student";
	}

}
