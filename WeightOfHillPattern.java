import java.util.*;
import java.io.*;

public class WeightOfHillPattern
{
    public int totalHillWeight(int input1,int input2,int input3)
    {
        int weight=0;
		  for(int i=1;i<=input1;i++)
		  {
			  for(int j=1;j<=i;j++)
			  {
				  weight=weight+input2;
			  }
			  input2=input2+input3;
		  }
		  return weight;
    }
}
