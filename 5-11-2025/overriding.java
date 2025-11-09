/*Q5. Write Program to perform method overriding you have to create class name as ArrParent with method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input sequence
You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and you have to create one more class name ReverseArray and override arrangeSeq() method from ArrParent and reverse array and display it.
*/
import java.util.*;
public class overriding{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array element");
		for(int i= 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		ArrParent ap = new ArrParent();
		ap.setValue(arr);
		ap.arrangeSeq();
		ArrangeAscendingOrder ao = new ArrangeAscendingOrder();
		ao.setValue(arr);
		ao.arrangeSeq();
		ReverseArray ra = new ReverseArray();
		ra.setValue(arr);
		ra.arrangeSeq();
	}
}

class ArrParent{
	int []arr;
	void setValue(int [] arr){
		this.arr = arr;
	}
	
	void arrangeSeq(){
		for(int val:arr){
			System.out.print(val +" ");
		}
		System.out.println();
		
	}
}

class ArrangeAscendingOrder extends ArrParent{
		void arrangeSeq(){
			int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
			if(arr[j] < arr[i]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
		for(int val:arr){
			System.out.print(val+" ");
		}
		System.out.println();
	
}
}
class ReverseArray extends ArrParent{
	void arrangeSeq(){
		int temp;
		for(int i=0,j=(arr.length-1); i<arr.length/2; i++,j--){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int val:arr){
			System.out.print(val +" ");
		}
		System.out.println();
		
	}
}