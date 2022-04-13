/*
 * Author    Padmaja
 * Date    3/11/20222
 * description   creating book child class with  product class
 * 1) Book will have its own set of private attributes 
• String author 
• String genre 
• String isbn 
2) Create a constructor that will take name, price, quantity, author and call super 
class’s constructor. You can check your class notes and example programs.
3) Another constructor will take name, price, quantity, author, genre and isbn
4) Book will define the getDetails() method. The method will print “We sell books on 
Software Development
 */
public class Book extends Product {
	//declaring attributes
	private  String author;
	private String genre; 
	private String isbn;
	
	//constructor	
	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
	}
	
//constructor		
	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}


	// method to getdatails 		
	
	public void getrDetails() {

		System.out.println("We sell books on Software Development"); 

	}

	//overriding the method from parent class
	@Override
	public void getDetails() {
		System.out.println("We sell books on Software Development");
		
	}
}