package booktown;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class UserController extends ActionSupport{
	
	private static final long serialVersionUID = 123456L;
	private int user_id;
	private String user_code;
	private String user_name;
	private String password;
	private String address;
	private int phone_number;
	private String email;
	private String signature;
	private String faulacy;
	//dateandtime
	private int book_buy;
	private int book_sell;
	public List<UserBin> userbinList;
	

	//gettersandsetters
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getFaulacy() {
		return faulacy;
	}
	public void setFaulacy(String faulacy) {
		this.faulacy = faulacy;
	}
	public int getBook_buy() {
		return book_buy;
	}
	public void setBook_buy(int book_buy) {
		this.book_buy = book_buy;
	}
	public int getBook_sell() {
		return book_sell;
	}
	public void setBook_sell(int book_sell) {
		this.book_sell = book_sell;
	}
	public List<UserBin> getUserbinList() {
		return userbinList;
	}
	public void setUserbinList(List<UserBin> userbinList) {
		this.userbinList = userbinList;
	}
	
	//Action
	public String execute(){
		UserDao udao = new UserDao();
		userbinList = udao.userbinList();
		System.out.println("User Controller execute:" + userbinList);
		return "success";
	}
	
	
}
