package Conditionals;
import java.util.Scanner;

public class One_side_num {
    public static void main(String[] args) {
        Scanner Object = new Scanner(System.in);
        int rows = Object.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
