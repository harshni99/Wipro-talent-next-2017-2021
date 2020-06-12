import java.util.*;
public class PositiveOrNegative {
   public static void main(String args[]){
      int num;
      System.out.println("Enter a number :");
      Scanner ob = new Scanner(System.in);
      num = ob.nextInt();
      if (num > 0)
      {
         System.out.println("Given number is a positive integer");
      } else if(num < 0)
      {
         System.out.println("Given number is a negative integer");
      } else 
      {
         System.out.println("Given number is neither positive nor negative integer");
      }
   }
}