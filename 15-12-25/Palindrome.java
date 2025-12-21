/*
Write a program to check whether a given number is a palindrome using recursion.
*/
import java.util.*;
public class Palindrome{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check the palindrome");
		int num = sc.nextInt();
		
		int pal = palindrome(num, 0);
		if(pal == num){
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("Number is Not Palindrome");
		}
	}
	public static int palindrome(int num, int rev){
		if(num == 0)
			return rev;
		rev = rev*10+num%10;
		return palindrome((num/10), rev);
	}
}