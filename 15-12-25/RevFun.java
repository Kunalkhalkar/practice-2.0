/*
Write a function reverseNumber(int n) that returns the reverse of a given number.


Example: Input 456 → Output: 654.
*/
import java.util.*;
public class RevFun{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int a = sc.nextInt();
		System.out.println(rev(a));
	}
	public static int rev(int a){
		int rev = 0;
		while(a != 0){
			rev = rev *10 + (a %10);
			a/=10;
		}
		return rev;
	}
}