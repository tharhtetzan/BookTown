package com.book;

import java.util.List;

public class HistoryAction {
	private String bookname;
	private String date;
	private String price;
	private String amount;
	private int totalamount;
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public List<HistoryData> getBuyList() {
		return buyList;
	}
	public void setBuyList(List<HistoryData> buyList) {
		this.buyList = buyList;
	}
	private List<HistoryData> buyList;
	private List<HistoryData> sellList;
	private List<HistoryData> pending;
	private List<HistoryData> vouncherlist;
	public List<HistoryData> getVouncherlist() {
		return vouncherlist;
	}
	public void setVouncherlist(List<HistoryData> vouncherlist) {
		this.vouncherlist = vouncherlist;
	}
	public List<HistoryData> getPending() {
		return pending;
	}
	public void setPending(List<HistoryData> pending) {
		this.pending = pending;
	}
	public List<HistoryData> getSellList() {
		return sellList;
	}
	public void setSellList(List<HistoryData> sellList) {
		this.sellList = sellList;
	}
	public String execute(){
		HistoryDao historydao=new HistoryDao();
		buyList=historydao.buyList();
		System.out.println(buyList);
		sellList=historydao.sellList();
		System.out.println(sellList);
		pending=historydao.pending();
		System.out.println(pending);
		return "success";
	}
	public String vouncher(){
		HistoryDao historydao=new HistoryDao();
		vouncherlist=historydao.VouncherList();
		System.out.println(vouncherlist);
		return "success";
	}
}
