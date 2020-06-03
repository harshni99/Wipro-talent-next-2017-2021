import java.util.*;

public class PalindromeString
{
    public int IsPalindrome(String input1)
    {
        int len=Input1.length();
        int ans=0;
        String s=Input1.toLowerCase();
        string str="";
        for(int i=len;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        if(str==s)
          ans=2;
         else
          ans=1;
        return ans;
    }
}
