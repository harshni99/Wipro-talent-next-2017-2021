import java.util.*;
public class MinAndMaxValueInArray
{
	public static void main(String[] args) {
	int array[]=new int[]{1,2,3,4,5,6,7,8,9};
	int n=array.length;
	int max=array[0];
	int min=array[1];
	for(int i=0;i<n;i++)
	{
	    if(array[i]>max)
	    {
	        max=array[i];
	    }
	    if(array[i]<min)
	    {
	        min=array[i];
	    }
	}
	System.out.println("the minimum value="+min+" and the maximum value ="+max);
	}
}
