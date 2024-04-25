package semester_2_as2;
//. Define a base class Person with instance variable name, age. The instance variables
//are initialized through constructors. The prototype of constructor is as below.
//Person (string, int)
//Define a derived class Employee with instance variables Eid, salary. The instance
//variables are initialized through constructors. The prototype of constructor is as below.
//Employee (string, int, int, double).
//Another instance method of Employee class is empDisplay() to display the information
//of employee details

import javax.swing.text.html.parser.TagElement;

public class person1 {
    static String name;
    static int age;
    person1(String name,int age){
        this.name=name;
        this.age= age;

    }
    static class employee extends person1{
        int eid;
        double Salary;
        public employee(String name,int age,int eid,double Salary){
            super(name,age);
            this.eid = eid;
            this.Salary =Salary;
        }
        void display(){
            System.out.println("name of employee:"+name);
            System.out.println("age of employee:"+age);
            System.out.println("eid of employee:"+eid);
            System.out.println("salary of employee:"+Salary);
        }
    }
    public static void main(String[] args) {
        employee p1 = new employee("ram",108,1080,10800.0);
        p1.display();

    }
}
