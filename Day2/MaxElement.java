import java.util.*;
public class MaxElement 
{
    public static void main(String[] args) 
    {
        int n, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is:"+max);
    }
}