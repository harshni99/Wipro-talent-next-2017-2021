import java.util.*;
import java.io.*;
public class RepeatChar
{
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
		    if(len>=2)
		    {
		        System.out.print(str.charAt(0));
		        System.out.print(str.charAt(1));
		    }
		    else{
		        System.out.println(str.charAt(0));
		    }
		}
	}
}
