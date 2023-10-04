import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first number: ");
        double number1 = scanner.nextDouble();                      //input to enter first number
        System.out.println("please enter an operator: ");
        char operator = scanner.next().charAt(0);                       //input to enter an operator
        System.out.println("please enter second number: ");
        double number2 = scanner.nextDouble();                          //input to enter second number
       double result;
        scanner.close();

        switch (operator)
        {
            case '+':
                result = number1 + number2;
                System.out.println("Result" + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result" + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result" + result);
                break;
            case '/':
                if (number2 !=0)                             //if else condition for 0 used as a second number
                {
                    result = number1 / number2;
                    System.out.println("Result" + result);
                }   else
                {
                    System.out.println("Error: division by 0 is not allowed.");

                    //error is user use 0 number in denominator
                }break;
                //stopped using calculator here
            default:
                System.out.println("Invalid operator. Please use +, -, * or /.");
                //default if user typed any other operator

        }
    }
}
