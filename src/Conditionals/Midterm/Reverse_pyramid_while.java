package Conditionals.Midterm;

public class Reverse_pyramid_while {
    public static void main(String[] args)
    {
        int j=7;
        while(j<=7){
            int i=1;
            while(i<=j){
                System.out.print("*");
                i++;
            }
            System.out.print("\n");
            int k=0;
            while(k<=(7-j)){
                System.out.print(" ");
                k+=2;
            }
            j-=2;
            if (j<1){
                break;
            }

        }
    }
}

