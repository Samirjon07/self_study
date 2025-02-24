package Conditionals;
import java.util.Scanner;

/*
Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
 */

public class Pos_Neg_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number :");
        int number=sc.nextInt();
        if (number>0){
            System.out.println("\nNumber is positive");
        }
        else if (number==0){
            System.out.println("\nNumber is zero");
        }
        else{
            System.out.println("Number is negative");
        }

    }
}
/*

 */