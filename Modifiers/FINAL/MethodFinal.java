package Modifiers.FINAL;

public class MethodFinal {
    public static final void sum(){
        System.out.println("sum");
    }
    // parameter as final 
    public static final int add(final int num1, final int num2){
        return num1+num2;
    }
   
}

class subClass extends MethodFinal{
    // static void sum(){    //Cannot override the final method
    //      System.out.println("Trying to ovverride");
    // }

    // public static final int add(final int num1, final int num2){
    //     return num1+num2;
    // }
     public static void main(String[] args) {
        sum();
        final int a;
        a = 100;
        // a=1000;
        int num1 = 10;
        int num2= 100;
        int ans = add(num1, num2);
        System.out.println(ans);
        final int age = 21;
        // age = age+1;
        System.out.println(age + a);
    }  
}