/*
Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets

*/
import java.util.*;
public class MergeArrayList{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in arrayList 1");
		ArrayList al = new ArrayList(); // array list default size 10
		
		for(int i=0; i<10; i++){
			al.add(sc.nextInt());
		}
		
		System.out.println("Enter the element in arrayList 1");
		ArrayList al1 = new ArrayList(); // array list default size 10
		
		for(int i=0; i<10; i++){
			al1.add(sc.nextInt());
		}
		
		Iterator it = al.iterator();// Itereator on al ArrayList
		Iterator it1 = al1.iterator();// Itereator on al1 ArrayList
		
		ArrayList alm = new ArrayList();
		while(it.hasNext()){
				alm.add(it.next());
		}
		
		while(it1.hasNext()){
			Object obj = it1.next();
			if(alm.contains(obj)){
				continue;
			}else
			alm.add(obj);
		}
		Iterator iterate = alm.iterator();
		
		while(iterate.hasNext()){
			System.out.print(iterate.next() +" " );
		}
	
	
	}
}