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


public class SellDao {
	private String DRIVER_NAME="com.mysql.jdbc.Driver";
	private String DB_URL="jdbc:mysql://localhost:3306/booktown";
	private String USER_NAME="root";
	private String PASSWORD="root";
	private Connection con;
	
	public SellDao(){
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

	public List<SellBin> sellbinList() {
		System.out.println("HI chi pa");
		System.out.println("win prr dot :'3");
	
		String query="SELECT sell_id,book_name,author,description,genere,price,User_name,amount FROM sellrequests";
		List<SellBin> sellbinList= new ArrayList<SellBin>();
	
	try{
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery(query);
		System.out.println("win b lrr?");
		while(rs.next()) {
			SellBin sb = new SellBin();
			sb.setSell_id(rs.getInt("sell_id"));
			sb.setBook_name(rs.getString("book_name"));
			sb.setBook_author(rs.getString("author"));
			sb.setDescription(rs.getString("description"));
			sb.setGenere(rs.getString("genere"));
			sb.setPrice(rs.getDouble("price"));
			sb.setUser_name(rs.getString("User_name"));
			sb.setAmount(rs.getInt("amount"));
			sellbinList.add(sb);
			System.out.println("win twr b");
		}
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	return sellbinList;
}
}
