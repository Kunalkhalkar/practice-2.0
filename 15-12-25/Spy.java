/*
Q26. Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 

Explanation :
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8
*/
import java.util.*;

public class Spy{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check spy");
		int num = sc.nextInt();
		
		int prod = 1, add =0;
		while(num != 0){
			prod *= num % 10;
			add += num % 10;
			num/=10;
		}
		if(add == prod){
			System.out.println("the number is spy");
		}
		else{
			System.out.println("the number not spy");
		}
	}
	
}