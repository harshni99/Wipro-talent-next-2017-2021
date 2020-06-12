import java.util.*;
public class CountOccurrence
{
    public static void main(String[] args) 
    {
        int n, x, count = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int max = a[0];
        for( i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
        for(i = 0; i < n; i++)
        {
            if(a[i] == max)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }
}