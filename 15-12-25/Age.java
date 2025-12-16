/*Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
*/
import java.util.*;
public class Age{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		if(age <1 || age > 120){
			System.out.println("Not a Age");
		}
		else if(age < 13){
			System.out.println("child");
		}
		else if(age <19){
			System.out.println("teen ager");
		}
		else if(age<55){
			System.out.println("adult");
		}
		else {
			System.out.println("senior");
		}
	}
}