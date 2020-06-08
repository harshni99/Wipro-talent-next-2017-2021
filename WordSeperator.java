import java.util.*;
import java.io.*;
public class WordSeperator
{
	public static void main(String[] args) {
		System.out.println("Enter the word:");
		Scanner sc=new Scanner(System.in);
		String wrd=sc.next();
		System.out.println("Enter the seperator:");
		Scanner ob=new Scanner(System.in);
		String sep=ob.next();
		System.out.println("enter the count of occurence:");
		Scanner co=new Scanner(System.in);
		int count=co.nextInt();
		for(int i=1;i<=count;i++)
		{
		    System.out.print(wrd+sep);
		    
		}
	}
}
