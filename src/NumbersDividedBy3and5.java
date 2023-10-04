import java.util.Scanner;

public class NumbersDividedBy3and5
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100 ; i++)    //using loop to find out numbers divided by 3&5 between 1 and 100
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println(i);

            }
        }

    }
}
