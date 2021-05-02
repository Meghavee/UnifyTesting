package org.example;



public class Constructor {
    String name; // data type // GLOBLE Variable
    int age;

    public Constructor(){ //CONSTRUCTOR CREATED // default const
        System.out.println("Default Constructor");
    }

    public Constructor(int x){ // one paramater const
        System.out.println("1 PARA CONST");
    }

    public Constructor(int a , int b){
        System.out.println(" 2 PARA CONST");

    }
    public  Constructor(String name , int age){ // use of THIS keyword
       this.name=name; //LOCAL VARIABLE
       this.age=age;

    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(); // object created
        Constructor obj2 = new Constructor(10); //assigned value to the obj
        Constructor obj3 = new Constructor(10 , 30);
        Constructor obj4 = new Constructor("Megha" , 30);
        System.out.println(obj4.name);
        System.out.println(obj4.age);

    }
}
