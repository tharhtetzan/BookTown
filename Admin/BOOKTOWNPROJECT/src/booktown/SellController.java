package booktown;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class SellController extends ActionSupport {
	private static final long serialVersionUID = 123456L;
	private int sell_id;
	private String book_name;
	private String book_author;
	private String description;
	private String genere;
	private double price;
	private int flg;
	private int request_time;
	private String user_name;
	private int amount;
	public List<SellBin> sellbinList;

	public int getSell_id() {
		return sell_id;
	}
	public void setSell_id(int sell_id) {
		this.sell_id = sell_id;
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
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getFlg() {
		return flg;
	}
	public void setFlg(int flg) {
		this.flg = flg;
	}
	public int getRequest_time() {
		return request_time;
	}
	public void setRequest_time(int request_time) {
		this.request_time = request_time;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<SellBin> getSellbinList() {
		return sellbinList;
	}
	public void setSellbinList(List<SellBin> sellbinList) {
		this.sellbinList = sellbinList;
	}
	//Action
	public String execute(){
		SellDao sdao = new SellDao();
		sellbinList = sdao.sellbinList();
		System.out.println("Sell Controller execute:"+sellbinList);
		return "success";
	}
}
