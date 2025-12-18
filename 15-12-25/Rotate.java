/*Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9
*/
import java.util.*;
public class Rotate{
	public static void main(String ...x){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		int a[] = new int[11];
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("enter the value to rotate array");
		int k = sc.nextInt();
		int i = 0, j=a.length-1;
		while(i < j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		 i=0; j = a.length-1-k;
		while(i<j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		i=a.length-k; j = a.length-1;
		while(i<j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for(i=0; i<a.length; i++){
			System.out.print(a[i]+ "\t");
		}
	}
}