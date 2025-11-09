/*Q6.Write a program to create a base class Shape with method setDimensions(int,int).
Create three child classes:

Rectangle → method getArea() → returns area

Triangle → method getArea() → returns (base * height) / 2

Square → method getArea() → returns side * side (only one value needed)
*/
import java.util.*;
public class FindArea{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter length and breadth");
		int length = sc.nextInt();
		int breadth= sc.nextInt();
		//Shape s= new Shape();
		Rectangle r = new Rectangle();
		r.setDimensions(length, breadth);
		System.out.println(r.getArea());
		
		Triangle t = new Triangle();
		System.out.println("Enter the base and height");
		t.setDimensions(sc.nextInt(), sc.nextInt());
		System.out.println(t.getArea());

		
		System.out.println("enter the side of square");
		Square s = new Square();
		s.setDimensions(sc.nextInt(),0);
		System.out.println(s.getArea());
	}
}
class Shape{
	int x;
	int y;
	
	void setDimensions(int x, int y){
		this.x = x;
		this.y = y;
	}	
}

class Rectangle extends Shape{
	int getArea(){
		return x*y;
	}
}

class Triangle extends Shape{
	double getArea(){
		return (x*y)/2.0;
	}
}

class Square extends Shape{
	int getArea(){
		return x*x;
	}
}