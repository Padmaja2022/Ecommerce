/*
 * Author    Padmaja
 * Date    3/11/20222
 * Description   creating abstract EEcommerce class, Creating constructors, getting  getters and setters
 * 1) Product class will become an abstract class
2) Product will now have only 3 attributes – name, price and quantity. These attributes 
are inherited by all of the subclasses. Select the access modifier accordingly. Create 
public getters and setters for these 3 attributes. Remove all other attributes from 
product class. They’ll go into category specific sub classes. 
3) Product will have only one constructor that will set all 3 attributes.
4) Remove toString for Product class. You will be creating a toString() for each of the 
subclass that inherits from Product.
5) buy() method will still be Product’s instance method. Leave it as is.
6) Product class will have an abstract method called getDetails() that will not take 
any parameters and not return anything.
 */
// abstract class
public abstract class  Product {
	//3 attributes – name, price and quantity
	private String name;
	private double price;	
	private int quantity;

	

	// using constructors
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @return the name
	 */
	//Getter and setter methods
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// buy method as declaring getbuy method
	public boolean getbuy() {
		if(this.quantity >0) {

			this.quantity =this.quantity-1;

			return true;

		}else {
			return false;
		}

	}
	//  abstract getdetails method
	public abstract void getDetails();
}
