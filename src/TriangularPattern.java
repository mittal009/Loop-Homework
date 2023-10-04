import java.util.Scanner;

public class TriangularPattern {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of rows: ");
        int numberRows = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= numberRows; i++) {
            for (int j = 1; j <= numberRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("*");
                if (k < i) {
                    System.out.print(" ");
                }
            }     System.out.println();                        //move to the next line
        }
    }
}

