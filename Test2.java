public class ObjectCar {

        int mod;
        int wheel ;
    public static void main(String[] args){

        ObjectCar a = new ObjectCar(); //defined obj
        ObjectCar b = new ObjectCar();
        ObjectCar c = new ObjectCar();

        a.mod=2019; // giving value to the object a
        a.wheel=4;
        b.mod=2020;
        b.wheel=4;
        c.mod=2021;
        c.wheel=4;


      System.out.println(a.mod);
      System.out.println(a.wheel);
      System.out.println(b.mod);
      System.out.println(b.wheel);
      System.out.println(c.mod);
      System.out.println(c.wheel);



    }
}
