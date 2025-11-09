/*Q5. Write program to create class name as MergeTwoArray with parameterized constructor
      MergeTwoArray(int [],int []): this constructor accept two array as parameter
      int [] getMergeArray(): this function merge two array in third array and return new merged    array
*/
import java.util.*;
public class ArrayMerge{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array Element");
		int a[] = new int[5];
		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter Second Array Element");
		int b[] = new int[5];
				for(int i = 0; i<b.length; i++){
			b[i] = sc.nextInt();
		}
		MergeTwoArray ma = new MergeTwoArray(a, b);
		int[] c = ma.getMergeArray();
		for(int val:c){
			System.out.print(val +" ");
		}
	}
}
class MergeTwoArray{
	int a[] = new int[5],b[]= new int[5];
	int c[] = new int[(a.length + b.length)];
	
	MergeTwoArray(int [] a, int [] b){
		this.a = a;
		this.b = b;
	}
	int [] getMergeArray(){
		for(int i=0,j=b.length; i<a.length; i++,j++){
			c[i]=a[i];
			c[j]=b[i];
		}
		return c;
	}
}