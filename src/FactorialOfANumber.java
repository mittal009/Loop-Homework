import java.util.Scanner;

public class FactorialOfANumber
{
    public static void main(String[] args)
    {
          // initializing input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number: ");
        int number = scanner.nextInt();
        long factorial = 1;                                //initializing factorial to 1
        scanner.close();

        for (int i = 1; i <=number; i++)
        {
            factorial = factorial * i;                                 //multiply factorial by i in each iteration

        }
        System.out.println("Factorial of " + number + " is: " + factorial);

    }
}
