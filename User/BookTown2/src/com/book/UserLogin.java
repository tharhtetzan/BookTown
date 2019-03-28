package com.book;

public class UserLogin {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String name;
	private String password;
	public UserLogin(String name,String password){
		super();
		this.name=name;
		this.password=password;
	}
}
