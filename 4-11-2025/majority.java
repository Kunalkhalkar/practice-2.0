/*7.Find Majority Element (Occurs > n/2 Times)
Concept: Use count method or Boyer-Moore Voting Algorithm.
 Use Case: Identify the dominating product, preference, etc.
Inut : arr = [2, 2, 1, 1, 2, 2, 2]
Size (n) = 7
Majority element is: 2
*/
import java.util.*;
public class majority{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array elements");
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		int count=0,maxcount=0;
		for(int i=0; i<a.length; i++){
			count=0;
			for(int j=i+1; j<a.length; j++){
				if(a[i] == a[j])
				{
					count++;
				}
				if(count > maxcount && count > (a.length/2)){
					maxcount = count;
				}
			}
		}
	}
}