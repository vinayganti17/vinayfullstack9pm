package com.pms.main;

import java.util.Scanner;

import com.pms.menus.ProductMenus;

public class ProductManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("|     PRODUCT MANAGEMENT SYSTEM     |");
			System.out.println("-------------------------------------");
			System.out.println("|   1. ADMIN                        |");
			System.out.println("|   2. CUSTOMER                     |");
			System.out.println("|   3. EXIT                         |");
			System.out.println("--------------------------------------");
			System.out.println("Enter Your choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				ProductMenus.adminMainMenu();
				break;
			case 2:
				ProductMenus.customerMainMenu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please select your choice range 1-3 only");
			}
		}

	}

}
