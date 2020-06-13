import java.io.*;
import java.util.*;

public class IsPrime
{
    public int isPrime(int input1)
    {
        int ans=0;
        boolean flaf=false;
        
        for(int i=2; i<=input1/2 ;++i)
        {
            if(input1%i==0)
                flag=true;
                break;
        }
        
        if(!flag)
            ans=1;
        else
            ans=2;
    }
}