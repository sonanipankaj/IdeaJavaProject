package edu.devry.week3;

public class SavingAcc extends Account {

    String accType ="Saving";
    double interestEarned = 0.0;

    public SavingAcc() {
    }

    public SavingAcc(String accHolderName, Integer accNumber, double accBalance, String accType, double interestEarned) {
        super(accHolderName, accNumber, accBalance);
        this.accType = accType;
        this.interestEarned = interestEarned;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }

    public void processWithdrawal(double withdrawal){
        if(super.accBalance > withdrawal){
            super.processWithdrawal(withdrawal);
            System.out.println("You Account Balance: $" + super.accBalance);
        }else{
            System.out.println("Insufficient funds!");

            System.out.println("You Account Balance: $" + super.accBalance);
        }
    }
    public void displayAccount(){
        System.out.println("Account Type: " +accType);
        super.displayAccount();
    }
}
