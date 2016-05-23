package edu.devry.week3;

import java.util.Scanner;

public class AccountTest {
    String accType;

    public static void main(String[] args) {

        CheckingAcc ChkAcc = new CheckingAcc();

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
                ChkAcc.setAccType("Checking");
                ChkAcc.setAccHolderName(accName);
                ChkAcc.setAccNumber(accNumber++);
                ChkAcc.setAccBalance(50);
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
        ChkAcc.setAccType(ChkAcc.getAccType());
        ChkAcc.setAccHolderName(accName);
        ChkAcc.setAccNumber(accNumber++);
        input = new Scanner(System.in);
        double firstDeposit;
        System.out.print("Please Enter Deposit Amount: ");
        firstDeposit = input.nextDouble();
        ChkAcc.setAccBalance(firstDeposit);

        ChkAcc.displayAccount();




    }

}
