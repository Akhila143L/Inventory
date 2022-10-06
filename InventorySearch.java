package com.infinite.inventory;

import java.util.Scanner;


public class InventorySearch {
public static void main(String[] args) {
	String Stockid;
	Scanner sc = new Scanner(System.in);
System.out.println("Enter Stockid  ");
Stockid = sc.next();
InventoryDAO dao = new InventoryDAO();
Inventory inventory = dao.searchInventory(Stockid);
try {
	System.out.println(inventory);
} catch (Exception e) {
	e.printStackTrace();
}

}
}
