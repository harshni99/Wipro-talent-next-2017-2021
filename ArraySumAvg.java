import java.util.*;
public class ArraySumAvg
{
	public static void main(String[] args) {
		System.out.println("enter the array limit:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0,avg;
		System.out.println("the array elements are:");
		for(int i=0;i<n;i++)
		{
		 arr[i]=sc.nextInt();
		 sum=sum+arr[i];
		}
		avg=sum/n;
		System.out.println("sum is:"+sum);
		System.out.println("the average is:"+avg);
	}
}
