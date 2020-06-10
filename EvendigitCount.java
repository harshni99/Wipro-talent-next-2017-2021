import java.util.*;
import java.io.*;

puvlic class EvenDigitCount
{
  public int evenDigitSum(int input1)
  {
       int count=0,rem;
		  while(input1!=0)
		  {
			  rem=input1%10;
			  if(rem%2==0)
			  {
				  count=count+rem;
			  }
			  input1=input1/10;
		  }
		  return count;
  }
}
