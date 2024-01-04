package com.pms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.main.ProductManagement;
import com.pms.model.Product;

public class ProductImpl implements ProductDAO {
	Scanner sc = new Scanner(System.in);
	public static List<Product> originalList = new ArrayList<Product>();
	public static List<Product> tempList = new ArrayList<Product>();
	Product product = null;
	int n = 1;

	@Override
	public void createProduct() {
		while (n == 1) {
			System.out.println("Enter Product Id ?");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name ?");
			String pname = sc.next();
			System.out.println("Enter Product Qty?");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price ?");
			double price = sc.nextDouble();
			product = new Product(pid, pname, qty, price);
			originalList.add(product);
			System.out.println("Do you want to add more products press 1 else any number");
			n = sc.nextInt();
		}
		System.out.println("Successfully Proudcts Created....");

	}

	@Override
	public Product viewProduct(int pid) {
		Product viewProduct = new Product();
		for (Product p1 : originalList) {
			if (p1.getPid() == pid) {
				viewProduct = p1;
				break;
			}
		}
		return viewProduct;
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return originalList;
	}

	@Override
	public void updateProduct(Product updateProduct, int pid) {
		tempList = new ArrayList<Product>();
		for (Product p2 : originalList) {
			if (p2.getPid() == pid) {
				p2.setPname(updateProduct.getPname());
				p2.setQty(updateProduct.getQty());
				p2.setPrice(updateProduct.getPrice());
				tempList.add(p2);
			} else {
				tempList.add(p2);
			}
		}
		originalList = new ArrayList<Product>();
		for (Product p3 : tempList) {
			originalList.add(p3);
		}
		System.out.println("Successfully Product Updated...");

	}

	@Override
	public void deleteProduct(int pid) {
		tempList = new ArrayList<Product>();
		for (Product p4 : originalList) {
			if (p4.getPid() == pid) {
				
			} else {
				tempList.add(p4);
			}
		}
		originalList = new ArrayList<Product>();
		for (Product p5 : tempList) {
			originalList.add(p5);
		}
		System.out.println("Successfully Product Deleted...");

	}

	@Override
	public void bill() {
		System.out.println("Under Development....");

	}

	@Override
	public void back() {
		ProductManagement.main(null);

	}

}
