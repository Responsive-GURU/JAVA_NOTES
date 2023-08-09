package Str;

public class Mehtods {
    public static void main(String[] args) {
        String a ="guru";
        String b ="guru";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String name = "gurubharan";
        String me = "hello";
        String me2 = "Hello";

        System.out.println("charAt(int): "+name.charAt(0));
        System.out.println("length() "+name.length());
        System.out.println("substring(int)" + name.substring(4));
        System.out.println("substring(int,int)"+name.substring(0, 4));
        System.out.println("constains(string)"+name.contains("guru"));
        System.out.println("equal() "+name.equals(me));
        System.out.println("isEmpty() " +name.isEmpty());
        System.out.println("concat(str) "+ me.concat(name));
        System.out.println("replace(char,char)"+me.replace('h', 'y'));
        System.out.println("equalsIgnoreCase() "+ me.equalsIgnoreCase(me2));
    }
}
