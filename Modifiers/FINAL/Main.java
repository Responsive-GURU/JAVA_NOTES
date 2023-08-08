package Modifiers.FINAL;

public final class Main extends Hello {
    public static void main(String args[]){
        System.out.println("final class which cannot be inherited by another class");
        name();
    }
}

class Hello {
    public static void name(){
        System.out.println("GURUBHARAN");
    }
}
