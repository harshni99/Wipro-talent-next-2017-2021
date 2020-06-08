import java.util.*;
public class PalindromeString
{
	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str;
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
		   rev=rev+str.charAt(i);
		    
		}
		System.out.println(rev);
		if(str1.equals(rev))
		{
		    System.out.println("palindrome");
		}
		else
		{
		    System.out.println("not a palindrome");
		}
	}   
}
