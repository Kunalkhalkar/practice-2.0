/*Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
*/
import java.util.*;
public class Majority{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		
		int a[] = new int[8];
		for(int i= 0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		LinkedHashMap map = new LinkedHashMap();
		for(int i = 0; i<a.length; i++){
		Integer count = (Integer)map.get(a[i]);			
			if(count == null){
				count = 0;
			}
			count++;
			map.put(a[i], count);
		}
		System.out.println("key \t value");
		
		 Set<Map.Entry> m = map.entrySet();
		// Map.Entry<Integer, Integer> m = map.entrySet();
		
		for(Map.Entry obj:m){
			if((Integer)obj.getValue() >= (a.length/2)){
				System.out.println((Integer)obj.getKey() + " \t " +(Integer)obj.getValue());
			}
		}
		
	}
}
