/*Q2. Write program to create class name Area with methods name as void setRadius(float   radius) and void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have to define float getCircleArea() method in Circle child class and calculate area of circle and return it and You have to define getRectArea() method in Rectangle class and calculate area of rectangle and return it
*/
import java.util.*;
public class areaInheri{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float radius = sc.nextFloat();
		System.out.println("Enter the length and width of rectangle");
		
		int len = sc.nextInt();
		int wid = sc.nextInt();
		
		Area a= new Area();
		a.setRadius(radius);
		a.setLengthWidth(len, wid);
		System.out.println("area of circle "+new Circle().getCircleArea());
		System.out.println("area of a rectangle "+new Rectangle().getRectArea());
	}
	
}
class Area{
	static float radius;
	static int len;
	static int wid;
	void setRadius(float radius){
		this.radius = radius;
	}
		
	void setLengthWidth(int len, int wid){
		this.len = len;
		this.wid = wid;
	}
}

class Circle extends Area{
	double getCircleArea(){
		return 3.14*(radius*radius);
	}
}
class Rectangle extends Area{
	int getRectArea(){
		return 2*(len * wid);
	}
}

