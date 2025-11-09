/*Q1. Write program to create class name as Factorial with two functions
       void setValue(int x): this function accept number as parameter
      int getFactorial(): this function can calculate factorial of number and return it.
*/
import java.util.*;
public class FindFact{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int y=sc.nextInt();
		Factorial fc = new Factorial();
		fc.setValue(y);
		System.out.println(fc.getFactorial());		
	}
}
class Factorial{
	int x;
	void setValue(int x){
		this.x = x;
	}
	int fact=1;
	int getFactorial(){
	for(int i=1; i<=x; i++){
		fact *=i;
	
	}
	return fact;
}
}
