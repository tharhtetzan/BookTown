package com.book;

import com.opensymphony.xwork2.ActionSupport;

public class Signupaction extends ActionSupport {
	private String name;
	private String password;
	private String cpassword;
	private String email;
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
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String phnumber;
	private String address;
	public void validate() {
		if(name==null || name.equals("")){
			addFieldError("name","Enter your name");
		}
		if(email==null || email.equals("")){
			addFieldError("email","Enter your email");
		}
		if(address==null || address.equals("")){
			addFieldError("address","Enter your address");
		}
		if(phnumber==null || phnumber.equals("")){
			addFieldError("phnumber","Enter your Phone number");
		}
		if(password==null || password.equals("")){
			addFieldError("password","Enter your password");
		}
		if(cpassword==null || cpassword.equals("")){
			addFieldError("cpassword","Enter your password");
		}
		if(!(password.equals(cpassword)) ){
			addFieldError("cpassword","Passwords Do not Match");
		}
		System.out.println(password +"  "+cpassword);
	}
	public String signup(){
		System.out.println("Signing Up");
		String result = null ;
		UserDao login =new UserDao();
		User signup = new User();
		signup.setName(name);
		signup.setEmail(email);
		signup.setAddress(password);
		signup.setPhnumber(phnumber);
		signup.setPassword(password);
		login.signUp(signup);
		return "success";
	}
}
