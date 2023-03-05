package Q2;

// Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.

public class Employee implements Comparable<Employee> {
    private Double age ;
    private Double salary ;
   private String FName ;
    private String LName ;

    Employee(Double age , Double salary , String FName , String LName ){
        this.age = age ;
        this.FName = FName ;
        this.salary = salary ;
        this.LName = LName ;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }


    @Override
    public int compareTo(Employee obj) {
        if(this.FName.compareTo(obj.FName) > 0){
            return 1 ;
        }else if(this.FName.compareTo(obj.FName) < 0){
            return -1 ;
        }else if(this.FName.compareTo(obj.FName )== 0) {


            if(this.LName.compareTo(obj.LName) > 0 ){
                return 1 ;
            }else if(this.LName.compareTo(obj.LName) < 0){
                return -1 ;
            }else return 1 ;
        }
        return 1 ;



    }

    @Override
    public String toString() {
        return  this.FName + " & Salary :- "+this.salary  ;
    }
}
