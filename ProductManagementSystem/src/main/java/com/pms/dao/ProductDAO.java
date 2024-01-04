package com.pms.dao;

import java.util.List;

import com.pms.model.Product;

public interface ProductDAO {
	
	public void createProduct();
	public Product viewProduct(int pid);
	public List<Product> viewAllProducts();
	public void updateProduct(Product product,int pid);
	public void deleteProduct(int pid);
	public void bill();
	public void back();

}
