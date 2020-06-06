import java.util.*;
import java.io.*;

public class Series
{
    public int series(int input1,int input2,int input3,int input4)
    {
          int dif,dif1;
		      int num=input3;
		
			  dif=input2-input1;
			  dif1=input3-input2;
			  for(int i=4;i<=input4;i++)
			  {
				  if(i%2==0)
				  {
					  num=num+dif;
				  }
				  else
				  {
					  num=num+dif1;
				  }
			  }
	    return num;
    }
}
