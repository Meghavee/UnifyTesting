package loops;
//to fetch data from rows and coloumns
public class Twodim {
    public static void main(String[] args) {
        // 5 10 15
        //20 25 30
        //35 40 45
        //how to declare 2 dim
        int dim[][] = new int[4][4];
        dim[0][0] = 5;
        dim[0][1] = 10;
        dim[0][2] = 15;
        dim[0][3] = 20;


        dim[1][0] = 25;
        dim[1][1] = 30;
        dim[1][2] = 35;
        dim[1][3] = 40;

        dim[2][0] = 45;
        dim[2][1] = 50;
        dim[2][2] = 55;
        dim[2][3] = 60;

        System.out.println(dim[2][3]);

        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length; j++) {

                // System.out.println(dim[i][j]);
                System.out.print(dim[i][j] + " ");
            }
                System.out.println();
            }
        }
    }






