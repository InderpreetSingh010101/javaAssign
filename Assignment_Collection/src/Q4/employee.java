package Q4;

import Q2.Employee;

import java.util.Objects;

// //Create class Employee with attributes
//// name,age,designation and use instances of these class as keys in a Map and their salary as value
final public class employee {
    private String name ;
    private int age ;
    private String designation;

    employee(String name , int age , String Designation){
        this.name = name ;
        this.age = age ;
        this.designation = Designation ;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.name , this.designation , this.age) ;
    }



    @Override
    public boolean equals(Object obj) {

        employee e = (employee) obj ;

        return e.name.equals(this.name) && e.designation.equals(this.designation) && e.age == this.age;

    }

    @Override
    public String toString() {
        return "Name :-" + this.name + " Age" + this.age;
    }
}
