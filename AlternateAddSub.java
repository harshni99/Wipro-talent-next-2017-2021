import java.util.*;
import java.io.*;

public class AlternateAddSub
{
    public int addsub(int input1,int input2)
    {
        int result=input1;
        if(input2==1)
        {
            for(int i=input1-1;i>=1;i--)
            {
                if(input1%2==0)
                {
                    if(i%2!=0)
                        result=result-i;
                    else
                        result=result+i;
                }
                else
                {
                    if(i%2==0)
                    {
                        result=result-i;
                    }
                    else
                    {
                        result=result+i;
                    }
                }
            }
        }
        
        if(input2==2)
        {
            for(int i=input1-1;i>=1;i--)
            {
                if(input1%2==0)
                {
                    if(i%2!=0)
                        result=result+i;
                    else
                        result=result-i;
                }
                else
                {
                    if(i%2==0)
                    {
                        result=result+i;
                    }
                    else
                    {
                        result=result-i;
                    }
                }
            }
        }
    }
}
