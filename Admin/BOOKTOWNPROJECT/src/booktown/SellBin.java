package booktown;

public class SellBin {
	private int sell_id;
	private String book_name;
	private String book_author;
	private String description;
	private String genere;
	private double price;
	private int flg;
	private int request_time;
	private String user_name;
	private int amount;
	
	public SellBin(){
		super();
	}
	public SellBin (int sell_id,String book_name,String book_author,String description,String genere,double price,String user_name,int amount){
		super();
		this.sell_id = sell_id;
		this.book_name = book_name;
		this. book_author =  book_author;
		this.description = description;
		this.genere = genere ;
		this.price = price;
		/*this.flg= flg;
		this.request_time = request_time;*/
		this.user_name= user_name;
		this.amount=amount;
	}

	public int getSell_id() {
		return sell_id;
	}
	public void setSell_id(int sell_id) {
		this.sell_id = sell_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getFlg() {
		return flg;
	}
	public void setFlg(int flg) {
		this.flg = flg;
	}
	public int getRequest_time() {
		return request_time;
	}
	public void setRequest_time(int request_time) {
		this.request_time = request_time;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
