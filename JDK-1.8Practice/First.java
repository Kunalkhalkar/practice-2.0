/*JDK 1.8 Practice
Q. create a functional interface write show() method, use lambda to print "Hello NAME".
*/
import java.util.*;
public class First{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		
		String msg = sc.nextLine();
		/*---- This Is Anonymous Inner Class ----*/
		// Printable pr = new Printable(){
			// public void show(){
				// System.out.println("Your msg Is "+ msg);
			// }
		// };
			// pr.show();
			/*---- Let's Do It With a Lamda ----*/
			
		Printable pr = () -> System.out.println("Hello "+ msg);
		pr.show();
	}
}

interface Printable{ //functional interface
	void show();
}