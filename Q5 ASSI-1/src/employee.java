
//Create a class named Employee with fields firstname,lastname,age and designation.
//        The class should:
//
//        have all types of constructors to initialize the object
//class should also have setter methods to update a particular field
//        Override its toString method to display a meaningful message using all these fields.

public class employee {
    public String firstname ;
    public String lastname ;
    public String age ;
    public String designation ;

    employee(){
        this.firstname="" ;
        this.lastname="" ;
        this.age="";
        this.designation="" ;
    }

    employee(String f , String l , String a , String age , String des){
        this.firstname=f ;
        this.lastname=a ;
        this.age=age;
        this.designation=des ;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }
    public String toString(){
        return firstname +"->"+lastname +"->"+age + "->"+designation ;

    }
}
