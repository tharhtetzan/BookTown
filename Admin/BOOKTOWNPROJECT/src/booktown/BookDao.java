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


public class BookDao {
	private String DRIVER_NAME="com.mysql.jdbc.Driver";
	private String DB_URL="jdbc:mysql://localhost:3306/booktown";
	private String USER_NAME="root";
	private String PASSWORD="root";
	
	private Connection con;
		
	public BookDao(){
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
	
	//SELECT datas
	public List<BookBin> bookbinList(){
		System.out.println("HI chi pa");
		System.out.println("win prr dot :'3");
		
		String query="SELECT Book_id,Book_name,Author,Price FROM book;";
		List<BookBin> bookbinList = new ArrayList<BookBin>();
		
		try{
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(query);
			System.out.println("win b lrr?");
			while(rs.next()) {
				BookBin bb = new BookBin();
				bb.setBook_id(rs.getInt("Book_id"));
				bb.setBook_name(rs.getString("Book_name"));
				bb.setBook_author(rs.getString("Author"));
				bb.setPrice(rs.getDouble("Price"));
				bookbinList.add(bb); 
				System.out.println("win twr b");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return bookbinList;
	}
	
	//Update
	 public int updateBook(BookBin bb){
	    	System.out.println(bb.getBook_id());
	    	System.out.println(bb.getBook_name());
			String query = "UPDATE book SET Book_name=?,Author=?,Price=? where Book_id=?;";
			PreparedStatement ps = null;
			try{
				ps = con.prepareStatement(query);
				ps.setString(1, bb.getBook_name());
				ps.setString(2, bb.getBook_author());
				ps.setDouble(3, bb.getPrice());
				ps.setInt(4, bb.getBook_id());
				System.out.println(ps.executeUpdate());
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return 0;
			}
	 //Delete
	 public int deleteBook(BookBin bb){
	    	System.out.println(bb.getBook_id());
	    	System.out.println(bb.getBook_name());
			String query = "DELETE FROM book where Book_id=?;";
			PreparedStatement ps = null;
			//ResultSet rs = null;
			try{
				ps = con.prepareStatement(query);
				ps.setInt(1, bb.getBook_id());
				System.out.println(ps.executeUpdate());
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return 0;
			}
	 //Add
	public int addBook(BookBin bb){
		System.out.println(bb.getBook_id());
		System.out.println(bb.getBook_name());
		String query = "INSERT INTO book (Book_name, Author,Description,Price,Available_amount,Photo_link,Genere,Upload_Date) VALUES (?,?,?,?,?,?,?,?);";
		PreparedStatement ps = null;
		try{
			
			ps = con.prepareStatement(query);
			Timestamp tm = new Timestamp(System.currentTimeMillis());
			
			ps.setString(1, bb.getBook_name());
			ps.setString(2, bb.getBook_author());
			ps.setString(3, bb.getDescription());
			ps.setDouble(4, bb.getPrice());
			ps.setInt(5,bb.getAvailable_amount());
			ps.setString(6,bb.getPhoto_link());
			ps.setString(7,bb.getGenere() );
			ps.setTimestamp(8,tm);
			System.out.println("Add Book Complete "+ps.execute());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
		
}
	}

