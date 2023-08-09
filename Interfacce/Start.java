package Interfacce;

abstract interface Methods{
    void name();
    public default void age(){
        System.out.println(21);
    }
    // public void address(){
    //     System.out.println("namakkal");
    // }
}
public class Start implements Methods{
    public void name(){
        System.out.println("GURUBHARAN N M");
    }
   public static void main(String[] args) {
        Start st = new Start();
        st.name();
        // Start me = new Methods();
        // Methods me = new Methods();
        // me.name();

   }
}


