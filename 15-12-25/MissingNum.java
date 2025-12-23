/*

5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3

*/
import java.util.*;
public class MissingNum{
	public static void main(String ...x){
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Enter array from starting 1");
		
		if(n > 1){	
		int a[] = new int[n-1];
		int sum=0, aSum = 0;
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}
		Arrays.sort(a);
		for(int i = 1; i <= n; i++){
			aSum += i;
		}
		System.out.println("The Missing number is : "+(aSum - sum));
	}
}
}