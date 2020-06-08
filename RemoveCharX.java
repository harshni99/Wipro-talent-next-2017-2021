import java.util.*;
import java.io.*;
public class RemoveCharX
{
	public static void main(String[] args) {
		System.out.println("Enter the string 1:");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		int len1=str1.length();
		System.out.println("Enter the char to remove:");
		Scanner sc1=new Scanner(System.in);
		char ch=sc1.next().charAt(0);
		System.out.println("New String:");
		if(str1.charAt(0)==ch&&str1.charAt(len1-1)==ch)
		{
		    for(int i=1;i<len1-1;i++)
		    {
		        System.out.print(str1.charAt(i));
		    }
		}
		else if(str1.charAt(0)==ch)
		{
		    for(int i=1;i<len1;i++)
		    {
		        System.out.print(str1.charAt(i));
		    }
		}
		else if(str1.charAt(len1-1)==ch)
		{
		    for(int i=0;i<len1-1;i++)
		    {
		        System.out.print(str1.charAt(i));
		    }
		}
		else
		{
		    System.out.print(str1);
		}
	}
}
