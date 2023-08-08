package Modifiers;

public class ProtectedMain {
    protected static int protectedVar = 300;
    protected static void name(){
        System.out.println("Protected modifier from ProtectedMain.java");
    }
}

class subClass extends ProtectedMain{
    public static void main(String args[]){
            System.out.println(protectedVar);
    }
}
