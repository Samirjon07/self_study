package Classes.Local;

public class Outer_class_local {
    int number = 6;

    public void heythere() {
        System.out.println("Hey there!");


        class Local_Inner_class {
            String localInnerClassVariable = "Here's Samirjon";

            public void printLocalInnClass() {
                System.out.println(localInnerClassVariable);
            }
        }

        Local_Inner_class lic = new Local_Inner_class();
        lic.printLocalInnClass();
    }

    public static class Inner_class_static{
        int innerNumber=8;

        public void whatsUp(){
            System.out.println("What's up from the Inner class!");
        }
    }
}