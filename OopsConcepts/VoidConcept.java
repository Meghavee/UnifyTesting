package OopsConcepts;

public class VoidConcept {

    int salary=2000;
    public static int returnNumber() {
        int a = 10;
        return a;

//        if (a >= 5) {
//            System.out.println("A is big");
//        } else {
//            System.out.println("A is Small");
//        }
    }

    public static void main(String[] args) {
        int b =returnNumber();
        System.out.println(b);
    }
}
