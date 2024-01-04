package com.pms.menus;

import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDAO;
import com.pms.dao.ProductImpl;
import com.pms.model.Product;

public class ProductMenus {

	static Scanner sc = new Scanner(System.in);
	static ProductDAO dao = new ProductImpl();

	public static void adminMainMenu() {
		System.out.println("------------------------------");
		System.out.println("|      ADMIN MAIN MENU       |");
		System.out.println("------------------------------");
		System.out.println("|   1. ADD PRODUCT           |");
		System.out.println("|   2. VIEW PRODUCT          |");
		System.out.println("|   3. VIEW ALL PRODUCTS     |");
		System.out.println("|   4. UPDATE PRPDUCT        |");
		System.out.println("|   5. DELETE PRODUCT        |");
		System.out.println("|   6. BACK                  |");
		System.out.println("------------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			dao.createProduct();
			adminMainMenu();
			break;
		case 2:
			System.out.println("Enter Your Search Product Id?");
			Product product = dao.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-----------------------------------------");
			System.out.println(product);
			adminMainMenu();
			break;
		case 3:
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-----------------------------------------");
			List<Product> products = dao.viewAllProducts();
			for (Product p : products) {
				System.out.println(p);
			}
			adminMainMenu();
			break;
		case 4:
			System.out.println("Which Product do you want to update ?");
			int pid = sc.nextInt();
			Product selectedProduct = dao.viewProduct(pid);
			System.out.println("Select Your choice : 1. Name  2. Qty  3. Price ");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("Enter Updated Product Name ?");
				selectedProduct.setPname(sc.next());
			} else if (ch == 2) {
				System.out.println("Enter Updated Product Qty ?");
				selectedProduct.setQty(sc.nextInt());
			} else if (ch == 3) {
				System.out.println("Enter Updated Product Price ?");
				selectedProduct.setPrice(sc.nextDouble());
			}
			dao.updateProduct(selectedProduct, pid);
			adminMainMenu();
			break;
		case 5:
			System.out.println("Which Product do you want to delete ?");
			dao.deleteProduct(sc.nextInt());
			adminMainMenu();
		case 6:
			dao.back();
			break;
		default:
			System.out.println("Please select your choice range 1-6 only");

		}
	}

	public static void customerMainMenu() {
		System.out.println("------------------------------");
		System.out.println("|    CUSTOMER MAIN MENU       |");
		System.out.println("------------------------------");
		System.out.println("|   1. VIEW PRODUCT          |");
		System.out.println("|   2. VIEW ALL PRODUCTS     |");
		System.out.println("|   3. BILL                  |");
		System.out.println("|   4. BACK                  |");
		System.out.println("------------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Enter Your Search Product Id?");
			Product product = dao.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-----------------------------------------");
			System.out.println(product);
			customerMainMenu();
			break;
		case 2:
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("-----------------------------------------");
			List<Product> products = dao.viewAllProducts();
			for (Product p : products) {
				System.out.println(p);
			}
			customerMainMenu();
			break;
		case 3:
			dao.bill();
			customerMainMenu();
			break;

		case 4:
			dao.back();
			break;
		default:
			System.out.println("Please select your choice range 1-4 only");

		}
	}

}
