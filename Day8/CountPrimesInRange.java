import java.util.*;
import java.io.*;

public class CountPrimesInRange
{
    public int countPrime(int input1,int input2)
    {
        int count=0;
        while(input1<=input2)
        {
            boolean flag=false;
            for(int i=2;i<=input1/2;++i)
            {
                if(input1%i==0)
                {
                    flag=true;
                    break;
                }
            }
                if(!flag && input1!=0 && input1!=1)
                {
                    count=count+1;
                }
                ++input1;
        }
        return count;


    }
}