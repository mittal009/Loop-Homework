import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        boolean isPrime = true;

        //initialising object
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any number");
        int number = scanner.nextInt();                  //input for the entered value
        scanner.close();


        for (int i = 2; i <=number/2; i++)    //formula of loop
        {
            if (number%i == 0)               //condition for the prime number
            {
                isPrime = false;
                break;
            }

        }if (isPrime)                          // if isPrime is true then the number is prime number else not
        {
            System.out.println(number + " is a Prime Number ");
        }else
        {
            System.out.println(number + " is not a Prime Number ");
        }

        }
}

