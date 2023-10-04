import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any number for which you want to print multiplication table: ");
        int number = scanner.nextInt();                               // input for user to enter number
        scanner.close();

        for (int i = 0; i <10 ; i++)                                      //loop syntax for multiplication table
        {
            System.out.println(number + " x " + (i+1) + " = " + (number * (i+1)));
        }

    }
}
