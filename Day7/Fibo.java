import java.util.*;
import java.io.*;

public class Fibo
{
    public int nthFibo(int input1)
    {
				int t1=0,t2=1,t3,t4=0;
				for(int i=0;i<input1;i++)
				{
						t4=t1;
						t3=t1+t2;
						t1=t2;
						t2=t3;
				}
			return t4;
    }
}