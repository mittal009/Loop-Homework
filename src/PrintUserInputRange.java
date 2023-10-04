import java.util.Scanner;

public class PrintUserInputRange {
    public static void main(String[] args) {
        //initializing input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter lower bond of the range: ");
        //first enter the lower bond value of the range
        int lowerbond = scanner.nextInt();                          //input for the lower bond
        System.out.println("please enter upper bond of the range: ");
        //second enter the upper bond value of the range
        int upperbond = scanner.nextInt();                         //input for the upper bond
        scanner.close();

        if (lowerbond >= upperbond) {
            System.out.println("invalid range. Please ensure lower bond is less than upper bond");
        } else {
            int count = 0;

            for (int i = lowerbond; i <= upperbond; i++)          //loop syntax
            {
                if (count >= 10) {
                    System.out.println();
                    break;                                     //exit the loop after printing 10 numbers
                }
                System.out.println(i + " ");
                count++;

            }
        }
    }
}