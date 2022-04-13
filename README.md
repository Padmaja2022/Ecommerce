# Ecommerce is a repository in the Github.
Description   creating abstract EEcommerce class, Creating constructors, getting  getters and setters
Made the Product class as abstract class
Product will have only 3 attributes – name, price and quantity. 
These attributes are inherited by all of the subclasses,Select the access modifier accordingly.
By providing getters and setters for attributes made as public.
Product classvwill have only one constructor that will set all 3 attributes.
By creating a toString() for each of the subclass that inherits from Product.
buy() method will still be Product’s instance method.
Product class will have an abstract method called getDetails() that will not take any parameters and not return anything.
Created classes where Apparel extends Product,Bath extends Product,Book extends Product which inherits from product class.
 In the Class shop  created product inventory and display menu method which displays all the product details.
 use the scanner class by user input call the display menu method to enter the product they want to buy.
 By using try catch method with handling exception.
 The functionality of the this project displays the following output.
 
 OUTPUT:
 Product Index is: 0 : My First Java Book
Product Index is: 1 : My Java Book
Product Index is: 2 : Long Sleeve
Product Index is: 3 : Scrubbers
enter the product index (0 to 4)you want to buy:
1
29.99
Product Index is: 0 : My First Java Book
Product Index is: 1 : My Java Book
Product Index is: 2 : Long Sleeve
Product Index is: 3 : Scrubbers
enter the product index (0 to 4)you want to buy:
4
Thank you for shopping with us! the totalAmount is:29.99
