package org.example;

public class StaticAndNonStatic {
    String name ;     //public
    static int Salary;       //static

public void walk(){
    System.out.println("non-static Method");
}
public static void run(){
    System.out.println("Static method");
}
    public static void main(String[] args) {
    Salary =25000;
        System.out.println(Salary);
        run();

        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.name="Megha";
        System.out.println(obj.name);

        obj.walk();

    }
}