/*Q2. Write program to create class name as CheckChar with two functions
        void setChar(char ch): this function accept single character as input
      boolean checkChar(): this function can check character is alphabet or digit of special     symbol if
     character is alphabet or digit return true if character is digit then return false.
*/
import java.util.*;
public class charcheck{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the charactor");
		char ch = sc.next().charAt(0);
		CheckChar ck = new CheckChar();
		ck.setChar(ch);
		System.out.println(ck.checkChar());
	}
}
class CheckChar{
	char ch;
	void setChar(char ch){
		this.ch = ch;
	}
	
	boolean checkChar(){
		if ((int)ch > 95 && (int)ch < 123 || (int)ch > 65 && (int)ch < 90|| (int)ch > 47 && (int)ch < 58)
			return true;
		else
			return false;
	}
	
}