package model;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String userId;
	private String pass;
	private String name;
	private String mail;
	
	public UserBean() {};
	
	public UserBean(String userId, String pass, String name, String mail) {
		this.userId = userId;
		this.pass = pass;
		this.name = name;
		this.mail = mail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
	

}
