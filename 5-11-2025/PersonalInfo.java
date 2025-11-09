/*Q4. Write program to Create class name as PersonalInfo with parameterized constructor
PersonalInfo(String name, String middlename, String lastname) and you have to create class name as ProfessionalInfo with parameterized constructor like as ProfessionalInfo(int id,String des,int salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and pass parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have to define void show() method in ProfessionalInfo and you have to show the all data in show() method.
*/
import java.util.*;
public class PersonalInfo{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, middle name, last name");
		String name = sc.next();
		String midName = sc.next();
		String lastName = sc.next();
		
		System.out.println("Enter id, des, salary, skillset");
		int id = sc.nextInt();
		String des = sc.next();
		int salary = sc.nextInt();
		String skillset = sc.next();
		
		ProfessionalInfo pi = new ProfessionalInfo(name,midName,lastName, id, des, salary, skillset);
		pi.show();
	}
}

class PersonalInfos{
	static String name, middleName, lastName;
		PersonalInfos(String name, String middleName, String lastName){
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
	}
}
class ProfessionalInfo extends PersonalInfos{
		static int id,salary;
		static String des, skillset;	
		ProfessionalInfo(String name, String middleName, String lastName, int id,String des,int salary,String skillset){
		super(name, middleName, lastName);
		this.id = id;
		this.des = des;
		this.salary = salary;
		this.skillset = skillset;
	}
	
	void show()
	{
		System.out.println(name+"\t"+middleName+"\t"+lastName+"\t"+id+"\t"+des+"\t"+salary+"\t"+skillset);
	}
}