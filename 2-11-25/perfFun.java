//Write a function to check if a number is a perfect number.
import java.util.*;
public class perfFun
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int p = sc.nextInt();
		boolean dec = perfectNum(p);
		System.out.println(dec);
		
	}
	
	public static boolean perfectNum(int n)
	{
		int sum = 0;
		for(int i = 1; i<=n/2; i++)
		{
			
			if(n % i == 0)
			{
				sum += i;
			}
		}
		if (sum == n)
			return true;
		return false;
	}
}