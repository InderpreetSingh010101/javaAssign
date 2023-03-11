package Q11;

import java.util.Objects;

//use record to create an immutable represent of student(name, id, age) and
// use its  constructor for initialization, equals to compare 2 students methods.
public record recordStudent(String name , int id , int age) {


    public static int count = 0 ;

    public recordStudent{
     count ++ ;
    }


@Override
public int hashCode(){

    return Objects.hash(this.name , this.age , this.id) ;

}


    @Override
    public boolean equals(Object obj){
        recordStudent r = (recordStudent) obj ;



        return this.id == r.id && this.age == r.age && this.name.equals(r.name) ;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        recordStudent that = (recordStudent) o;
//        return id == that.id && age == that.age && Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id, age);
//    }
}
