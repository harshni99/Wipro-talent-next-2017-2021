import java.util.*;
public Class EvenOrOddSum{
      public ststic void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            int sum;
            sum = num1 + num2;
            if(sum%2==0)
            {
                System.out.println(" The sum is even ");
            }
            else
            {
                System.out.println(" The sum is odd ");
            }
            sc.close();
     }
}