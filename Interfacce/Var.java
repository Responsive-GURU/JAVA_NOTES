package Interfacce;

interface Variation{
    int age = 10;
}
interface Variation2{
    int age =20;
}

public class Var implements Variation,Variation2 {
   public static void main(String[] args) {
        Variation v = new Var();
        System.out.println(Variation2.age);
        System.out.println(v.age);
   } 
}
