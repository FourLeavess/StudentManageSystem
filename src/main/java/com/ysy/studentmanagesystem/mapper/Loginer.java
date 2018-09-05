package com.ysy.studentmanagesystem.mapper;

public class Loginer {
	
	private String loginId;
	
	private boolean isManager;
	
	private String password;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Loginer [loginId=" + loginId + ", isManager=" + isManager
				+ ", password=" + password + "]";
	}
}
