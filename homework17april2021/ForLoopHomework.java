package homework17april2021;

public class ForLoopHomework {
    public static void main(String[] args) {
        int n = 10;

        {
            System.out.println("Odd Numbers are");
            for (int a = 1; a <=n; a++) {
                if (a % 2!= 0)
                    System.out.println(a + "");
            }
            System.out.println("Even Numbers are");
            for (int a = 1; a <=n; a++) {
                if (a % 2 == 0){
                    System.out.println(a + "");
                }

            }
        }
    }
}















