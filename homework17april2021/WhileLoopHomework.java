package homework17april2021;


public class WhileLoopHomework {
    public static void main(String[] args) {
        int a = 10;
        int o = 1;

        while (o <= a) {
            if (o % 2 == 0) {
                System.out.println(o + "");
            }
//Cannot print the odd numbers for some reason :(

            else if (a % 2 != 0)
                System.out.println(a + "");
            o++;

        }
    }

}


























