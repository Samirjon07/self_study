//Write a Java program that takes three numbers from the user and prints the greatest number.

package Conditionals;
import java.util.Scanner;

public class Greatest_number
{
    public static void main(String[] args)
    {
        Scanner Object = new Scanner(System.in);

        System.out.println("\nEnter first number : ");
        int num1= Object.nextInt();

        System.out.println("\nEnter second number : ");
        int num2= Object.nextInt();

        System.out.println("\nEnter third number : ");
        int num3= Object.nextInt();


        if (num1>num2)
        {
            if (num1>num3)
            {
                System.out.printf("\nThe greatest number among %d , %d , %d is: %d",num1,num2,num3,num1);
            }
            else
            {
                System.out.printf("\nThe greatest number among %d , %d , %d is: %d",num1,num2,num3,num3);
            }
        }
        else
        {
            if (num2>num3)
            {
                System.out.printf("\nThe greatest number among %d , %d , %d is: %d",num1,num2,num3,num2);
            }
            else
            {
                System.out.printf("\nThe greatest number among %d , %d , %d is: %d",num1,num2,num3,num3);
            }
        }

    }
}



/*CHATGPT WRITTEN:

package Conditionals;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Finding the greatest number using Math.max
        int greatest = Math.max(num1, Math.max(num2, num3));

        // Displaying result
        System.out.printf("The greatest number among %d, %d, and %d is: %d%n", num1, num2, num3, greatest);

        scanner.close(); // Closing Scanner to prevent resource leaks
    }
}

 */