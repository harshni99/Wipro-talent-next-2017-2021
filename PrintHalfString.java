import java.util.*;
import java.io.*;
public class PrintHalfString
{
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		    if(len%2==0)
		    {
		        for(int i=0;i<len/2;i++)
		        {
		            System.out.print(str.charAt(i));
		        }
		        
		    }
	}
}
