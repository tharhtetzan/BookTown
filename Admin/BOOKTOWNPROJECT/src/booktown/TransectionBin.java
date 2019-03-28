package booktown;

public class TransectionBin {
	private int tran_id;
	private String book_code;
	private String sell_date;
	private double price;
	private String book_name;
	private int amount;
	
	public TransectionBin(){
		super();
	}
	public TransectionBin(int tran_id,String book_code,String sell_date,double price,String book_name,int amount){
		super();
		this.tran_id = tran_id;
		this.book_code = book_code;
		this.sell_date = sell_date;
		this.price = price;
		this.book_name = book_name;
		this.amount = amount;
	}
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
}
