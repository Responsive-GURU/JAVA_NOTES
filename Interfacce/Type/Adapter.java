package Interfacce.Type;

interface details{
    void name();
    void age();
    void address();
}

class data implements details{
    public void name(){}
    public void age(){}
    public void address(){}
}

public class Adapter extends data {
    public void name(){
        System.out.println("GURUBHARAN");
    }

    public static void main(String[] args) {
        Adapter ad = new Adapter();

        ad.name();
        ad.age();
    }
}
