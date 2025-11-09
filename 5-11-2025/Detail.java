/*Q.7Create a class Person with method setDetails(String name, int age).
Create two subclasses:

Student → method getDetails() → prints student's name & age

Teacher → method getDetails() → prints teacher's name & age
Demonstrate runtime polymorphism using Person reference.

*/
import java.util.*;
public class Detail{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name and age of student");
		String name = sc.next();
		int age = sc.nextInt();
		Student s = new Student();
		s.setDetails(name, age);
		s.getDetails();
		
		System.out.println("enter name and age of student");
		String Tname = sc.next();
		int Tage = sc.nextInt();
		Teacher t = new Teacher();
		t.setDetails(Tname, Tage);
		t.getDetails();	
		
		
	}
}

class Person{
	String name;
	int age;
	void setDetails(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Student extends Person{
	void getDetails(){
		System.out.println("name of student is "+name+" age is "+ age);
	}
}

class Teacher extends Person{
	void getDetails(){
		System.out.println("name of teacher is "+name+" age is "+ age);
	}
}