/*study plan
Q21. Write a Java program to reverse a number using loop.
Input a number: 123 Reverse number: 321

*/
public class reverseNum{
	public static void main(String x[]){
		int num = 1143, rev =0;
		
		while(num != 0){
			rev = (rev * 10) + (num % 10);
			num/=10;
		}
		System.out.println(rev);
	}
}