package Conditionals;
import java.util.Scanner;

public class Pyramid1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an odd number for pyramid height: ");
        int num = scanner.nextInt();
        scanner.close();

        final int num1 = num;
        for (int k = 1; k <= num1; k = k + 2)
        {
            for (int j = (((num - 1) / 2) - 1); j < ((num - 1) / 2) && j >= 0; j--)
            {
                System.out.print(" ");
            }
            for (int i = 1; i <= k; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            num = num - 2;
        }
    }
}




