package com.niit.Ecom_backend.DAO;

import java.util.List;

import com.niit.Ecom_backend.Model.ProductModel;

public interface ProductDAO 
{
	//create 
			public void addProduct(ProductModel product);

			//read
			public ProductModel getId(int id);
			//update
			public void update(ProductModel product);
			//deleted
			public void delete(ProductModel p);
			//Get All
			public List<ProductModel> getAll();
			
			public ProductModel findById(int id);
		
	}

