package Interfacce.Type;


@FunctionalInterface
interface Name{
    void hello();
    default void h(){
        System.out.println("kkk");
    }
}

@FunctionalInterface
interface Me{
    void name();
    // void age();
}

public class FunctionInterface implements Name{
    public void hello(){

    }
    public static void main(String args[]){
        System.out.println("Functional interface");
    }
}

class Execute implements Name{

    public static void main(String[] args) {
        Name n = () -> {
            System.out.println("name defiend");
        };
        n.hello();
    }
}

class Time implements Me{
    public void name(){}
    public static void main(String[] args) {
        Me t = () -> {
            System.out.println("GURU");
        };
        t.name();
    }
}