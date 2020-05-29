import java.util.*;
import java.io.*;
public class SliceFirstAndLast
{
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		        for(int i=1;i<len-1;i++)
		        {
		            System.out.print(str.charAt(i));
		        }
	}
}
