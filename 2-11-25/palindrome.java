/*
Q14. Write a java program to check whether a number is palindrome or not.*/
import java.util.*;
public class palindrome{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to check palindrome");
		int  pal = sc.nextInt();
		int ans =0;
		int digit =0;
		int temp = pal;
		while(pal > 0)
		{
			digit = pal%10;
			ans = ans * 10 + digit;
			pal /=10;
		}	
		
		if (temp == ans)
		{
			System.out.println("number is palindrome");
		}else{
			System.out.println("Not palindrome");
		}
		}
}
