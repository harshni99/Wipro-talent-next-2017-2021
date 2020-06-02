import java.util.*;
import java.io.*;
public class OfFiveEvenOrOddCount
{
	public int evenOrOddCount(int input1,int input2,int input3,int input4,int input5,String input6)
  {
    int e=0,o=0,ans=0;
    int len=input6.length();
		if(input1%2==0)
		    e++;
		else    
		    o++;
		if(input2%2==0)
		    e++;
		else    
		    o++;
		if(input3%2==0)
		    e++;
		else    
		    o++;
		if(input4%2==0)
		    e++;
		else
		    o++;
		if(input5%2==0)
		    e++;
		else    
		    o++;
		if(len==4)
		    ans=e;
		else
		    ans=o;
		return ans;
	}
}
