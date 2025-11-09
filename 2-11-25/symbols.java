/*3.Write program to character from keyboard and check character is alphabet digit or special symbols?*/
import java.util.*;
public class Symbols{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number, Symbol or Special charactor");
		String val = sc.next();
		if((int)val > 57 && (int)val <64){
			System.out.printlnn("Special charactor");
		}
		else if(((int)val > 65 && (int)val < 90)|| ((int)val > 96 && (int)val < 122))
		{
			System.out.println("alphabets");
		}
		else if((int)val > 47 && (int)val< 58)
		{
			System.out.println("digit");
		}
		else{
			System.out.println("error to identify");
		}
	}
}