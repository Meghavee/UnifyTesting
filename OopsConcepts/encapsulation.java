package OopsConcepts;


//wrap data in a single unit - encuplation
public class encapsulation {
    public String name ;
    public int id;
    private  int salary ;// can be used only in current class

   //private cannot access in the diff class so thats why we need to create get and set method


//creted a public getter and setter method
public int getSalary(){
    return salary;
}

public void setSalary(int salary){ // mot initialized public variable
    this.salary=salary;


}

}

//{
//    public void getempname(){
//        System.out.println("Employee name");
//    }
//    public
//
//
//}
