import java.util.*;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner ob1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = ob1.nextInt();
        if(number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
        ob1.close();
    }
}