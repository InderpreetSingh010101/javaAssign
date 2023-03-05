package Q4;

import java.util.HashMap;
import java.util.Map;

//Create class Employee with attributes
// name,age,designation and use instances of these class as keys in a Map and their salary as value
public class q4 {
    public static void main(String[] args) {

        employee e1 = new employee("Ips" , 22 , "SDE" ) ;
        employee e2 = new employee("Raj" , 25 , "SDE - 1" ) ;
        employee e3 = new employee("Pankaj" , 26 , "SDE - 2" ) ;
        employee e4 = new employee("Jazz" , 29 , "SDE" ) ;
        employee e5 = new employee("Ips" , 22 , "SDE" ) ;

        HashMap<employee , Integer> hm = new HashMap<>() ;
        hm.put(e1 , 20000);
        hm.put(e2 , 12000);
        hm.put(e3 , 22000);
        hm.put(e4 , 23000);
        hm.put(e5 , 27000);

        for (Map.Entry<employee,Integer> e : hm.entrySet()){
            System.out.println("Key Is :- "+ e.getKey() + " " + "Salary Is" + e.getValue());
        }




    }
}
