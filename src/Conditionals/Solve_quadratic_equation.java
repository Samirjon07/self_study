package Conditionals;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


/*
Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195
 */

public class Solve_quadratic_equation
{
    public static void main(String[] args)
    {
        Scanner Object = new Scanner(System.in);
        System.out.println("\nYou equation format : ax^2 + bx + c");

        System.out.println("\nEnter a: ");
        int a = Object.nextInt();

        System.out.println("\nEnter b: ");
        int b = Object.nextInt();

        System.out.println("\nEnter c: ");
        int c = Object.nextInt();

        double answer1;
        double answer2;
        double disc =pow(b,2)-(4*a*c);


        if(disc==0)
        {
            answer1=(-b)/(2.0*a);
            System.out.println("\nDiscriminant is :"+ disc);
            System.out.printf("\nThe root of the %dx^2+(%d)x+(%d) is %f",a,b,c,answer1);

        }
        else if(disc>0)
        {
            if(a!=0) {
                answer1 = ((-b) + sqrt(disc)) / (2 * a);
                answer2 = ((-b) - sqrt(disc)) / (2 * a);
                System.out.println("\nDiscriminant is :" + disc);
                System.out.printf("\nThe roots of the %dx^2+(%d)x+(%d) are %f and %f \n ", a, b, c, answer1, answer2);
            }
            else{
                answer1=(-c)/b;
                System.out.println("\nDiscriminant is :" + disc);
                System.out.printf("\nThe root of the %dx^2+(%d)x+(%d) is %f",a,b,c,answer1);
            }
        }
        else
        {   System.out.println("\nDiscriminant is :"+ disc);
            System.out.printf("\nThe %dx^2+(%d)x+(%d) equation has no roots  \n",a,b,c);
        }
    }
}






/*CHATGPT WRITTEN:
package Conditionals;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SolveQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQuadratic Equation Format: ax^2 + bx + c = 0");

        // Input coefficients
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        // Handling linear equation (if a == 0)
        if (a == 0) {
            if (b == 0) {
                System.out.println("\nInvalid equation. No solution.");
            } else {
                double root = (double) -c / b;
                System.out.printf("\nThis is a linear equation. The root is: %.2f\n", root);
            }
            return; // Exit program
        }

        // Compute discriminant
        double discriminant = pow(b, 2) - (4 * a * c);
        System.out.printf("\nDiscriminant: %.2f\n", discriminant);

        if (discriminant > 0) {
            // Two real distinct roots
            double root1 = (-b + sqrt(discriminant)) / (2 * a);
            double root2 = (-b - sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots of %dx² + (%d)x + (%d) are %.2f and %.2f\n", a, b, c, root1, root2);
        } else if (discriminant == 0) {
            // One real root (double root)
            double root = (double) -b / (2 * a);
            System.out.printf("The root of %dx² + (%d)x + (%d) is %.2f\n", a, b, c, root);
        } else {
            // No real roots
            System.out.printf("The equation %dx² + (%d)x + (%d) has no real roots.\n", a, b, c);
        }
    }
}
*/


/*
ANSWER:

import java.util.Scanner;
public class Exercise2 {


  public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }

    }
}
 */
