package OopsConcepts;

public class abspage extends Abstraction{ //child class
    @Override
    public void header() {
        System.out.println("Login");
    }

    @Override
    public void title() {
        System.out.println("Login page title");
    }

    // non over ridden are their own method - just for this class

    public void login(String un,String pwd)  // parameter for methods
    {
        System.out.println("login Page - Login");
        System.out.println("Login with " + un + "and" + pwd);

    }
}
