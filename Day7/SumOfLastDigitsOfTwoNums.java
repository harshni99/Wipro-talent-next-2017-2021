import java.io.*;
import  java.util.*;
class SumOfLastDigitsOfTwoNums
{
       public int addLastDigits(int input1,int input2)
       {
            int ans,last1,last2;
            if(input1<=-1 || input2<=-1)
            {
                last1=(-1)*(input1%10);
                last2=(-1)*(input2%10);
            }
            else
            {
                last1=input1%10;
                last2=input2%10;
            }
            ans=last1+last2;
            return ans;
       }
}