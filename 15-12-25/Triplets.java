/*

2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4] 
Output: (-1, 0, 1), (-1, -1, 2)

*/
import java.util.*;
public class Triplets{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element");
		
		int a[] = new int[6];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				for(int k = j+1; k<a.length; k++){
					if((a[i] + a[j] + a[k]) == 0){
						System.out.printf("[%d], [%d] ,[%d] \n", i, j, k);
					}
				}
			}
		}
		
		
	}
}