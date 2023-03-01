import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {


  public static void main(String[] args) {

      System.out.println("Enter the strings ") ;
      List<String> st = new ArrayList<>() ;
      Scanner scn =  new Scanner(System.in) ;
      while(true){
          String s = scn.nextLine() ;
          if(s.equals("XDONE")){
              break ;
          }
          st.add(s) ;
      }
      for(String s : st){
          System.out.println(s);
      }
 }
}