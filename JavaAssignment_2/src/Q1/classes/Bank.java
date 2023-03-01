//        Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.
//        All 3 should have following methods:

package Q1.classes;

abstract class Bank {

    public String name ;


    public String headofficeAddress ;
    public String chairmanName ;
    public int branchCount ;
    public int personalLoanInterestRate ;
        public int homeLoanInterestRate;

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
}
