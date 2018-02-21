package Entity;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.Session;

import Utility.HibernateUtility;

public class CustomerSignIn {
	
	@NotBlank
	private String emailSignIn;
	@NotBlank
	private String passwordSignIn;
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailSignIn() {
		return emailSignIn;
	}
	public void setEmailSignIn(String emailSignIn) {
		this.emailSignIn = emailSignIn;
	}
	
	public String getPasswordSignIn() {
		return passwordSignIn;
	}
	public void setPasswordSignIn(String passwordSignIn) {
		this.passwordSignIn = passwordSignIn;
	}
		
	
	//  ***************BUSSINESS LOGIC METHODS*********************

	
	
	
}
