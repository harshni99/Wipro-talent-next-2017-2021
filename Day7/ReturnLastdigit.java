import java.util.*;
public class ReturnLastdigit
{
	public int lastDigitOf(int input1)
	{
     	 int last;
      	 if(input1<=-1)
         	last=(-1)*(input1%10);
      	 else
          	last=input%10;
        return last;
	}
}
