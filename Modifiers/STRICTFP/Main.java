package Modifiers.STRICTFP;

 strictfp class Arith {
   public static void add(double num1, double num2){
        System.out.println(num1+ num2);
   }

}

 class simple{
    public strictfp static void sub(double num1, double num2){
        System.out.println(num1-num2);
    }
    public static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
}

public class Main extends simple{
    public static void main(String[] args) {
        sub(10.2,5.1);
        add(11,1);
    }
}