package Interfacce;

interface One{
    void name();
}
interface Two{
    public static void hello(){
        System.out.println("hello");
    }
    void age();
}

public class Doub implements One, Two{
    public  void name(){
        System.out.println("INTERFACE ONE");
    }
    public void age(){
        System.out.println("INTERFACE TWO");
    }

    public static void main(String[] args) {
        Doub db = new Doub();
        db.age();
        One on = new Doub();
        on.name();
        Two.hello();
    }
}
