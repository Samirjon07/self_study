package Conditionals.Midterm;

public class Reverse_pyramid_do {
    public static void main(String[] args) {

        int j = 7;
        do {
            int i = 1;
            do {
                System.out.print("*");
                i++;
            } while (i <= j);
            System.out.print("\n");
            int k = 0;
            do {
                System.out.print(" ");
                k += 2;
            } while (k <= (7 - j));
            if (j <= 1) {
                break;
            }
            j -= 2;
        } while (j <= 7);
    }
}