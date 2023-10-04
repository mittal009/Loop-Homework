import java.util.Scanner;

public class FibonacciNumber
{
    public static void main(String[] args)
    {
        //initializing input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter limit 'n' for fibonacci sequence: ");
        int n = scanner.nextInt();
        scanner.close();

        int prev = 1;
        int current =1;

        System.out.println("Fibonacci sequence up to  " + n + " terms:");
        for (int i = 1; i <=n; i++)
        {
            System.out.println(prev + " ");
            int next = prev + current;
            prev = current;
            current = next;
        }




    }

}
