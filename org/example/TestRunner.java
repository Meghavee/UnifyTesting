package org.example;

public class TestRunner {
    public static void main(String[] args) {
        StaticAndNonStatic.Salary=25000; // StaticAndNonStatic is the class name from other class
        System.out.println("The Salary is " +StaticAndNonStatic.Salary);

    }


}
