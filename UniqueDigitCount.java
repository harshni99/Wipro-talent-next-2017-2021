import java.util.*;
import java.io.*;

public class UniqueDigitCount
{
    public int uniqueDigitCount(int input1)
    {
        int count=0,rem;
		    int visit[]=new int[20];
		    for(int i=0;i<20;i++)
		    {
		    	while(input1!=0)
		    	{
			    	rem=input1%10;
			    	if(visit[rem]==0)
			    	{
			    		visit[rem]=1;
			    		count++;
			    	}
			    	input1=input1/10;
		    	}
		    }
		
	    	return count;
    
    }
}
