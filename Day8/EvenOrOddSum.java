import java.util.*;
import java.io.*;
 
public class EvenOrOddSum
{
    public int evenOrOddSum(int input1,String input2)
    {
        int len=input2.length();
		    int count=0;
		    int rem;
		    if(len==4)
		    {
          while(input1!=0)
			    {
			    	rem=input1%10;
			    	if(rem%2==0)
			    	{
				    	count=count+rem;
			    	}
			    	input1=input1/10;
			    }
		    }
		    else
		    {
			    	while(input1!=0)
			    	{
				    	rem=input1%10;
				    	if(rem%2!=0)
				    	{
					    	count=count+rem;
					    }
				    	input1=input1/10;
				    }
	    	}
		    return count;
    }
}