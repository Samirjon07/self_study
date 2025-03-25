package Classes.Local;


public class InMain3 {
    public static void main(String[] args){

        Outer_class_local outer = new Outer_class_local();
        outer.heythere();

        Outer_class_local.Inner_class_static inner=new Outer_class_local.Inner_class_static();
        inner.whatsUp();

    }
}
