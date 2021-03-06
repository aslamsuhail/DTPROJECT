package com.niit.Ecom_backend.DAO;

import java.util.ArrayList;
import java.util.List;

import com.niit.Ecom_backend.Model.ProductModel;
import com.niit.Ecom_backend.Model.ShipModel;


public interface ShipDAO 
{
	//create 
	 	public void addCus(ShipModel s1);
		//read
		public  List<ShipModel>getId(int id);
		//update
		public void update(ShipModel s1);
		//deleted
		public void deleteById(int id);
		//Get All
		public List<ShipModel> getAll();
		
		public ShipModel findById(int id);
		
		public List<ShipModel> getFilterProducts(int cusid);
}
