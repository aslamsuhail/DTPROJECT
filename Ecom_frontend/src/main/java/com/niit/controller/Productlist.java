package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.niit.Ecom_backend.DAO.ProductDAO;

@Controller
public class Productlist {

	@Autowired
	 ProductDAO product;
	
}


