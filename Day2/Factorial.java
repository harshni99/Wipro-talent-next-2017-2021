import java.util.*;
public class Factorial{
        public static void main(String args[])
        {
              System.out.println("enter a number:");
              Scanner ob=new Scanner(System.in);
              int number=ob.nextInt();
              int fact=1,i=1;
              while(i<=number)
              {
                    fact=fact*i;
                    i++;
              }
              System.out.println("the factorial of"+number+" is "+fact);
              ob.close();
        }
 }