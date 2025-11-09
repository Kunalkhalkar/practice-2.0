/*4.Reverse an Array
Concept: Swap elements from both ends moving toward the center.
 Use Case: Invert order of operations or list of commands.
Example: arr = [10, 20, 30, 40, 50]
Reversed array: [50, 40, 30, 20, 10]
*/
import java.util.*;
public class reverseArray{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elment");
		int a[] = new int[5];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}	
		int temp;
		for(int i = 0, j=a.length-1; i < a.length/2; i++,j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		for(int val:a){
			System.out.print(val+" ");
		}
	}
}