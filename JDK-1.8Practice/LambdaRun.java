/*
Lambda java 1.8
*/
import java.util.*;
public class LambdaRun{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		
		Runnable r = () -> {
			for(int i=0; i<10; i++){
				
				System.out.println(i + " ");
				
				try{
				Thread.sleep(1000);
				}
				
				catch(InterruptedException ex){
				System.out.println(ex);
				}
			}
		};
		Thread t = new Thread(r);
		t.run();
	}
}