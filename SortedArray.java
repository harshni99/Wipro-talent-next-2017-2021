import java.util.*;
public class SortedArray
{
	public static void main(String[] args) {
	   System.out.println("enter the array limit:");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   System.out.println("enter the array elements:");
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
	       arr[i]=sc.nextInt();
	   }
	   System.out.println("the sorted array is:");
	    Arrays.sort(arr);
	    for(int j=0;j<n;j++)
	    {
	        System.out.println(arr[j]);
	    }
	}
}
