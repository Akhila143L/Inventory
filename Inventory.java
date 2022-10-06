package com.infinite.inventory;

public class Inventory {
 private String Stockid;
 private String Itemname;
 private Double Price;
 private int QuantityAvail;
@Override
public String toString() {
	return "Inventory [Stockid=" + Stockid + ", Itemname=" + Itemname + ", Price=" + Price + ", QuantityAvail="
			+ QuantityAvail + "]";
}
public Inventory(String stockid, String itemname, Double price, int quantityAvail) {
	Stockid = stockid;
	Itemname = itemname;
	Price = price;
	QuantityAvail = quantityAvail;
}
public Inventory() {
	// TODO Auto-generated constructor stub
}
public String getStockid() {
	return Stockid;
}
public void setStockid(String stockid) {
	Stockid = stockid;
}
public String getItemname() {
	return Itemname;
}
public void setItemname(String itemname) {
	Itemname = itemname;
}
public Double getPrice() {
	return Price;
}
public void setPrice(Double price) {
	Price = price;
}
public int getQuantityAvail() {
	return QuantityAvail;
}
public void setQuantityAvail(int quantityAvail) {
	QuantityAvail = quantityAvail;
}
 
}
