package booktown;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class BookController extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 123456L;
	private int book_id;
	private String book_name;
	private String book_author;
	private String description;
	private double price;
	private int available_amount;
	private String photo_link;
	private String genere;
	public List<BookBin> bookbinList;
	
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
	public List<BookBin> getBookbinList() {
		return bookbinList;
	}
	public void setBookbinList(List<BookBin> bookbinList) {
		this.bookbinList = bookbinList;
	}
	
	//Action
	public String execute(){
		BookDao bdao = new BookDao();
		bookbinList = bdao.bookbinList();
		System.out.println("Book Controller execute: "+ bookbinList);
		return "success";
	}
	public String updateBookInput(){
		System.out.println("Hi chi pa-->"+book_name);
		System.out.println("Chi pa price-->"+price);
		return "success";
	}
	public String updateBookConfirm(){
		System.out.println("Hi chi pa-->"+book_author);
		System.out.println("Chi pa price-->"+price);
		return "success";
	}
	public String updateBookComplete(){
		System.out.println("ID --->"+book_id);
		BookDao bdao = new BookDao();
		BookBin bb = new BookBin(book_id,book_name,book_author,description,price,available_amount,photo_link,genere);
		bb.getBook_id();
		bb.getBook_name();
		bb.getBook_author();
		bb.getPrice();
		bdao.updateBook(bb);
		System.out.println("Success!---->");
		return "success";
	}
	public String deleteBookInput(){
		return "success";
	}
	public String deleteBookConfirm(){
		return "success";
	}
	public String deleteBookComplete(){
		System.out.println("ID --->"+book_id);
		BookDao bdao = new BookDao();
		BookBin bb = new BookBin(book_id,book_name,book_author,description,price,available_amount,photo_link,genere);
		bb.getBook_id();
		bb.getBook_name();
		bb.getBook_author();
		bb.getPrice();
		bdao.deleteBook(bb);
		System.out.println("Success!---->");
		return "success";
	}
	public String addBookInput(){
		return "success";
	}
	public String addBookConfirm(){
		return "success";
	}
	public String addBookComplete(){
		BookDao bdao = new BookDao();
		BookBin bb =new BookBin(book_id,book_name,book_author,description,price,available_amount,photo_link,genere);
		bb.getBook_name();
		bb.getBook_author();
		bb.getDescription();
		bb.getPrice();
		bb.getAvailable_amount();
		bb.getPhoto_link();
		bb.getGenere();
		bdao.addBook(bb);
		System.out.println("Success----->");
		return "success";
	}
}