import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageAndSum
{
    public static void main(String[] args)
    {
        //initialising object
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter start number: ");
        int a = scanner.nextInt();                        //input for start number
        System.out.println("please enter end number: ");
        int b = scanner.nextInt();                      //input for end number
        double sum = 0;                              //input for double value sum
        double count = 0;                            //input for double valur count

        for (int i = a; i<=b; i++)                     //using loop for finding average and sum between two entered numbers
        {
            sum = sum + i;
            count++;
        }double average = (double) sum/count;

        System.out.println("Sum of numbers between " + a + " and " + b + " : " + sum);
        System.out.println("Average of numbers between " + a + " and " + b + " : " + average);
    }

}

