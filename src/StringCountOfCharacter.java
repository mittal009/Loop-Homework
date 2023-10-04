import java.util.Scanner;

public class StringCountOfCharacter
{

    public static void main(String[] args)
    {

        //creating object here
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string: ");
        //reading a string from user
        String inputString  = scanner.nextLine();
        int count = 0;
        //initialize variable to count 'a' characters

        for ( int i = 0; i <inputString.length() ; i++)
        {
            //check if the current character is 'a' (case-insensitive)
           if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A' )
           {
               count++;
           }
        }
        System.out.println("Total number of 'a' characters: " + count);
    }
}
