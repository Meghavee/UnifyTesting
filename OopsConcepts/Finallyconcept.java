package OopsConcepts;

public class Finallyconcept {
    public static void main(String[] args) {
        try
        {
            int[] MyNumber = {10, 20, 30};
            System.out.println(MyNumber[100]);
        }
        catch (Exception e)
        {
            System.out.println("Something went Wrong");
        }
        finally
        {
            System.out.println("The try catch is finished");
        }

//        int[] MyNumber = {10, 20, 30};
//           System.out.println(MyNumber[1]);
    }
}
