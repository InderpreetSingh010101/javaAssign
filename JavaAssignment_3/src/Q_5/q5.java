package Q_5;


//5) Write a program to show application of Singleton Design Pattern.
public class q5 {
    public static void main(String[] args) {
        System.out.println("Q5");
     s_t_class singleTone = s_t_class.getInstance("Ind" , "singh" , 22 , 9898) ;
        System.out.println(singleTone);
        s_t_class.getInstance("hIM" , "Var" , 25 , 121212) ;
        System.out.println(singleTone);

    }
}
