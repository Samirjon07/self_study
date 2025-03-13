package Conditionals.Midterm;

public class From_1_30_divisible_to_2_5 {
    public static void main(String[] args) {

        for (int i = 1;i<30;i++){
            if (i<=25) {
                if (i % 2 == 0 || i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
