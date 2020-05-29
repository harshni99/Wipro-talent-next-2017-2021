import java.util.*;
import java.io.*;
public class RepeatNCharsNTime
{
	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		System.out.println("Enter the integer:");
		Scanner sc1=new Scanner(System.in);
		int num=sc1.nextInt();
		System.out.println("output:");
		for(int j=0;j<num;j++)
		{
		    for(int i=len-num;i<len;i++)
		    {
		        System.out.print(str.charAt(i));
		    }
		}
	}
}
