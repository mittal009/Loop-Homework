import java.util.Scanner;

public class MinimumMaximumNumber
{
    public static void main(String[] args)
    {
        //creating scanner to accept the value entered
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <=3 ; i++)
        {
            System.out.println("Please enter number " + i + ": ");
            int num = scanner.nextInt();
            if (num < min)
            {
                min = num;
            } if (num > max)
            {
                max = num;

            }

        }scanner.close();
        System.out.println("Minimum number is : " + min);
        System.out.println("Maximum number is : " + max);
    }
}
