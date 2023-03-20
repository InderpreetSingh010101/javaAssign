package Q4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Create class Employee with attributes
// name,age,designation and use instances of these class as keys in a Map and their salary as value
public class Q4 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ips" , 22 , "SDE" ) ;
        Employee e2 = new Employee("Raj" , 25 , "SDE - 1" ) ;
        Employee e3 = new Employee("Pankaj" , 26 , "SDE - 2" ) ;
        Employee e4 = new Employee("Jazz" , 29 , "SDE" ) ;
        Employee e5 = new Employee("Ips" , 22 , "SDE" ) ;

        HashMap<Employee, Integer> hm = new HashMap<>() ;
        hm.put(e1 , 20000);
        hm.put(e2 , 12000);
        hm.put(e3 , 22000);
        hm.put(e4 , 23000);
        hm.put(e5 , 27000);

        for (Map.Entry<Employee,Integer> e : hm.entrySet()){
            System.out.println("Key Is :- "+ e.getKey() + " " + "Salary Is" + e.getValue());
        }

        HashSet<Integer> hs = new HashSet<>();




    }
}
