package Conditionals;

public class reverse_pyramid {
    public static void main(String[] args) {
        for (int j=7;j<=7;j-=2)
        {
            for (int i=1;i<=j;i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            for(int k=0;k<=7-j;k+=2)
            {
                System.out.print(" ");
            }
        if (j==1){
            break;
        }
        }
    }
}
