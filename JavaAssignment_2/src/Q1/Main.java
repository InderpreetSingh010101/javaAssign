package Q1;//) Implement a banking system using java. Create 3 sub class of Bank : SBI,BOI,ICICI
//        Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.
//        All 3 should have following methods:
//
//        add getters and setters for the fields
//        print details of every bank (override toString)
//
//        2) WAP showing try, multi-catch and finally blocks.
//
//        3) WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
//
//        4) Create a custom exception that do not have any stack trace.

import Q1.classes.SBI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Hello world!");
//        Name, headofficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.

        SBI b = new SBI();


        System.out.println("Enter The B name");
        b.setName(scn.nextLine());
        System.out.println("Enter The HofficeName name");
        b.setHeadofficeAddress(scn.nextLine());
        System.out.println("Enter The ChairName ");
        b.setChairmanName(scn.nextLine());

        System.out.println("Enter The Branch Count");
        b.setBranchCount(scn.nextInt());
        System.out.println("Enter The Personal Loan Interest");
        b.setPersonalLoanInterestRate(scn.nextInt());
        System.out.println("Enter The HomeLoanInterestRate bank");
        b.setHomeLoanInterestRate(scn.nextInt());




        System.out.println(b);
    }
}