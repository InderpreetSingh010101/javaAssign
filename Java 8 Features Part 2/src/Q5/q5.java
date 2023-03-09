package Q5;
// Given a list of objects of following class:
//      class Employee{
//      String fullName;
//      Long salary;
//      String city;
//      }
//     Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//     Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class employee{
          String fullName;
          Long salary;
          String city;

          employee(String fullName , Long salary , String city){
              this.fullName = fullName ;
              this.salary = salary ;
              this.city = city ;
          }

//    @Override
//    public String toString() {
//        return this.fullName;
//    }
}
public class q5 {
    public static void main(String[] args) {
//        System.out.println("this");

        List<employee> list  = new ArrayList<>() ;

        list.add(new employee("Ips Singh S" , 4000L, "Delhi")) ;
        list.add(new employee("Ips Singh S" , 4000L, "Delhi")) ;
        list.add(new employee("Ram p Sethi" , 2020L, "Delhi")) ;
        list.add(new employee("Ips JJ Sethi" , 26000L, "Delhi")) ;
        list.add(new employee("Jazz Singh S" , 25000L, "Delhi")) ;


//         list.stream()
//                        .map(e-> e.fullName.toString())
//                 .map(e->e.subSequence(0,()->e.indexOf(" ")))
//                        .forEach(System.out::println);
//                .filter(e->e.fullName.endsWith(""))


        System.out.println(
                list.stream()

                 .filter(e->e.salary < 5000L)
                 .filter(e->e.city.equals("Delhi"))
                 .map(e->e.fullName.toString())
                 .map(str->str.substring(0,str.indexOf(' ' )))
                        .distinct()                // for distinct name
                 //.collect(Collectors.toSet())  // by using set as for distinct names

                        .collect(Collectors.toList())
                       // .forEach(System.out::println);
        );

    }
}
