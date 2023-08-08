package Modifiers;
import Modifiers.ProtectedMain;
import Modifiers.subClass;
public class PrivateMain {
    private static void name(){
        System.out.println("Private modifier from PrivateMain");
    }

    public static void main(String args[]){
        name();
        ProtectedMain.name();
        ProtectedMain obj = new ProtectedMain();
        System.out.println(obj.protectedVar);
        
        // this is from the subclass of the protectedmain.java
        subClass.main(args);
    }
}
