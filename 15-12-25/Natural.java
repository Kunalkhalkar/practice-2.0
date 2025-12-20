/*
Write a program to find the sum of first n natural numbers using recursion.

*/
import java.util.*;
public class Natural{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to printing upto that number");
		int a = sc.nextInt();
		show(1, a);
	}
	
	public static int show(int z, int a){
		if(z == a){
			System.out.print(" "+a);
			return 0;
		}
		System.out.print(z+ " ");
		return (show(z+1, a));
	}
}