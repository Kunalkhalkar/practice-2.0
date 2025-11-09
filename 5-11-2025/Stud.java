/*Q.8Create a base class Student with a constructor Student(String name, int marks) to store values.
 Create a child class Result that extends Student and has function getGrade() which returns:
"A Grade" if marks ≥ 75
"B Grade" if marks ≥ 50
"Fail" otherwise.
*/
import java.util.*;
public class Stud{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("name and marks");
		String name = sc.next();
		int marks = sc.nextInt();
		Result r = new Result(name, marks);
		System.out.println(r.getGrade());
	}
}

class Student{
	String name;
	int marks;
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}
class Result extends Student{
	Result(String name, int marks){
		super(name, marks);
	}
	String getGrade(){
		if(marks >= 75){
			return "A grade";
		}
		else if(marks >= 50){
			return "B Grade";
		}
		
		return "Fail";
	}
	
}
