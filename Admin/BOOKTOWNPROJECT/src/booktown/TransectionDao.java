package booktown;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransectionDao {
	private String DRIVER_NAME="com.mysql.jdbc.Driver";
	private String DB_URL="jdbc:mysql://localhost:3306/booktown";
	private String USER_NAME="root";
	private String PASSWORD="root";
	private Connection con;
	
	public TransectionDao(){
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
	
	public List<TransectionBin> transectionbinList() {
		System.out.println("HI chi pa");
		System.out.println("win prr dot :'3");
		
		String query="SELECT Tran_id,Book_code,Sell_date,Sold_price,Book_name,amount FROM transection t";
		List<TransectionBin>transectionbinList  =new ArrayList <TransectionBin>();
		try{
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			System.out.println("win b lrr?");
			while(rs.next()) {
				TransectionBin tb = new TransectionBin();
				tb.setTran_id(rs.getInt("Tran_id"));
				tb.setBook_code(rs.getString("Book_code"));
				tb.setPrice(rs.getDouble("Sold_price"));
				tb.setBook_name(rs.getString("Book_name"));
				tb.setAmount(rs.getInt("amount"));
				transectionbinList.add(tb);
				System.out.println("win twr b");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return transectionbinList;
	}
	
}
