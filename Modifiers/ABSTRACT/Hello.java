package Modifiers.ABSTRACT;

abstract class Hello {
    // abstract int a;
    static void hello(){
        System.out.println("this is hello");
    }

    static void hai(){
        System.out.println("this is hai");
    }

    public static void main(String args[]){
        // Hello obj = new Hello();
        hello();
        hai();
    }
}

