package edu.devry.week3;

public class CheckingAcc extends Account {
    String accType ="Checking";
    double overDraft = 0.0;

    public CheckingAcc() {
    }

    public CheckingAcc(String accHolderName, Integer accNumber, double accBalance, String accType, double overDraft) {
        super(accHolderName, accNumber, accBalance);
        this.accType = accType;
        this.overDraft = overDraft;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public void processWithdrawal(double withdrawal){
        if(super.accBalance > withdrawal){
            super.processWithdrawal(withdrawal);
            System.out.println("You Account Balance: " + super.accBalance);
        }else{
            System.out.println("$10 Overdraft fee charged!");
            super.accBalance -= (withdrawal - 10);
            System.out.println("You Account Balance: " + super.accBalance);
        }
    }
    public void displayAccount(){
        System.out.println("Account Type: " +accType);
        super.displayAccount();
    }
}
