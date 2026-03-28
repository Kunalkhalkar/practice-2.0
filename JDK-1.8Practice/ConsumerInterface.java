/*
use Consumer Functional interface that has void accept() method in JDK 1.8

** need to give the generic class for the Consumer Interface
*/
import java.util.*;
import java.util.function.*;
public class ConsumerInterface{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to print");
		String str = sc.nextLine();
		
		((Consumer<String>)(String str1) -> System.out.println("Your entered data is : "+ str1)).accept(str);
	}
}