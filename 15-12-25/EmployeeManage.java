/*1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
The manager gets a 20% bonus on salary.


The developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
*/	
import java.util.*;
class Employee{
	private String name;
	private double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	void calculateBonus(){
		this.salary = salary;
	}
	
}

class Manager extends Employee{
	Manager(Strig name, double salary){
		super(name, salary);
	}
	
	void calculateBonus(){
		this.salary = salary * 1.20;
	}
}

class Developer extends Employee{
	Developer(String name, double salary){
		super(name, salary);
	}
	
	void calculateBonus(){
		this.salary = salary * 1.10;
		
	}
}

public class EmployeeManage{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name and salary of manager");
		String name = sc.nextLine();
		double salary = sc.nextDouble();
		
		Employee m = new Manager(name, salary);
		m.calculateBonus();
		
		System.out.println("Enter the name and salary of developer");
		name = sc.nextLine();
		salary = sc.nextDouble();
		m = new Developer(name, salary);
		m.calculteBonus();
	}
}