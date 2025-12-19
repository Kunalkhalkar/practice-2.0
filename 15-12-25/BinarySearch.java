/* Q4. Perform binary search to find the index of a given key in a sorted array. 
 If the key is not found, print -1. 
Example: 
 Input: 
 arr = {2, 4, 6, 8, 10, 12} 
 key = 10 
 Output: Index = 4
 */
 public class BinarySearch{
	public static void main(String ...x){
		int a[] = new int[]{2, 4, 6, 8, 10, 12, 11111111};
		int i=0, j=a.length-1, mid = (i + j)/2;
		int key = 11;
		boolean flag = false;
		while(i <= j){
			if(a[mid] == key){
				System.out.println("index = " +mid);
				flag = true;
				break;
			}
			else if(key > a[mid]){
				i = mid+ 1;
				mid = i+(j-i)/2;
			}
			else if(key < a[mid]){
				j = mid	-1;
				mid = i+(j-i)/2;
			}
		}
		if(!flag){
				System.out.print("index = "+ -1);
		}
		
	}
 }