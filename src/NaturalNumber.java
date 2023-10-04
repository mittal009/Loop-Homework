import java.util.Scanner;

public class NaturalNumber
{
    public static void main(String[]args)
    {
        //initializing input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number you want to sum from: ");
        int a = scanner.nextInt();
        //input for the user to enter number
        System.out.println("please enter number you want to sum up to: ");
        int number = scanner.nextInt();
        scanner.close();
        int sum=0;

        for (int i = a; i <=number ; i++)                   //fining n number using loop
        {
            sum = sum + i;                                       //adding i with the sum at each iteration
        }
        System.out.println("Sum = " + sum);
    }
}
