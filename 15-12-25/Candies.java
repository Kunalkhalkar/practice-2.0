/*Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is the number of minimum candies that must be inside JAR ever.
Example 1:  	(N = 10, k =< 5)
• Input Value - 3
• Output Value - NUMBER OF CANDIES SOLD : 3
-        NUMBER OF CANDIES AVAILABLE : 7
Example :    	(N=10, k<=5)
• Input Value - 0
• Output Value - INVALID INPUT
-        NUMBER OF CANDIES LEFT : 10
*/
import java.util.*;
public class Candies{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of candies available");
		int n = sc.nextInt(); // we will assign candies according to user
		if(n ==0){
			System.out.println("Enter the coorect value");
		}
		else{
		int k = 5;
		
		System.out.println("Enter the candies sold");
		int v= sc.nextInt();
		
		if( v == 0){
			System.out.println("Invalid Input");
		}
		else if((n - v) <= k){
			System.out.println("Can't sold candies");
		}
		else{
			n -= v;
			System.out.println("candies left : "+n);
		}
		}
	}
}