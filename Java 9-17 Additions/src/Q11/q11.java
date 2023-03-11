package Q11;
//use record to create an immutable represent of student(name, id, age) and
// use its  constructor for initialization, equals to compare 2 students methods.
// Also keep a static counter to keep the count of objects created.
public class q11 {
    public static void main(String[] args) {
        System.out.println("Q11");

        recordStudent stu = new recordStudent("Ips" , 1234 , 22) ;
        System.out.println(stu  + "No Of Obj created " + recordStudent.count);
        recordStudent stu1 = new recordStudent("Ips" , 1234 , 22) ;
        System.out.println(stu  + "No Of Obj created " + recordStudent.count);

        System.out.println("------------------------------------------------------------");

        System.out.println("Equals Method ");
        System.out.println(stu.equals(stu1));

        System.out.println("HashCodes");
        System.out.println(stu.hashCode());
        System.out.println(stu1.hashCode());



    }
}
