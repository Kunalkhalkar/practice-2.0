/*Q3. Write Program create class name as ArrSum with method void setValue(int arr[]) you have to create child class name as GetSum with method int getArrSum() you have to accept array values from ArrSum and calculate its sum and return it
*/
import java.util.*;
public class arraySum{
	public static void main(String x[]){
		System.out.println("Enter array element");
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i<a.length; i++){
			a[i] =sc.nextInt();
		}
		new ArrSum().setValue(a);
		System.out.println("Array Sum Is "+new GetSum().arrSum());
		
	}
}
class ArrSum{
	static int[] arr;
		void setValue(int []arr){
			this.arr = arr;
		}
}
class GetSum extends ArrSum{
	int arrSum(){
		int sum=0;
		for(int val: arr){
			sum+=val;
		}
		return sum;
	}
}
