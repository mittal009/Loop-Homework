import java.util.Scanner;

public class SumOfNumbersDivisibleBy9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter starting number: ");
        int a = scanner.nextInt();                           //input for starting number
        System.out.println("please enter ending number: ");
        int b = scanner.nextInt();                           //input for ending number
        scanner.close();

        int sum = 0;

        for (int i = a; i <= b ; i++)                    //using loop to find out numbers between two value
        {
            if (i%9==0)                                     //condition if divisible by 9
            {
               sum += i;                               //sum of the numbers between two value added by user
            }
        }
        System.out.println("Sum of the numbers between " + a + " and " + b + " divisible by 9 is: " + sum);
    }
}
