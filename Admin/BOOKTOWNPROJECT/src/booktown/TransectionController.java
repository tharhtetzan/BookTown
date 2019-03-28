package booktown;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class TransectionController  extends ActionSupport{
	private static final long serialVersionUID = 123456L;
	
	private int tran_id;
	private String book_code;
	private String sell_date;
	private double price;
	private String book_name;
	private int amount;
	public List<TransectionBin> transectionbinList;
	
	public int getTran_id() {
		return tran_id;
	}
	public void setTran_id(int tran_id) {
		this.tran_id = tran_id;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getSell_date() {
		return sell_date;
	}
	public void setSell_date(String sell_date) {
		this.sell_date = sell_date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<TransectionBin> getTransectionbinList() {
		return transectionbinList;
	}
	public void setTransectionbinList(List<TransectionBin> transectionbinList) {
		this.transectionbinList = transectionbinList;
	}
	//Action
		public String execute(){
			TransectionDao tdao = new TransectionDao();
			transectionbinList = tdao.transectionbinList();
			System.out.println(" Controller execute:"+transectionbinList);
			
			return "success";
		}
}
