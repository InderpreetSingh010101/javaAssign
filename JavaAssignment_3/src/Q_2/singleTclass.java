package Q_2;

public class singleTclass {

    private static singleTclass obj ;
    private  String  F_name ;
    private String L_name ;
    private int age ;

    private int phone ;

    private singleTclass(String F_name , String L_name , int age , int phone){

        this.F_name  = F_name ;
        this.L_name = L_name ;
        this.age = age ;
        this.phone = phone ;
    }

    public static singleTclass getInstance(String F_name , String L_name , int age , int phone){
        if(obj == null){
            obj = new singleTclass(F_name , L_name , age , phone) ;
        }else{

            obj.F_name  = F_name ;
            obj.L_name = L_name ;
            obj.age = age ;
            obj.phone = phone ;

        }
        return obj ;
    }

     public String showDetails(){

        return "Details are " + "!Name! " + this.F_name + " " +this.L_name + "!Age! " + this.age + " !Phone !" +this.phone ;
     }

}
