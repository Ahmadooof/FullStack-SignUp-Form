package com.restaurantname.test;

import org.hibernate.Session;

import Entity.Customer;
import Entity.Product;
import Utility.HibernateUtility;

public class test {

	public static void main(String[] args) {
		
		Session session= HibernateUtility.getSesstionFactory().openSession();
		session.beginTransaction();
		
//		Customer customer=new Customer(3,"Omar","gangbrogatan","0723999999");
//		
//		Product product=new Product("ferf2","Pizza",400);
//		Product product2=new Product("ferergwd","Hamburger",600);
//		Product product3=new Product("qwsdf2","Spagiti",200);
//
//		
//		// example on Many to One RelationShip
////		product.setProduct(customer);
////		product2.setProduct(customer);
////		product3.setProduct(customer);
//		
//		session.save(customer);
		session.getTransaction().commit();
		session.close();
			
	}

}
