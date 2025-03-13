package Conditionals.Midterm;

public class Hotel_program {
    public static void main(String[] args) {
        String name = "Samarkand International hotel";
        int number_of_rooms = 250;
        char type;
        final int tax = 3;
        final int index =25437;
        float area_of_hotel = 250.34445F;
        int price;
        price('A',2000,20);

    }

    public static void price(char type,int price,int days){
        String final_type;
        int final_price;
        switch(type){
            case 'A':
                final_type = "VIP";
                price = 2000;
                System.out.printf(final_type);
                final_price= price*days;
                System.out.printf("\nThe final price in %s room for %d dollars a night is :  %d $\n",final_type,price,final_price);
                break;
            case 'B':
                final_type = "STANDARD";
                price = 1000;
                System.out.printf(final_type);
                final_price= price*days;
                System.out.printf("\nThe final price in %s room for %d dollars a night is :  %d $\n",final_type,price,final_price);
                break;
            case 'C':
                final_type = "Motel level";
                price = 250;
                System.out.printf(final_type);
                final_price= price*days;
                System.out.printf("\nThe final price in %s room for %d dollars a night is :  %d $\n",final_type,price,final_price);
                break;
            default:
                System.out.println("\nIncorrect hotel type");
        }
    }
}
