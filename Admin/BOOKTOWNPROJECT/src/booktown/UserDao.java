package booktown;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
		private String DRIVER_NAME="com.mysql.jdbc.Driver";
		private String DB_URL="jdbc:mysql://localhost:3306/booktown";
		private String USER_NAME="root";
		private String PASSWORD="root";
		private Connection con;
		
		public UserDao(){
			try{
				Class.forName(DRIVER_NAME);
				con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}

	public List<UserBin> userbinList() {
		System.out.println("HI chi pa");
		System.out.println("win prr dot :'3");
		
		String query="SELECT User_id,User_name,Address,Phone_number,Book_buy FROM user;";
		List<UserBin> userbinList= new ArrayList<UserBin>();
		
		try{
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			System.out.println("win b lrr?");
			while(rs.next()) {
				UserBin ub = new UserBin();
				ub.setUser_id(rs.getInt("User_id"));
				ub.setUser_name(rs.getString("User_name"));
				ub.setAddress(rs.getString("Address"));
				ub.setPhone_number(rs.getInt("Phone_number"));
				ub.setBook_buy(rs.getInt("Book_buy"));
				userbinList.add(ub);
				System.out.println("win twr b");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return userbinList;
	}
}
