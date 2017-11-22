package com.niit.Ecom_backend.Impl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Ecom_backend.DAO.CategoryDAO;
import com.niit.Ecom_backend.Model.CategoryModel;

@Repository 
public class CategoryDAOImpl implements CategoryDAO
{
	 @Autowired
		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}
	


	public List<CategoryModel> getAll() 
	{
		
		//@SuppressWarnings("unchecked")
		
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			Query query =s.createQuery("from CategoryModel");        
			List<CategoryModel> list=query.list();
			System.out.println(list);
			s.getTransaction().commit();
			return list;
		
	}

	
	
		
	public CategoryModel findById(int id) 
	{
		
		CategoryModel c=(CategoryModel)sessionFactory.openSession().get(CategoryModel.class, id);
		return c;
	}



	public void addCategory(CategoryModel category1) {
		// TODO Auto-generated method stub
		
	}



	public CategoryModel getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	public void update(CategoryModel category) {
		// TODO Auto-generated method stub
		
	}



	public void deleteById(int id) { 
		
	}
}