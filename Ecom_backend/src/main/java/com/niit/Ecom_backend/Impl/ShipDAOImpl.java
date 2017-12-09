package com.niit.Ecom_backend.Impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Ecom_backend.DAO.ShipDAO;
import com.niit.Ecom_backend.Model.ProductModel;
import com.niit.Ecom_backend.Model.ShipModel;


@Repository
public class ShipDAOImpl implements ShipDAO
{

	 @Autowired
		private SessionFactory sessionFactory;
	 public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}
	public void addCus(ShipModel s1)
	{
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(s1);
		s.getTransaction().commit();
		s.close();
		
	}

	public List<ShipModel> getId(int cusid)
	{
	
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		//Query query =s.createQuery("from ShipModel where cusid="+cusid+"");      
		List<ShipModel> results =s.createQuery("from ShipModel where cusid="+cusid).list(); 
		//List<ShipModel> list=query.list();
		//System.out.println(list);
		s.getTransaction().commit();
		return results;	
	}
	
	

	public void update(ShipModel s) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	public  List<ShipModel> getAll() {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Query query =s.createQuery("from ShipModel");      
		//List<ShipModel> results =s.createQuery("from ShipModel where cusid="+cusid).list(); 
		List<ShipModel> list=query.list();
		System.out.println(list);
		s.getTransaction().commit();
		return list;
		//return null;
	}

	
	public List<ShipModel> getFilterProducts(int cusid)
	{
		Session s=sessionFactory.openSession();
		
		List<ShipModel> results =s.createQuery("from ShipModel where cusid="+cusid).list();
		s.close();
		// TODO Auto-generated method stub
		return results;
	}
	public ShipModel findById(int id) {
		return (ShipModel)sessionFactory.openSession().get(ShipModel.class,id);
	}
}
