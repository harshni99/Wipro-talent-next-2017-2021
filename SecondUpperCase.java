import java.util.*;
import java.io.*;

public class SecondUpperCase
{
    public String upperCase(String inpt1)
    {
        String str="";
		  int j;
      char ch[]=input1.toCharArray();
		  int n=input1.length();
		  for(int i=0;i<n;i++)
		  { 
			    if(input1.charAt(i)==" ")
			  {
				  j=i;
				  break;
			  }
			  if(input1.charAt(i)>j && input1.charAt(i)!=" ")
			  {
				  str=str+input1.charAt(i);
			  }
			  if(input1.charAt(i)!=" ")
			  {
			  	str="less";
			  }
		  }
		  String ans=str.toUpperCase();
		  return ans;
    }
}
