/*2.Write program to input number using Scanner class and reverse it?
*/
import java.util.*;
public class reverseNum{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse it");
		int num = sc.nextInt();
		int rev=0;
		while(num!=0){
		int digit = num % 10;
		rev = rev*10+digit;
		num/=10;
		}
		System.out.println(rev);
	}
}