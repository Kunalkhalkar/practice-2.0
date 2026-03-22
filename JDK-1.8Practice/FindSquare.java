/*
Q. Write a Functional interface to show the square of any number 
*/
import java.util.*;
public class FindSquare{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the Square");
		int n = sc.nextInt();
		
		Square sq = (int s) -> s*s;
		
		System.out.println(sq.calSquare(n));
		
		/*OR*/
		
		//System.out.println(((Square)(int d)-> d*d).calSquare(n));
	}
}

interface Square {
	int calSquare(int n);
}