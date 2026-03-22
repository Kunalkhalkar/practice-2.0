/*
* Q. Write a functional interface with generics
*/
import java.util.*;
public class GenricEx{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data you want to print");
		String str = sc.nextLine();
		
		Genics<String> gen = (String data) -> data;
		System.out.println("your data is : '"+ gen.getData(str)+"'");
	}
}

interface Genics<T>{
	
	T getData(T data);
}