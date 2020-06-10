import java.util.*;
import java.io.*;

public class StringWeight
{
    public int weight(String input1,in input2)
    {
            int len=input1.length();
		        int ans=0;
		        for(int i=0;i<len;i++)
		        {
			      char ch=input1.charAt(i);
			      if(input2==0)
			      {
			      	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='U' || ch=='O')
				      {
				       	continue;
              }  
			      }
			      if(input2==1)
			      {
				        if(ch>=65 && ch<=90) 
				       {
                  ans=ans+(ch-64);
				        }
       
				      if(ch>=97 && ch<=122)
				     {
					       ans=ans+(ch-96);
				      }
			    }
		    }
		    return ans;
    }

}
