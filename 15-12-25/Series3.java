/*
Q4.  Write a Java program to display the following series using function recursion. 
7   10   15   22   31   42   55   70
*/
public class Series3{
	public static void main(String ...x){
		System.out.println(show(7, 3));
	}
	
	public static int show(int a, int b){
		if(a==70){
			return a;
		}
		System.out.print(a + " ");
		
		return show((a+b), (b+2));
	}
}