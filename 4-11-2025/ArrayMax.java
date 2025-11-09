/*Q3. Write program to create class name as FindMax with two functions
       void setArray(int a[]): this function is used for accept array as parameter
       int getMax(): this function can find the max value from array and return it.
*/
import java.util.*;
public class ArrayMax{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		int a[] = new int[5];
		
		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		FindMax fm = new FindMax();
		fm.setArray(a);
		System.out.println(fm.getMax());
	}
}

class FindMax{
	int []a;
	void setArray(int []a){
		this.a = a;
	}
	
	int getMax(){
		int max= a[0];
		for(int val: a){
			if(val > max){
				max = val;
			}
		}
		return max;
	}
}