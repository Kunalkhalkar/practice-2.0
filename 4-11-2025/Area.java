/*Q4. Write program to create class name as Area with constructor overloading
       Area(float radius): this function can accept radius as input and calculate circle Area
      Area(int len,int width): this function can accept len and width as input and calculate area of rectangle
*/
import java.util.*;
public class CalcArea{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float radius = sc.nextFloat();
		new Area(radius);
		System.out.println("Enter the length and width of ractangle");
		int length= sc.nextInt();
		int width= sc.nextInt();
		new Area(length, width);
	}
}

class Area{
	Area(float r){
			System.out.println((double)(3.14*(r*r)));
		}
		
	Area(int l, int w){
		System.out.println(2*(l*w));
	}
}