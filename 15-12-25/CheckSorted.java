/*
4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true

*/
import java.util.*;
public class CheckSorted{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Element");
		int a[] = new int[5];
		boolean flag = false;
		
		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i<a.length-1; i++){
			if(a[i] < a[i+1]){
				flag = true;
			}
			else{
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("Array is sorted");
		}
		else{
			System.out.println("Array is Not Sorted");
		}
	}
}