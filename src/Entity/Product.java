package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String productName;
	private int price;
	
// example on Many to One RelationShip
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="Customer_ID")
//	private Customer order;
	
	
	// just for hibernate
	public Product() {}
	
	public Product(String idProduct, String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
// example on Many to One RelationShip
	
//	public void setProduct(Customer newcustomer)
//	{
//		this.order=newcustomer;
//	}
	
	//  **********************************************************************SETTERS & GETTERS**********************************************************************

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
		
}
