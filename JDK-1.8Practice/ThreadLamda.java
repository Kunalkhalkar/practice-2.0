/*
Q. Write a program that demonstrate the Runnable interface using lambda
*/
import java.util.*;
public class ThreadLambda{
	public static void main(String ...x) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing the 3's table");
		
		//this two threads not used
		Runnable r =() -> {
			try {
				for(int i=1; i<=10; i++){
					System.out.println(i * 3);
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException ex){
				System.out.println("Exception Occured in thread 1");
			}
		};
		
		Runnable r2 = ()->{
			try{
				for(int i=1; i<=10; i++){
					System.out.println(i*4);
					Thread.sleep(1200);
				}
			}
			catch(InterruptedException ex){
				System.out.println("Exception occured in thread 2");
			}
		};
		
		//Thread t = new Thread(r);
		//Thread t1 = new Thread(r2);
		
		new Thread(() -> {
			try {
				for(int i=1; i<=10; i++){
					System.out.println(i * 3);
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException ex){
				System.out.println("Exception Occured in thread 1");
			}
		}).start();
		
		
		//t.start();
		//t.join();
		//t1.start();
	}
}