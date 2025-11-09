/*Q1. Write a program to create class name as Value with single function name as setValue(int,int) and we have to create three child classes name as Add with function int getAdd() , Mul with function getMul() and Div with function getDiv() and getAdd() function return addition of two value which is inherited from Value class , getMul() function return multiplication of two values which is inherited from Value class and gitDiv() function return division of two values which Is inherited from Value class.
*/
import java.util.*;
public class calculator{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		value v  = new value();
		v.setValue(a, b);
		
		Add ab = new Add();
		//ab.setValue(a, b);
		
		Div d = new Div();
		//d.setValue(a ,b);
		
		Mul m= new Mul();
		//m.setValue(a, b);//child need to call the parent method to setvalue
		
		System.out.println(ab.getAdd());
		System.out.println(d.getDiv());
		System.out.println(m.getMul());
		
	}
}
class value{
	static int a;
	static int b;
	
	void setValue(int a, int b){
		this.a = a;
		this.b = b; 
	}
	
}

class Add extends value{
	int getAdd(){
		return a+b;
	}
}

class Div extends value{
	int getDiv(){
		return a/b;
	}
}

class Mul extends value{
	int getMul(){
		return a*b;
	}
}
