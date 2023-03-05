package Q2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.
// Also, Write a program to sort Employee objects based on salary using Comparator.
public class q2 {
    public static void main(String[] args) {

        Employee e1 = new Employee(23.0 , 230001.0 , "IPs" , "Singh") ;
        Employee e2 = new Employee(20.0 , 23000.0 , "Raj" , "Kumar") ;
        Employee e3 = new Employee(23.0 , 230002.0 , "Babbar" , "yadav") ;
        Employee e4 = new Employee(23.0 , 230003.0 , "Abhisekh" , "Hanspal") ;

        List<Employee> ls = new ArrayList<>() ;

        ls.add(e1) ;
        ls.add(e2) ;
        ls.add(e3) ;
        ls.add(e4) ;

        System.out.println(ls);
//        Collections.sort(ls);    //  Using comparible
        Collections.sort(ls , new salComparitor());  // Using comparitor
        System.out.println(ls);


    }
}
