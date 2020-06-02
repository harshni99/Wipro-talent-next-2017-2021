import java.util.*;
import java.io.*;
public class UserMainCode
{
    public int SecondLastDigitOf(int input1)
    {
     int ans;
    if(input1<=-10)
    {
        input1=input1/10;
        ans=(-1)*(input1%10);
    }
    else if(input1>=10)
    {
        input1=input1/10;
        ans=input1%10;
    }
    else
        return -1;
    return ans;
    }
}
     
