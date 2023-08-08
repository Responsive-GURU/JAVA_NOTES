package Modifiers.ABSTRACT;

public abstract class Animal {
  abstract void eat();   
  private void name(){
    System.out.println("name metod");
  }
}

class Tiger extends Animal{

    void eat(){
        System.out.println("MEAT");
    }
}

class Cow extends Animal{
    void eat(){
        System.out.println("GRASS");
    }
}

class Main{
    public static void main(String args[]){
        Animal obj = new Tiger();
        obj.eat();
        obj = new Cow();
        obj.eat();
        // Animal obj2 = new Animal();
        // obj2.name();
    }
}