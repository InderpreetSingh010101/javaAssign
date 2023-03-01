import java.util.Scanner;

public class Main {


    public static float areaC(int r){

        float area = (float) (3.14 * (r * r));

        return area ;

    }

    public static float PerimeterC(int r){
        float p = (float) (2 * (3.14 * r) );
        return p ;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        int ch = -1 ;
        while(ch!=3){

            System.out.println("1. Calculate Area Of Circle ") ;
            System.out.println("2. Calculate Perimeter Of Circle ") ;
            System.out.println("3. Exit ") ;
            ch = scn.nextInt() ;

             int r = 0 ;

            switch (ch){

                case 1: System.out.println("Enter the Radious");
                         r = scn.nextInt() ;
                         System.out.println(areaC(r));
                         break ;
                case 2: System.out.println("Enter the Radious");
                         r = scn.nextInt() ;
                          System.out.println(PerimeterC(r));
                          break ;



            }
        }


        System.out.println("Bye!");
    }
}