import java.util.*;
import java.io.*;
public class Star
{
	public static void main(String[] args) {
		System.out.println("Enter the string 1:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		int temp=0;
		for(int i=0;i<len;i++)
		{
		    if(str.charAt(i)=='*')
		    {
		        temp=i;
		    }
		}
		for(int j=0;j<temp-1;j++)
		{
		    System.out.print(str.charAt(j));
		}
		for(int k=temp+2;k>temp;k++)
		{
		    System.out.print(str.charAt(k));
		}
	}
}
