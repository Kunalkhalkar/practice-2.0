//Q21.  Write a java program to check Number Is Prime Number or Not.
import java.util.*;
public class Prime{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  number to check is it prime or not");
		int a = sc.nextInt();
		boolean flag = true;
		int i = 2;
		int num = a;
		while(i <= Math.sqrt(num)){
			
			if (a % i == 0){	
				flag =false;
				break;
			}	
			i++;
		
		}
			if (flag){
			System.out.println("number is prime");
		}else{
			System.out.println("number is not prime");
		}
		
	}
}