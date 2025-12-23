/*Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7
 */
 import java.util.*;
 public class RepeatNum{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		int []a = new int[5];
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		LinkedHashMap lh = new LinkedHashMap();
		for(int i = 0; i<a.length; i++){
			Integer count = (Integer)lh.get(a[i]);
			
			if(count == null){
				count =0;
			}
			++count;
			lh.put(a[i], count);
		}
		Set<Map.Entry> m= lh.entrySet();
		System.out.println("Duplicated value \nvalue \t repeats");
		for(Map.Entry e : m){
			if((int)e.getValue() > 1){
				System.out.println(e.getKey() + " \t " +e.getValue());
			}
		}
	}
 }