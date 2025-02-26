package Conditionals;
import java.util.Scanner;

public class Num_to_Week_day
{
    public static void main(String[] args) {
        Scanner Object = new Scanner(System.in);

        System.out.println("\nEnter number : ");
        int num1= Object.nextInt();

        switch(num1)
        {
            case 1:
                System.out.println("\nMonday");
                break;
            case 2:
                System.out.println("\nTuesday");
                break;
            case 3:
                System.out.println("\nWednesday");
                break;
            case 4:
                System.out.println("\nThursday");
                break;
            case 5:
                System.out.println("\nFriday");
                break;
            case 6:
                System.out.println("\nSaturday");
                break;
            case 7:
                System.out.println("\nSunday");
                break;
            default:
                System.out.println("\nInvalid Value!!");
        }
    }
}
