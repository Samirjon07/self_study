package Conditionals;
import java.util.Scanner;

public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner Object = new Scanner(System.in);

        System.out.println("Enter the number of stars which is divisible by 3: ");
        int n = Object.nextInt();
        System.out.println("*");
        for (int j=3; j < n; j = j +3)
        {
            for (int i = 1; i <= j; i++)
            {
                System.out.print("*");
                }
            System.out.println();
            }



        }


    }


