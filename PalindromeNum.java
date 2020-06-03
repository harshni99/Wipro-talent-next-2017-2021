import java.io.*;
import java.util.*;

public class PalindromeNum
{
    public int isPalindrome(int input1)
    {
        int rev=0,ans,rem=0,num=input1;
        while(input1!=0)
        {
            rem=input1%10;
            rev=rev*10+rem;
            input1=input1/10;
        }
        if(rev==input1)
        {
            ans=2;
        }
        else
        {
            ans=1;
        }
        return ans;
    }
}
