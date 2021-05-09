package OopsConcepts;

import sun.applet.Main;

public class TryCatch {

    public void sum() throws ArithmeticException {
        div();
    }
   public  void div()throws ArithmeticException {
       int i = 9 / 0;
   }
        public static void main(String[]args) throws ArithmeticException{

        TryCatch obj = new TryCatch();
        obj.sum();
    }


//        try{
//            int i=9/0; // this code will throw exception
//        }
//        catch (ArithmeticException e){
//            System.out.println("Can't Divide");//this code will handle the Exception
//        }



    }

