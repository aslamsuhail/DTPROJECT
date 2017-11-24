package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Ecom_backend.DAO.CategoryDAO;
import com.niit.Ecom_backend.DAO.ProductDAO;
import com.niit.Ecom_backend.Model.CategoryModel;
import com.niit.Ecom_backend.Model.ProductModel;

@Controller

public class homecontroller 
{
	
   		
	
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	ProductDAO products;
	@Autowired
	private ProductDAO productDAO;
	
	 	
@RequestMapping(value="/")
public ModelAndView indexpage()
{
	  List<CategoryModel> clist=categoryDAO.getAll();
       ModelAndView mt=new ModelAndView("index");
   	 mt.addObject("list",clist);
   	
	return mt;
}
@RequestMapping(value="/login")
public ModelAndView signin()
{
	ModelAndView lg=new ModelAndView("signin");
	return lg;
}
@RequestMapping(value="/reg")
public ModelAndView signup()
{
 ModelAndView sp=new ModelAndView("signup");
 return sp;
}

@RequestMapping(value="/admin/product_edit")

public ModelAndView editProducts(HttpServletRequest request){	
int id=Integer.parseInt(request.getParameter("id"));

List<CategoryModel> list=categoryDAO.getAll();
ModelAndView mv=new ModelAndView("productEdit");
mv.addObject("product",products.findById(id) );	
mv.addObject("slist", list);

return mv;
}
  @RequestMapping(value = "/admin/product_update", method = RequestMethod.POST)
  public  ModelAndView updateProduct(@RequestParam("file") MultipartFile file ,HttpServletRequest request) 
  { 

  	int id=Integer.valueOf(request.getParameter("id"));
  	String pname=request.getParameter("pname");
  	int price=Integer.valueOf(request.getParameter("price"));
  	int cid=Integer.valueOf(request.getParameter("cid"));
 // 	int sid=Integer.valueOf(request.getParameter("sid"));
  //	System.out.println(id+"-"+pname+"-"+price+"-"+cid+"-"+sid);
  	CategoryModel c=categoryDAO.findById(cid);
  	//SupplierModel s=supplierDAO.findById(sid);
  	//product2.addProduct(new ProductModel(id,pname,price,c,s));
  	
      ProductModel p=new ProductModel();
      p.setCategoryid(c);
      p.setProductname(pname);
      p.setProductprice(price);
      p.setProductid(id);
      String originalfile = file.getOriginalFilename();
      p.setP_image(originalfile);
      //p.setSuplierid(s);
      products.update(p);
      String filepath = request.getSession().getServletContext().getRealPath("/");
      
      System.out.println(filepath+originalfile);
      try {
      	byte imagebyte[] = file.getBytes();
      	BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"/resources/product/"+originalfile));
      	fos.write(imagebyte);
      	fos.close();
      	} catch (IOException e) {
      	e.printStackTrace();
      	} catch (Exception e) {
      	// TODO Auto-generated catch block
      	e.printStackTrace();
      	}

  	ModelAndView mv = new ModelAndView("Adding");
  	
  	return mv;
     
  }	
  @RequestMapping(value="/admin/product_delete")
  public ModelAndView deleteProduct(HttpServletRequest request){
  	
  	ProductModel p=productDAO.findById(Integer.valueOf(request.getParameter("id")));
  	System.out.print(p);
      productDAO.delete(p);
      List<ProductModel> list=productDAO.getAll();
      ModelAndView mv = new ModelAndView("Adding");	
      mv.addObject("slist",list);
     return mv;
  }

}

