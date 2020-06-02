import java.io.*;
import java.util.*;
class IsNAnmultipleOfM()
{
    public int isMultiple(int input1,int input2)
    {
        int ans=0;
        if(input2>0)
        {
            if(input1==0)
                ans=3;
            else
            {
                if(input1%input2==0)
                    ans=2;
                else
                    ans=1;
            }  
        }
        if(input1==0 && input2==0)
            ans=0;
        if(input1>0 && input2==0)
            ans=3;
    }
