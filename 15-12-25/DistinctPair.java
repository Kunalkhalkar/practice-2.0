/*.
Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3

*/
import java.util.*;
public class DistinctPair{
	public static void main(String ...x){
		System.out.println("Enter the array element");
		Scanner sc = new Scanner(System.in);
		int a[] = new int[8];
		for(int i =0; i<a.length; i++){
			a[i] =sc.nextInt();
		}
		int count =0;
	for(int i =0; i<a.length; i++){
		for(int j =i+1; j<a.length; j++){
			if(a[i] - a[j] == 5 || a[i] - a[j] == -5 ){
				System.out.printf("pair is : [%d, %d]\n", a[i], a[j]);
				count++;
			}
		}
	}
		System.out.printf("number of pair is : %d", count);
	
	}
}