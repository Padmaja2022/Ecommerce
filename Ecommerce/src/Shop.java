import java.util.Scanner; 
/* 
 * 
 * Author    Padmaja
 * Date ; 3/7/20222
 * description ; Creating an  Product array  and Implementing in main method
 */
public class Shop {




	//declaring static double total amount

	static double totalAmount =0.00;

	static Product [] inventory = {new Book ("My First Java Book", 11.99, 200, "Pooja Purohit", "Fiction", "123SECVE12345"),
			new Book ("My Java Book",29.99, 400, "Maleeha"),
			new Apparel("Long Sleeve", 10.99, 500, 'L', "Pink"),
			new Bath("Scrubbers", 5.99, 1000)};


	public static void displayMenu(){

		String menu = "new Book[0]\n" + "new  Book[1]\n" +" new Apparel[2]\n" + "new Bath[3]\n" ;
		//System.out.println("displayMenu");

		for (int i =0; i<inventory.length;i++) {
			//System.out.println("Product Index:" + inventory[i].getName() );
			
			System.out.println( "Product Index is: "   + i   + " : "  + inventory[i].getName());
			
			
		}

	}

	//Main method starts
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//declaring variables
		int userInput; 
		int quantity;

		do {

			displayMenu(); // method
			System.out.println("enter the product index (0 to 4)you want to buy:");
			userInput = sc.nextInt();

			if (userInput >= 0 && userInput <4) {
				Product p = inventory[userInput];
				// Handling try catch
				try { //implementing try
					p. getbuy();				
					totalAmount = totalAmount + p.getPrice();
					System.out.println(totalAmount);					
				} catch(ArrayIndexOutOfBoundsException e) { //handling exception
					System.out.println(e.getMessage());
					break;
				}
			}

		}while(userInput >=0 && userInput <4);
		//do loop ends	

		System.out.println("Thank you for shopping with us! the totalAmount is:" + totalAmount);
		

		sc.close();
	
	}//main ends

}//class ends