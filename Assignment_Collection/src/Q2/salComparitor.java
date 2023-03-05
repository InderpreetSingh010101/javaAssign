package Q2;

import java.util.Comparator;

public class salComparitor implements Comparator<Employee> {
    @Override
    public int compare(Employee obj1 , Employee obj2){
        if( (obj1.getSalary() )   >= (obj2.getSalary())){
            return 1 ;
        }else{
            return -1 ;
        }
    }
}
