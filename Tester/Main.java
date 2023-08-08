package Tester;
// public modifier
import Modifiers.PublicMain;
// private modifier
import Modifiers.PrivateMain;
//protected modifier
import Modifiers.ProtectedMain;

public class Main {
    public static void main(String args[]){
        PublicMain obj = new PublicMain();
        obj.instanceName();
        PublicMain.name();

        System.out.println(PublicMain.public_var);
        
        //PrivateMain.name(); // method name() is not visible compilation error
        //ProtectedMain.name(); //method name() is not visible compilation error
    
        
    }
}
