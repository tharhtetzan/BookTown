package com.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HistoryDao {
	private static Connection connection=null;
	public HistoryDao() {
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
	public List<HistoryData> buyList(){
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
    	String query="select Book_name,Sold_price,Sell_date,amount from transection where User_name = '"+username+"';";
    	List<HistoryData> buyList=new ArrayList<HistoryData>();
    	try {
    		System.out.println("in try catch");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				HistoryData bought = new HistoryData();
				bought.setBookname(rs.getString("Book_name"));
				bought.setPrice(rs.getString("Sold_price"));
				bought.setAmount(rs.getString("amount"));
				int totalamount = 0;
				int y = Integer.parseInt(rs.getString("Sold_price"));
				int x = Integer.parseInt(rs.getString("amount"));
				System.out.println("Sold_Price - "+rs.getString("Sold_price"));
				System.out.println("amount - "+rs.getString("amount"));
				totalamount = y * x ; 
				bought.setDate("Sell_date");
				bought.setTotalamount(totalamount);
				System.out.println("Adding");
				buyList.add(bought);
				System.out.println("Added");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return buyList;
    }
public List<HistoryData> sellList(){
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
    	String query="select book_name,price,request_time,amount from sellrequests where flg = 1 and User_name= '"+username+"';";
    	List<HistoryData> sellList=new ArrayList<HistoryData>();
    	try {
    		System.out.println("in try catch");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				HistoryData sold = new HistoryData();
				sold.setBookname(rs.getString("book_name"));
				sold.setPrice(rs.getString("price"));
				sold.setAmount(rs.getString("amount"));
				int totalamount = 0;
				int y = Integer.parseInt(rs.getString("price"));
				int x = Integer.parseInt(rs.getString("amount"));
				System.out.println("Sold_Price - "+rs.getString("price"));
				System.out.println("amount - "+rs.getString("amount"));
				totalamount = y * x ; 
				sold.setDate("request_time");
				sold.setTotalamount(totalamount);
				System.out.println("Adding");
				sellList.add(sold);
				System.out.println("Added");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sellList;
    }
public List<HistoryData> pending(){
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
	String query="select book_name,price,request_time,amount from sellrequests where flg = 0 and User_name= '"+username+"';";
	List<HistoryData> pending=new ArrayList<HistoryData>();
	try {
		System.out.println("in try catch");
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			HistoryData pend = new HistoryData();
			pend.setBookname(rs.getString("book_name"));
			pend.setPrice(rs.getString("price"));
			pend.setAmount(rs.getString("amount"));
			int totalamount = 0;
			int y = Integer.parseInt(rs.getString("price"));
			int x = Integer.parseInt(rs.getString("amount"));
			System.out.println("Sold_Price - "+rs.getString("price"));
			System.out.println("amount - "+rs.getString("amount"));
			totalamount = y * x ; 
			pend.setDate("request_time");
			pend.setTotalamount(totalamount);
			System.out.println("Adding");
			pending.add(pend);
			System.out.println("Added");
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return pending;
	}
public List<HistoryData> VouncherList(){
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
	String query="select Book_name,Sold_price,Sell_date,amount from transection where User_name = '"+username+"' ORDER BY Tran_id DESC LIMIT 1;";
	List<HistoryData> vouncherList=new ArrayList<HistoryData>();
	try {
		System.out.println("in try catch");
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			HistoryData bought = new HistoryData();
			bought.setBookname(rs.getString("Book_name"));
			bought.setPrice(rs.getString("Sold_price"));
			bought.setAmount(rs.getString("amount"));
			int totalamount = 0;
			int y = Integer.parseInt(rs.getString("Sold_price"));
			int x = Integer.parseInt(rs.getString("amount"));
			System.out.println("Sold_Price - "+rs.getString("Sold_price"));
			System.out.println("amount - "+rs.getString("amount"));
			totalamount = y * x ; 
			bought.setDate("Sell_date");
			bought.setTotalamount(totalamount);
			System.out.println("Adding");
			vouncherList.add(bought);
			System.out.println("Added");
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return vouncherList;
}
}
