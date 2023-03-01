package Q1.classes;

public class SBI extends Bank{
    public String getName() {
        return name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public int getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public int getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setPersonalLoanInterestRate(int personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(int homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public String toString(){

        String s = "Details for SBI Are :-" + name +"->" + headofficeAddress + "->" + chairmanName +"->"+branchCount+"->pLIR " +personalLoanInterestRate + "->hLIR "+homeLoanInterestRate;


        return s;
    }
}
