package OopsConcepts;

public class Testenap {
    public static void main(String[] args) {
        encapsulation data = new encapsulation();
        data.name="mark";
        data.id=101;

        data.setSalary(5000);
        System.out.println(data.getSalary());
    }
}
