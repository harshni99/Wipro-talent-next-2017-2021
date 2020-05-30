import java.util.*;
public class FindingElement
{
	public static void main(String[] args) {
	int i,find,index=0;
	boolean flag=false;
	System.out.println("enter the limit of array:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("enter the array elements:");
	int arr[]=new int[n];
	for(i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	System.out.println("enter the element to find:");
	find=sc.nextInt();
	for(i=0;i<n;i++)
	{
	    if(arr[i]==find)
	        index=i;
	        flag=true;
	}
	if(flag==true)
	    System.out.println("element found at position "+index);
	else
	    System.out.println("output="+-1);
	}
}
