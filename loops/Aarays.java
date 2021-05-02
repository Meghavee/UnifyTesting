package loops;

import java.sql.SQLOutput;
//AARAYS - INDEX ALWAYS START FROM 0
public class Aarays {
    public static void main(String[] args) {
      /* int a = 10;
        a = 20;//override
        a = 30;//latest value will print
        System.out.println(a);
        //to define array //INT AARAY
        int i[] = new int[3];
        i[0] = 10;//0 is index value
        i[1] = 20;
        i[2] = 30;
        System.out.println(i[1]);
        System.out.println(i.length);
        System.out.println(i[1] + i[2]);
        //to print all the values - for loop
        for (int j = 0; j < i.length; j++) { // j will be used as the index
            System.out.println(i[j]);
        }*/
       /* // String Array
        String names[] = new String[9];
        names[0] = "Megha";
        names[1] = "Pragna";
        names[2] = "aarav";
        names[3] = "Jay";
        names[4] = "vaishali";
        names[5] = "Pragna";
        names[6] = "aarav";
        names[7] = "Jay";
        names[8] = "Nipa";
        System.out.println(names.length);
        //to print all names - for loop
        for (int n = 0; n < names.length; n++) {
            System.out.println(names[n]);
        }*/
        //OBJECT ARRAY - ALLOW TO STORE MULTIPLE DATATYPES IN INE VARIABLE

        Object emp[] = new Object[5];

        emp[0] = "Megha";
        emp[1] = "30";
        emp[2] = "f";
        emp[3] = "5.2";
        emp[4] = "False";
      //  System.out.println(emp[0]);

        for( int n = 0; n<emp.length; n++){
            System.out.println(emp[n]);
        }









}


    }


