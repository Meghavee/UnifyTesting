package org.example;

public class JavaOperater {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a == b); // returns false
        //because 10 is not equal to 20
        System.out.println(a != b); // returns true
        // because 10 is not equal to 20
        System.out.println(a > b); // returns false
        System.out.println(a < b); // returns true
        System.out.println(a >= b); // returns false
        System.out.println(a <= b); // returns true
        System.out.println(a<10 & a<20); //returns false
        System.out.println(a<10 || a<20); //returns true
        System.out.println(!(a<10 & a<20)); //returns true

    }
}
// there is no wrong o/p on the prg