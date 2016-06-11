package edu.devry.week3;

import java.util.Scanner;

public class AccountTest {
    String accType;

    public static void main(String[] args) {

        CheckingAcc chkAcc = new CheckingAcc();

        Scanner input = new Scanner(System.in);

        int accNumber = 1000;
      /*  String answer = "";
        boolean isFirstTime  = true;
        do {
            if(isFirstTime) {
                input = new Scanner(System.in);
                String accName;
                System.out.println("Creating a Checking Account, Enter Acc Holder Name: ");
                accName = input.nextLine();
                chkAcc.setAccType("Checking");
                chkAcc.setAccHolderName(accName);
                chkAcc.setAccNumber(accNumber++);
                chkAcc.setAccBalance(50);
               // accNumber++;
                isFirstTime = false;
            }

            System.out.print("Do you want create another Account (Y/N) ? \n");
            input = new Scanner(System.in);
            answer = (input.nextLine());

        }while(answer.equalsIgnoreCase("Y"));*/

        input = new Scanner(System.in);
        String accName;
        System.out.print("Creating a Checking Account, Enter Acc Holder Name: ");
        accName = input.nextLine();
        chkAcc.setAccType(chkAcc.getAccType());
        chkAcc.setAccHolderName(accName);
        chkAcc.setAccNumber(accNumber++);
        input = new Scanner(System.in);
        double firstDeposit;
        System.out.print("Please Enter Deposit Amount: ");
        firstDeposit = input.nextDouble();
        chkAcc.setAccBalance(firstDeposit);

        chkAcc.displayAccount();

        input = new Scanner(System.in);
        double firstWithdrawal;
        System.out.print("Please Enter Withdraw Amount: ");
        firstWithdrawal = input.nextDouble();

        chkAcc.processWithdrawal(firstWithdrawal);

        input = new Scanner(System.in);
        double secondWithdrawal;
        System.out.print("Please Enter Withdraw Amount: ");
        secondWithdrawal = input.nextDouble();

        chkAcc.processWithdrawal(secondWithdrawal);



    }

}
