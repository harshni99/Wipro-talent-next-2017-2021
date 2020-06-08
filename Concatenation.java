import java.util.*;
import java.io.*;
public class Concatenation
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
		String new1="";
		String str3="";
		if(str1.charAt(len1-1)==str2.charAt(0))
		{
		    for(int i=0;i<len1-1;i++)
		    {
		        new1=new1+str1.charAt(i);
		    }
		    str3=new1+str2;
		}
		else{
		    str3=str1+str2;
		}
		System.out.println("New string is:"+str3);       
	}
}
