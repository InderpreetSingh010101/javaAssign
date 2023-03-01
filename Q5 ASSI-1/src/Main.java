//Create a class named Employee with fields firstname,lastname,age and designation.
//        The class should:
//
//        have all types of constructors to initialize the object
//class should also have setter methods to update a particular field
//        Override its toString method to display a meaningful message using all these fields.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter The Details");
        Scanner scn = new Scanner(System.in) ;
        employee e = new employee();
        System.out.println("Enter The F name");
        e.setFirstname(scn.nextLine());
        System.out.println("Enter The L  Name");
        e.setLastname(scn.nextLine());
        System.out.println("Enter The age");
        e.setAge(scn.nextLine());
        System.out.println("Enter The Designation");
        e.setDesignation(scn.nextLine());

        System.out.println(" = " +e) ;
    }
}