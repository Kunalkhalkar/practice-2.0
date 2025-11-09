/*6.Find All Pairs with Given Sum
Concept: Use nested loops or two-pointer technique to check sums.
 Use Case: Match contributors, tasks, etc., that add up to a budget.
arr = [1, 5, 7, -1, 5]
Target sum (S) = 6
Example: Pairs with sum 6:
(5, 1)
(-1, 7)
(5, 1)
*/
import java.util.*;
public class sum{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		int a[] =new int[5];
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the target addition");
		int target = sc.nextInt();
		boolean flag = true;
		for(int i=0; i<a.length; i++){
			for(int j=i+1;j<a.length; j++){
				if(a[i] + a[j] == target){
					flag=false;
					System.out.printf("a-->[%d]%d, a-->[%d]%d, %d\t",i,a[i],j,a[j],target);
				}
			}
		}
		if(flag){
			System.out.println("no pair found with target " + target);
		}
	}
}