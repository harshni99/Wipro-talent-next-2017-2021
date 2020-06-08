import java.util.*;
import java.io.*;
public class ConcateExample
{
	public static void main(String[] args) {
		System.out.println("Enter the string 1:");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		int len1=str1.length();
		System.out.println("Enter the string 2:");
		Scanner sc1=new Scanner(System.in);
		String str2=sc1.nextLine();
		int len2=str2.length();
		if(len1>len2)
		{
		    System.out.println("New String:"+ str2+str1+str2);
		}
		else{
		    System.out.println("New String:"+ str1+str2+str1);
		}
	}
}
