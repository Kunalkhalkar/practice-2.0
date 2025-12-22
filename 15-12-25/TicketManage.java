/*
7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.


BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.


Explanation:
 Tests method overriding with percentage-based calculations.
*/
import java.util.*;
public class TicketManage{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of Movie ticket");
		double price = sc.nextDouble();
		Ticket t = new MovieTicket(price);
		System.out.println("movie ticket price is : "+t.calculatePrice());
		
		System.out.println("Enter the price of Bus ticket");
		price = sc.nextDouble();
		t = new BusTicket(price);
		System.out.println("movie bus price is : "+t.calculatePrice());		
		
	}
}
class Ticket{
	protected double price;
	
	Ticket(double price){
		this.price = price;
	}
	
	double calculatePrice(){
		return price;
	}
	
}

class MovieTicket extends Ticket{
	MovieTicket(double price){
		super(price);
	}
	
	double calculatePrice(){
		return price*1.18;
	}
	
}

class BusTicket extends Ticket{
	BusTicket(double price){
		super(price);
	}

	double calculatePrice(){
		return price * 1.05;
	}
}
