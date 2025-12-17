/* Q52. Write a java program to display following series :
   	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 
		9's cube  8's cube and so on 
		this assignment is from loops
*/
public class Series{
	public static void main(String ...x){
		for(int i=0, j=9; j>=1;System.out.print((i+=2) + "\t" + j*j*j +"\t"),j--){}
	}
}