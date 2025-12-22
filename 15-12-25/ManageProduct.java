/* Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
 */
 import java.util.*;
 public class ManageProduct{
	public static void main(String ...x){
		Scaner sc  = Scanner(System.in);
		System.out.println("Enter the id, name ,price of project");
		int id = sc.nextInt();
		String name = sc.nextLine();
		double price = sc.nextDouble();
		
		Product p = new Electronics(id, name, price);
		p.getFinalPrice();
		
		p = new Clothing(id, name, price);
		p.getFinalPrice();
		
	}
 }