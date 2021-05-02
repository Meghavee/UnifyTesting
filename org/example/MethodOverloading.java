package org.example;

public class MethodOverloading {
    static int myMethod (int x , int y) {// declared method , declared the parameters which is fname
        return  x+y;
      //  System.out.println(fname + " Tester ");
    }
    static double myMethod(double x , double y){
        return x+y;
    }

    public static void main(String[] args) {
   int MyNum1 =     myMethod(10,20); // called the method out the static method, assigned a value of the parameters
  double MyNum2=      myMethod(10.5,20.2);//
        System.out.println(MyNum1);
        System.out.println(MyNum2);
    }

}
