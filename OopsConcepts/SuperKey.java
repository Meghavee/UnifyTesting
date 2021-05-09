package OopsConcepts;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class SuperKey {
    int salary ;
    SuperKey(int salary){
        this.salary=salary;


//    void display(){
//        System.out.println("Class for Junior Tester"); // created method of parent class
    }
}
class SeniorTester extends SuperKey{
  //  int salary =4000; //access the variable of parent class
    int salary;
    SeniorTester(int salaryJunior , int salarySenoir){
        super(salaryJunior);
        salary =salaryJunior;
    }
   // void displaySalaries(){

  //  @Override
    void display() {
        System.out.println("class for  senoir Tester");
    }

    void hello(){
//        display();
//        super.display();
        System.out.println(salary + "  "+super.salary);

    //System.out.println("Junior Tester salary:"+super.salary);
       // System.out.println("Senior Tester Salary"+salary);
    }

    public static void main(String[] args) {
        SeniorTester obj =new SeniorTester(500,10000);
       //obj.displaySalaries();
        obj.hello();//
        obj.display();
    }
}
