import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args)
    {
          //initializing input
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter number you want to reverse");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        for (; number != 0; number=number/10)                  //loop syntax to reverse number
        {
            int digit = number % 10;              //extract the last digit
            reversedNumber = reversedNumber * 10 + digit;             //apply to reverse the entered digits



        }    System.out.println("reversed number: " + reversedNumber);
    }
}