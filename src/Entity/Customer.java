package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.Constraint;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.validator.constraints.Range;

import Utility.HibernateUtility;

@Entity
public class Customer {

	
	//  ***************FIELDS*********************

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;


	@NotBlank
	protected String name;
	private int customerID;
	@NotBlank
	protected String address;
	@NotBlank
	protected String email;
	@NotBlank
	protected String password;
	@NotBlank
	private String phoneNumber;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	Set<Product> products;
	
	//  ***************CONSTRACTERS*********************
	
	public Customer() {}

	public Customer(int customerID,String name,String address,String phoneNumber,String email) 
	{
		this.name=name;
		this.customerID=customerID;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.email=email;
//		this.products=new HashSet<>();
	}
	
	public Customer(int customerID,String name,String address,String phoneNumber)
	{
		this.name=name;
		this.customerID=customerID;
		this.address=address;
		this.phoneNumber=phoneNumber;
//		this.products=new HashSet<>();
	}
	
	//  ***************BUSSINESS LOGIC METHODS*********************

		
	
	public void addNewCustomer(Customer customer) {
		Session session= HibernateUtility.getSesstionFactory().openSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}
	
	public static boolean checkIfExist(String email, String phoneNumber) {
		//hibernate
		Session session= HibernateUtility.getSesstionFactory().openSession();
		session.beginTransaction();
		
		// Create CriteriaBuilder
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
		Root<Customer> root = criteria.from(Customer.class);
		criteria = criteria.where(builder.equal(root.get("email"), email));
		Query q = session.createQuery(criteria);
		try
		{
			int result = q.getResultList().size();
			if(result > 0) return true;
				criteria = criteria.where(builder.equal(root.get("phoneNumber"), phoneNumber));
				q = session.createQuery(criteria);
				result = q.getResultList().size();
				if(result > 0) return true;
		}
		catch(Exception test) {
			System.out.println("exception in checkIfExist Method !!!!!!!!"+test.getMessage());
			return true;
		}
		session.getTransaction().commit();
		session.close();
		return false;
	}
	
	public static boolean checkForLogin(String emailSignIn, String passwordSignIn) {
		Session session= HibernateUtility.getSesstionFactory().openSession();
		session.beginTransaction();
		CriteriaBuilder build = session.getCriteriaBuilder();
		CriteriaQuery<Customer> crit = build.createQuery(Customer.class);
		Root<Customer> root = crit.from(Customer.class);
	try {
		List<Customer> test;
		crit = crit.where(build.equal(root.get("email"), emailSignIn));
		Query q = session.createQuery(crit);
		int result = q.getResultList().size();
		if(result > 0)
		{
			test = q.getResultList();
			if(test.get(0).password.equals(passwordSignIn))
				return true;
		}

		}catch(Exception e) {
		System.out.println("Exception in checkForLogin Method" + e.getMessage());
		}
	
		session.getTransaction().commit();
		session.close();
		return false;
	}
	
	public String getNameFromDB(String emailSignIn) {
		String nameFromDB = null;
		Session session= HibernateUtility.getSesstionFactory().openSession();
		session.beginTransaction();
		CriteriaBuilder build = session.getCriteriaBuilder();
		CriteriaQuery<Customer> crit = build.createQuery(Customer.class);
		Root<Customer> root = crit.from(Customer.class);
	try {
		List<Customer> test;
		crit = crit.where(build.equal(root.get("email"), emailSignIn));
		Query q = session.createQuery(crit);
		test = q.getResultList();
		nameFromDB = test.get(0).name;
		}catch(Exception e) {
			System.out.println("exception in getNameFromDb" + e.getMessage());
		}
		return nameFromDB;
	}

	
	
//	public void addProductToCustomer(Product addProduct)
//	{
//		this.products.add(addProduct);
//	}
//	
//	public Set<Product> getProductFromCustomer(){
//		return this.products;
//	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", customerID=" + customerID + ", address=" + address
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	//  ***************SETTERS & GETTERS*********************

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setPhoneNumber(String phonenumber) {
		this.phoneNumber=phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}






}
