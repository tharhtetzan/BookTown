package com.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	private static Connection connection=null;
	public BookDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if(connection==null) {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/booktown",	"root", "root");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
public List<Book> bookList(){
    	
    	String query="select Book_id,Book_name,Author,Description,Price from book";
    	List<Book> bookList=new ArrayList<Book>();
    	try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				Book book=new Book();
				book.setId(rs.getInt("Book_id"));
				book.setBook_name(rs.getString("Book_name"));
				book.setAuthor(rs.getString("Author"));
				book.setDescription(rs.getString("Description"));
				book.setPrice(rs.getInt("Price"));
				bookList.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookList;
    }
	
	public int buyrequesting(Book requestbuy){
		String bookcode= null;
		Timestamp tm=new Timestamp(System.currentTimeMillis());
		try {
			System.out.println("Try catch test");
			String query="Select * from book where Book_name='"+requestbuy.getBook_name()+"';";
			Statement st1= connection.createStatement();
			ResultSet rs1=st1.executeQuery(query);
			while(rs1.next()) {
				System.out.println(rs1.getString(2)+" is Book Code.");
				bookcode = rs1.getString(2);
				System.out.println(bookcode);
			}
			} catch (SQLException e){
				System.out.println("Error");
			e.printStackTrace();
			}
		String query="INSERT INTO transection (Tran_id,User_name,Book_code,Sell_date,Sold_price,Complete_flg,Book_name,amount) VALUES (?,?,?,?,?,?,?,?);";
		PreparedStatement ps=null;
		try {
			 ps=connection.prepareStatement(query);
			 ps.setInt(1,0);
			 ps.setString(2,"U-01");
			 ps.setString(3,bookcode);
			 ps.setTimestamp(4,tm);
			 ps.setInt(5,requestbuy.getPrice());
			 ps.setInt(6,0);
			 ps.setString(7,requestbuy.getBook_name());
			 ps.setInt(8,requestbuy.getAmount());
			 ps.execute();
			 System.out.println("Successfully added"+requestbuy.getPrice());
			} catch (SQLException e){
				System.out.println("Error");
			e.printStackTrace();
		}
		return 0;
	}
	public List<Book> searchList(){
    	String bookname = null ;
    	try {
			System.out.println("Try catch test");
			String query1="Select Signature from user where User_id=666;";
			Statement st1= connection.createStatement();
			ResultSet rs1=st1.executeQuery(query1);
			while(rs1.next()) {
					bookname = rs1.getString(1);
					System.out.println(bookname);
				}
			} catch (SQLException e){
				System.out.println("Error");
			e.printStackTrace();
			}
    	String query="select Book_id,Book_name,Author,Description,Price from book where Book_name = '"+bookname+"';";
    	List<Book> searchList=new ArrayList<Book>();
    	try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				Book searchlist=new Book();
				searchlist.setId(rs.getInt("Book_id"));
				searchlist.setBook_name(rs.getString("Book_name"));
				searchlist.setAuthor(rs.getString("Author"));
				searchlist.setDescription(rs.getString("Description"));
				searchlist.setPrice(rs.getInt("Price"));
				searchList.add(searchlist);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return searchList;
    }
	public int searching(Book requestbuy){
		try {
			Statement st=connection.createStatement();
			st.executeUpdate("Update user set Signature='"+requestbuy.getBook_name()+"' where User_id=666;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int sellrequest(Book requestsell){
		String username = null;
		System.out.println("Profileshowing");
		try {
			System.out.println("Try catch test");
			String query1="Select User_code from user where User_id=666;";
			Statement st1= connection.createStatement();
			ResultSet rs1=st1.executeQuery(query1);
			while(rs1.next()) {
					username = rs1.getString(1);
					System.out.println(username);
				}
			} catch (SQLException e){
				System.out.println("Error");
			e.printStackTrace();
			}
	Timestamp tm=new Timestamp(System.currentTimeMillis());
	String query="INSERT INTO sellrequests (sell_id,book_name,author,description,genere,price,request_time,amount,User_name) VALUES (?,?,?,?,?,?,?,?,?);";
	PreparedStatement ps=null;
	try {
		 ps=connection.prepareStatement(query);
		 ps.setInt(1,0);
		 ps.setString(2,requestsell.getBook_name());
		 ps.setString(3,requestsell.getAuthor());
		 ps.setString(4,requestsell.getDescription());
		 ps.setString(5,requestsell.getGenere());
		 ps.setInt(6,requestsell.getPrice());
		 ps.setTimestamp(7,tm);
		 ps.setInt(8,1);
		 ps.setString(9,username);
		 ps.execute();
		 System.out.println("Successfully added");
		} catch (SQLException e){
			System.out.println("Error");
		e.printStackTrace();
		}
		return 0;
	}
}
