package Q1;

// Write the following a functional interface and implement it using lambda:
//
//    To check whether the first number is greater than second number or not, Parameter (int ,int )
//    Return type boolean


//    Increment the number by 1 and return incremented value Parameter (int) Return int
//    Concatination of 2 string Parameter (String , String ) Return (String)
//    Convert a string to uppercase and return . Parameter (String) Return (String)
public class q1 {
    public static void main(String[] args) {

        intef_big ob1 = (int a , int b)->{

            if(a > b) return true;
            else return false ;

        };
        System.out.println(ob1.chk(4,3));

        concat obj2  = (String str1 , String str2)->{
              return str1+str2 ;
        };

        System.out.println(obj2.cc("abc" , "xyz"));

        upper obj3 = (String str)->{
           return str.toUpperCase() ;
        };

        System.out.println(obj3.uppr("convert this") ) ;


    }
}
