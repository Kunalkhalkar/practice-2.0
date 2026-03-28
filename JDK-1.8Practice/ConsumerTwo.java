/*
Take a exmaple of JDK 1.8 
use Consumer functional interface  and accept the value and then print its Square
*/
import java.util.function.*;
import java.util.*;

public class ConsumerTwo{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the Square");
		int a = sc.nextInt();
		
		//Anonumous Inner Class Syntax
		Consumer<Integer> cm = new Consumer<>(){
			public void accept(Integer i){ // always remember we need implement the method with public access specifier
				System.out.println("Square is : "+ i * i);
			}
		};
		cm.accept(a);
	}
}