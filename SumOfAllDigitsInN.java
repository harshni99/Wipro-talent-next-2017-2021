import java.util.*;
import java.io.*;

public class SumOfAllDigitsInN
{
    public int digitSum(int input1)
    {
        int sum=0,rem=0,sum1=0,rem1;
        if(input1>0)
        {
          while(input1!=0)
          {
              rem=input1%10;
              if(input1!=0)
                  sum=sum+rem;
              if(input1==0)
                  sum=sum-rem;
              input1=inpit1/10;
          }
          if(sum>0 && sum<10)
              sum1=sum;
          else if(sum>9 && sum<100)
          {
              rem1=sum%10;
              sum1=sum+rem;
              sum=sum/10;
          }
          else
          {  
              rem1=sum%10;
              sum1=sum+rem;
              sum=sum/10;
          }
        }
        else
        {
            while(input1!=0)
            {
              rem=input1%10;
              sum=sum+rem;
              input1=inpit1/10;
            }
          if(sum>0 && sum<10)
              sum1=sum;
          else if(sum>9 && sum<100)
          {
              rem1=sum%10;
              sum1=sum+rem;
              sum=sum/10;
          }
          else
          {  
              rem1=sum%10;
              sum1=sum+rem;
              sum=sum/10;
          }
        }
        }
    }   
}
