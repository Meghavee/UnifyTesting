package OopsConcepts;

//process of the implemention of hiding

//and to hide the implenmetion we need abstract method
public abstract class Abstraction {  // parent Class
    public abstract void header(); // abstract method cannot have a method

    public abstract void title();

  //  non abs method belw - need body
    public void logout(){
        System.out.println("non abs method ");
    }
    }

