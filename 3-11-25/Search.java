/*2.Search for an Element (Linear Search)
Concept: Traverse array linearly and compare each value with the target.
  
arr = [10, 20, 30, 40, 50]
Enter search key  : 30
Output: value found
Enter search key: 300
Output: value not found 
*/
import java.util.*;
public class Search{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element");
		int []a = new int[5];
		
		for(int i=0; i< a.length; i++){
			a[i]= sc.nextInt();
		}
		
		System.out.println("Enter search elment");
		int s = sc.nextInt();
		boolean flag = true;
		for(int i=0; i<a.length; i++){
			if(a[i] == s){
				System.out.println(s+" Element found");
				flag=false;
				break;
			}
		}
		if(flag){
				System.out.println("Element not found");
			}
	}
}