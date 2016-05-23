package edu.devry.week3;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.bind.v2.TODO;

public class Account {
    String accHolderName;
    Integer accNumber;
    double accBalance;

    public Account() {

    }

    public Account(String accHolderName, Integer accNumber, double accBalance) {
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public Integer getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    //TODO processDeposit

    public void processDeposit(double depositAmountIn) {
        if (depositAmountIn < 0)
            System.out.println("Sorry, you can not deposit a negative amount");
        else
            accBalance += depositAmountIn;
    }


    //TODO processWithdrawal
    public void processWithdrawal(double withdrawAmountIn) {
        if (withdrawAmountIn < 0)
            System.out.println("Sorry, you can not withdraw a negative amount");
        else
            accBalance -= withdrawAmountIn;
    }

    //display all account information
    public void displayAccount() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Account Balance: $" + accBalance);
    }


    public String toString() {
        return "Account{" +
                "accHolderName='" + accHolderName + '\'' +
                ", accNumber=" + accNumber +
                ", accBalance=" + accBalance +
                '}';
    }
}
