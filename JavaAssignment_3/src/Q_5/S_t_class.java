package Q_5;



public class S_t_class {

    private static S_t_class obj ;
    private  String  F_name ;
    private String L_name ;
    private int age ;

    private int phone ;

    private S_t_class(String F_name , String L_name , int age , int phone){

        this.F_name  = F_name ;
        this.L_name = L_name ;
        this.age = age ;
        this.phone = phone ;
    }

    public static S_t_class getInstance(String F_name , String L_name , int age , int phone){
        if(obj == null){
            obj = new S_t_class(F_name , L_name , age , phone) ;
        }else{

            obj.F_name  = F_name ;
            obj.L_name = L_name ;
            obj.age = age ;
            obj.phone = phone ;

        }
        return obj ;
    }

//    public String showDetails(){
//
//        return "Details are " + "!Name! " + this.F_name + " " +this.L_name + "!Age! " + this.age + " !Phone !" +this.phone ;
//    }


    @Override
    public String toString() {
        return "Details are :-" + this.F_name + " " + this.L_name + " \n" +"age :- " +this.age;
    }
}




