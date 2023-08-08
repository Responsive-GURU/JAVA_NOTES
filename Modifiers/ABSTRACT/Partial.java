package Modifiers.ABSTRACT;

abstract class hello{
    abstract void name();
    abstract void age();
    abstract int time(int a);
}
public class Partial extends hello{
    void name(){
        System.out.println("name method overriden");
    }
    void age(){
        System.out.println(21);
    }
    int time(int a){
        return 1;
    }
    public static void main(String args[]){
        Partial ob = new Partial();
        ob.name();
    }
}

// if we extend the abstract class then all the availble abstract methods should be 
// overriden by the inherited class
