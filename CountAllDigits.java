import java.util.*;
import java.io.*;
  
  
public class CountAllDigits
{
    public int digit(int input1)
    {
        int count=0;
        while(input1!=0)
        {
            input1=input1/10;
            count=count+1;
        }
        return count;
    }
}
