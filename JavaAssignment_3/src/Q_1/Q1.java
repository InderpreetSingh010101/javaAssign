package Q_1;
//Write a program to display values of enums using a constructor & getPrice() method
// (Example display house & their prices)
public class Q1 {
    public static void main(String[] args){

          //  Enums are trated as objects(By default are objects)
        // their constructor are private
        // enumms are public static final
        //
        for(EnumClass obj : EnumClass.values()){
            System.out.println("Rate For :" + obj + "is in Rs " + obj.getPrice());
        }

    }
}
