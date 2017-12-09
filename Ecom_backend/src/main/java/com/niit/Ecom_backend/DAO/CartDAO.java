package com.niit.Ecom_backend.DAO;

import java.util.List;

import com.niit.Ecom_backend.Model.CartModel;

public interface CartDAO 
{
	 //save
	public void save(CartModel cart);
   //read
		public CartModel getId(int id);
		//update
		public void update(CartModel cart);
		//deleted
		public void delete(CartModel p);
		//Get All
		public List<CartModel> getAll();
		
		public CartModel findById(int id);
		
		public List<CartModel> check(int productid);
}
