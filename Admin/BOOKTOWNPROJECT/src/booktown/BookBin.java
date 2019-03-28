package booktown;

public class BookBin {
	private int book_id;
	private String book_name;
	private String book_author;
	private String description;
	private double price;
	private int available_amount;
	private String photo_link;
	private String genere;

	
	public BookBin(){
		super();
	}
	
	public BookBin(int book_id,String book_name,String book_author,String description,double price,int available_amount,String photo_link,String genere){
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.description = description;
		this.price = price;
		this.available_amount = available_amount;
		this.photo_link = photo_link;
		this.genere = genere;	
	}
	
	//getters and setters
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailable_amount() {
		return available_amount;
	}
	public void setAvailable_amount(int available_amount) {
		this.available_amount = available_amount;
	}
	public String getPhoto_link() {
		return photo_link;
	}
	public void setPhoto_link(String photo_link) {
		this.photo_link = photo_link;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
}
