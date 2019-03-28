package com.book;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{
	private String hbook_name;
	private int amount;
	private int hprice;
	public String getHbook_name() {
		return hbook_name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setHbook_name(String hbook_name) {
		this.hbook_name = hbook_name;
	}
	public int getHprice() {
		return hprice;
	}
	public void setHprice(int hprice) {
		this.hprice = hprice;
	}
	private List<Book> bookList;
	private List<Book> searchList;
	public List<Book> getSearchList() {
		return searchList;
	}
	public void setSearchList(List<Book> searchList) {
		this.searchList = searchList;
	}
	private int id;
	private String book_name;
	private String genere;
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	private String author;
	private String description;
	private int price;
	private int bookid;
	private String bookbook_name;
	private String bookauthor;
	private String bookdescription;
	private int bookprice;
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookbook_name() {
		return bookbook_name;
	}
	public void setBookbook_name(String bookbook_name) {
		this.bookbook_name = bookbook_name;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookdescription() {
		return bookdescription;
	}
	public void setBookdescription(String bookdescription) {
		this.bookdescription = bookdescription;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	/*public void validate() {
		if(amount<=0 && amount>=1000){
			addFieldError("name","Invalid amount");
		}
	}*/
	public String execute(){
		BookDao bookDao=new BookDao();
		bookList=bookDao.bookList();
		System.out.println(bookList);
		return "success";
	}
	public String booksell(){
		System.out.println("Requesting");
		BookDao request =new BookDao();
		Book requestsell = new Book();
		requestsell.setBook_name(book_name);
		requestsell.setGenere(genere);
		requestsell.setAuthor(author);
		requestsell.setPrice(price);
		requestsell.setDescription(description);
		request.sellrequest(requestsell);
		return "success";
	}
	public String bookbuy(){
		return "success";
	}
	public String buyrequest(){
		System.out.println("Requesting");
		BookDao buyrequest =new BookDao();
		Book requestbuy = new Book();
		requestbuy.setBook_name(book_name);
		requestbuy.setPrice(price);
		System.out.println("Book price is "+price);
		requestbuy.setAmount(amount);;
		buyrequest.buyrequesting(requestbuy);
		return "success";
	}
	public String tosearch(){
		BookDao bookDao=new BookDao();
		Book requestbuy = new Book();
		requestbuy.setBook_name(book_name);
		bookDao.searching(requestbuy);
		return "success";
	}
	public String search(){
		BookDao bookDao=new BookDao();
		searchList=bookDao.searchList();
		System.out.println(searchList);
		return "success";
	}
}
