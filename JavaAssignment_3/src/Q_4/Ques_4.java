package Q_4;

import java.util.Scanner;

//Write a program to show application of Factory Design Pattern.
public class Ques_4 {

    public static void main(String[] args) {
        System.out.println("q4");
        Scanner scn =new Scanner(System.in) ;

        System.out.println("Choose animal CAT , DOG , COW");
        String str = scn.nextLine() ;

        FactoryMethod fac = new FactoryMethod() ;
        Animals an = fac.chooseAnimal(str);
        System.out.println(str + " -> " + an.sound() );
    }
}
