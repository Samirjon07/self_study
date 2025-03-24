package Classes.NonStatic;

public class Outer_class {
    int number=6;

    public void heythere(){
        System.out.println("Hey there!");
    }

    public class Inner_class{
        int innerNumber=8;

        public void whatsUp(){
            System.out.println("What's up from the Inner class!");
        }
    }
}
