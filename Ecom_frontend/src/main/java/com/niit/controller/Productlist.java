package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Ecom_backend.DAO.ProductDAO;
import com.niit.Ecom_backend.Model.ProductModel;


@Controller
public class Productlist
{
	@Autowired
	 ProductDAO product;
	@RequestMapping(value ="/admin/productlistview")
	  public ModelAndView getlist() 
	   {
			ModelAndView mv=new ModelAndView("productlistview");
			List<ProductModel>slist=product.getAll();
			mv.addObject("slist",slist);
		    return mv;
	   }
		 
}