/*
here is a quetion of 2D array
 WAP to create 3 x 3 matrix and calculate sum of column
 */
import java.util.*;
public class TwoDimArray{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element in array");
		int [] a[] = new int[3][3];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter element in 2nd array");
		int b[][] = new int[3][3];
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("First array");
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Second array");
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("addition of both arrays");
		for(int i=0; i<a.length;System.out.println(), i++)
			for(int j=0; j<a[i].length;  System.out.print((a[i][j]+ b[i][j])+ "\t"),j++){}
			System.out.println();
		
	}
}