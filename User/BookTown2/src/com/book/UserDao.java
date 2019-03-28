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

public class UserDao {
	private static Connection connection=null;
	public UserDao() {
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
	public int logincheck(UserLogin user){
		User huser=new User();
		Timestamp tm=new Timestamp(System.currentTimeMillis());
		System.out.println(user.getName()+user.getPassword());
		try {
			System.out.println("Try catch test");
			String query="Select * from user where User_name='"+user.getName()+"' and Password='"+user.getPassword()+"';";
			Statement st1= connection.createStatement();
			ResultSet rs1=st1.executeQuery(query);
			while(rs1.next()) {
				System.out.println("Result");
					if(user.getName().equals(rs1.getString(3))  && user.getPassword().equals(rs1.getString(4))){
						System.out.println("shi tl");
						huser.setUsername(user.getName());
						System.out.println(huser.getUsername()+"Kyi nay pr tl");
						Statement st= connection.createStatement();
						//id 666 check
						String query1="Select * from user where User_id=666;";
						Statement st3= connection.createStatement();
						ResultSet rs=st3.executeQuery(query1);
						while(rs.next()) {
							System.out.println("Result");
								if(rs.getInt("User_id")!=666){
									String query4="INSERT INTO user (User_id,User_name,Email,Address,Phone_number,Password,created_time) VALUES (?,?,?,?,?,?,?);";
									PreparedStatement ps=null;
									try {
										 ps=connection.prepareStatement(query4);
										 ps.setInt(1,666);
										 ps.setString(2,"dummy");
										 ps.setString(3,"dummy");
										 ps.setString(4,"dummy");
										 ps.setString(5,"dummy");
										 ps.setString(6,"dummy");
										 ps.setTimestamp(7,tm);
										 ps.execute();
									} catch (SQLException e){
										System.out.println("Error");
										e.printStackTrace();
									}
									
									user.setName(null);
								}else{
									System.out.println("Go on");
									
								}
							}
						st.executeUpdate("UPDATE user set User_code = '"+user.getName()+"' where User_id = 666 ; ");
						user.setName(null);
					}else{
						System.out.println("Shi buu"+rs1.getString(3)+rs1.getString(4));
						
					}
				}
			} catch (SQLException e){
				System.out.println("Error");
			e.printStackTrace();
			}
		return 0;
	}
	public List<User> UserProfileList(){
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
		String query="select * from user where user_name='"+username+"'";
    	List<User> userList=new ArrayList<User>();
    	try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				User profile = new User();
				profile.setName(rs.getString("User_name"));
				profile.setCode(rs.getString("User_code"));
				profile.setCreatedate(rs.getString("created_time"));
				profile.setBookbought(rs.getString("Book_buy"));
				profile.setBooksold(rs.getString("Book_sell"));
				profile.setEmail(rs.getString("Email"));
				profile.setAddress(rs.getString("Address"));
				profile.setPhnumber(rs.getString("Phone_number"));
				userList.add(profile);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
    }
	public int signUp(User signup){
		String id = null;
		Timestamp tm=new Timestamp(System.currentTimeMillis());
		String query="INSERT INTO user (User_id,User_name,Email,Address,Phone_number,Password,created_time) VALUES (?,?,?,?,?,?,?);";
		PreparedStatement ps=null;
		try {
			 ps=connection.prepareStatement(query);
			 ps.setInt(1,0);
			 ps.setString(2,signup.getName());
			 ps.setString(3,signup.getEmail());
			 ps.setString(4,signup.getAddress());
			 ps.setString(5,signup.getPhnumber());
			 ps.setString(6,signup.getPassword());
			 ps.setTimestamp(7,tm);
			 ps.execute();
			 {
				 String query1="select * from user where User_name='"+signup.getName()+"';";
				 Statement st=connection.createStatement();
					ResultSet rs1=st.executeQuery(query1);
					while(rs1.next()) {
						id = "U-0"+rs1.getString(1);
						System.out.println(id);
					}
					Statement st1= connection.createStatement();
					st1.executeUpdate("UPDATE user set User_code = '"+signup.getName()+"' where User_id = 666 ; ");
					st.executeUpdate("Update user set User_code='"+id+"' where User_name = '"+signup.getName()+"';");
			 }
			 System.out.println("Successfully added");
			} catch (SQLException e){
				System.out.println("Error");
			e.printStackTrace();
		}
		return 0;
	}
	public int confirmuser(User confirmu){
		String usercode = "";
		String bookcode = "";
		String time = "";
		String tester = "LOL";
		String query="select * from user where User_name='"+confirmu.getName()+"' and Password='"+confirmu.getPassword()+"';";
    	try {
			Statement st=connection.createStatement();
			ResultSet rs1=st.executeQuery(query);
			while(rs1.next()) {
				if(confirmu.getName().equals(rs1.getString(3))  && confirmu.getPassword().equals(rs1.getString(4))){
					tester = null;
					System.out.println("Password correct");
				}else{
					System.out.println("Password incorrect");
				}
			}
			if(tester == null){
				System.out.println(confirmu.getName());
				String query2="select User_code from user where User_name='"+confirmu.getName()+"';";
				ResultSet rs2=st.executeQuery(query2);
				while(rs2.next()) {
					usercode = rs2.getString(1);
					System.out.println(rs2.getString(1));
				}
			st.executeUpdate("UPDATE transection set address = '"+confirmu.getAddress()+"',phnumber = '"+confirmu.getPhnumber()+"',User_name = '"+confirmu.getName()+"',validater = 1 where  validater = 0;");
			System.out.println("Successfully Updated");
			}else{
				System.out.println("Something's wrong");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
		return 0;
	}
}
