package com.resourceInfo.entity;


public class UserLogin {

		private String employeeEmail;
		private String employeePassword;
		public UserLogin() {
			super();
		}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeePassword() {
			return employeePassword;
		}

		public void setEmployeePassword(String employeePassword) {
			this.employeePassword = employeePassword;
		}

	public UserLogin(String employeeEmail, String employeePassword) {
		this.employeeEmail = employeeEmail;
		this.employeePassword = employeePassword;
	}
}
