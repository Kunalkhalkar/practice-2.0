//Q23. Write a java program to Check Number Is Duck Number or Not
import java.util.*;
public class Duck{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check duck or not");
		int  num = sc.nextInt();
		int count =0;
		int temp =num;
		boolean flag = false;
		while (num >0){
			num /=10;
			count++;
		}
		num = temp;
		
		while (count>0){
			int num1 = num%10;
			
			if(num1 ==0){
				flag = true;
				break;
				
			}
			num /= 10;
			count--;
		}
		if(flag){
			System.out.println("number is Duck");
	}else {
		System.out.println("number is not duck");
	}
		
	}
}