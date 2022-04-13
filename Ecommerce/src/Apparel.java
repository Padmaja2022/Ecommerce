/*
 * 
 * Author padmaja
 * date  3/11/2022
 * 1) Private attributes 
• char size 
• String color 
2) Constructor will take name, price, quantity, size and color 
3) getDetails() will print “We sell different kinds of business clothes for both men and 
   women
 * 
 */
public class Apparel extends Product{
//declaring attributes
	private char size;
	private String color;
//constructors
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}
	//overriding a method
	@Override
	public void getDetails() {
		System.out.println("We sell different kinds of business cloths for both men and women");

	}









}
