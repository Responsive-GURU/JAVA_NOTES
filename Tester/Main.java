package Tester;
// public modifier
import Modifiers.PublicMain;
// private modifier
import Modifiers.PrivateMain;
//protected modifier
import Modifiers.ProtectedMain;

class child extends ProtectedMain{
    public  void accessName(){
        name();
        System.out.println("accessed through child in another package");
    }
}
public class Main {
    public static void main(String args[]){
        PublicMain obj = new PublicMain();
        obj.instanceName();
        PublicMain.name();

        System.out.println(PublicMain.public_var);
        
        //PrivateMain.name(); // method name() is not visible compilation error
        //ProtectedMain.name(); //method name() is not visible compilation error

        //Accessing the name method through the child class which is created in another package
        child ch = new child();
        ch.accessName();
          
    }
}
