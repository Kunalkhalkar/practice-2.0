/*Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
(Using ternary operator)
*/
import java.util.*;
public class Divisible{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check number is divisible by 5 or 11");
		
		int num = sc.nextInt();
		String str = num % 5 == 0 && num % 11 ==0 ? "divided by both" : "not devided by both";
		System.out.println(str);
	}
}