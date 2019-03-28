package com.book;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	//hidden values
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//normal Values
	private List<User> userList;
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	private String name;
	private String password;
	private String cpassword;
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	private String code;
	private String createdate;
	private String bookbought;
	private String booksold;
	private String email;
	private String phnumber;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getBookbought() {
		return bookbought;
	}
	public void setBookbought(String bookbought) {
		this.bookbought = bookbought;
	}
	public String getBooksold() {
		return booksold;
	}
	public void setBooksold(String booksold) {
		this.booksold = booksold;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void validate() {
		if(name==null || name.equals("")){
			addFieldError("name","Enter your name");
		}
		if(password == null || password.equals("")){
			addFieldError("password","Input Password");
		}
	}
	public String execute(){
		System.out.println("Kyi nay pr tl");
		String result = null ;
		UserDao login =new UserDao();
		UserLogin user=new UserLogin(name,password);
		user.getName();
		user.getPassword();
		login.logincheck(user);
		if(user.getName() == null){
			System.out.println(user.getName()+"ma shi buu ha");
			result = "success";
			System.out.println("Done");
		}
		else{
			System.out.println(user.getName()+"shi tl lay");
			result = "input";
		}
		return result;
	}
	
	public String userconfirm(){
		UserDao uconfirm =new UserDao();
		User confirmu = new User();
		confirmu.setName(name);
		confirmu.setPassword(password);
		confirmu.setPhnumber(phnumber);
		confirmu.setAddress(address);
		confirmu.setUsername(username);
		uconfirm.confirmuser(confirmu);
			return "success";
	}
}
