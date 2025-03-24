package Classes.NonStatic;

public class InMain {
    public static void main(String[] args){

        Outer_class outer = new Outer_class();
        outer.heythere();

        Outer_class.Inner_class inner=outer.new Inner_class();
        inner.whatsUp();

    }
}
