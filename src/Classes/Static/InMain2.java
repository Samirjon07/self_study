package Classes.Static;


public class InMain2 {
    public static void main(String[] args){

        Outer_class_static outer = new Outer_class_static();
        outer.heythere();

        Outer_class_static.Inner_class_static inner=new Outer_class_static.Inner_class_static();
        inner.whatsUp();

    }
}
