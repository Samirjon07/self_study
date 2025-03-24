package Classes;

public class Outer_class_static {
    int number=6;

    public void heythere(){
        System.out.println("Hey there!");
    }

    public static class Inner_class_static{
        int innerNumber=8;

        public void whatsUp(){
            System.out.println("What's up from the Inner class!");
        }
    }
}
