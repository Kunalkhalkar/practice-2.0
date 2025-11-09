/*1. Average of Elements
Concept: First compute the sum, then divide by the number of elements.
 arr = [10, 20, 30, 40, 50]
Average of array elements: 30.0
*/
import java.util.*;
public class AverageArray{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element");
		int [] array = new int[5];
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
		}
		int sum = 0;
		for(int val:array){
			sum+=val;
		}
		System.out.println((double)sum / (array.length));
	}
}