package Entity;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import Utility.HibernateUtility;

public class Auth {
	
	Session session= HibernateUtility.getSesstionFactory().openSession();
	
	public Auth() {
	session.beginTransaction();
	}
	
//	public String CheckForLogin(String username,String password) {
		
//		TypedQuery<Customer> q=session.createQuery("from Customer as customer where customer.name=:name and customer.id=:id",Customer.class);
//		q.setParameter("name", username);
//		List<Customer> result=q.getResultList();
//	
//		session.getTransaction().commit();
//		session.close();

	}

	
// }
