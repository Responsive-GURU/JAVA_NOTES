package Interfacce;

interface Animal{
    void name();
}
interface Tiger extends Animal{
    void eat();
}
public class Triple  implements Animal,Tiger{
    public void name(){
        System.out.println("Animal interface");
    }
    public void eat(){
        System.out.println("MEAT");
    }
    public static void hello(){
        System.out.println("hello");
    }
    public static void main(String args[]){
        Triple tp = new Triple();
        tp.eat();
        tp.name();
        tp.hello();
    }
}
