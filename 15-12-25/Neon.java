/*
Q24. Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/
import java.util.*;
public class Neon{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numer to check neon or not");
		int num = sc.nextInt();
		int square = num*num;
		int ans = 0;
		while(square !=0){
			ans += square % 10;
			square /= 10;
		}
		
		if(num == ans){
			System.out.println("neon number");
		}
		else
			System.out.println("not a neon number");
	}
}