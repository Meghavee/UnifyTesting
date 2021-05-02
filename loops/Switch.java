package loops;

import java.sql.SQLOutput;

public class Switch {
    public static void main(String[] args) {
        int day = 3 ;
        switch (day){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
               break;
                case 3 :
                System.out.println("wed");
               break;

            case 4:
                System.out.println("thru");
               break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default://can say else is like default
                System.out.println("not available");


        }
    }
}
