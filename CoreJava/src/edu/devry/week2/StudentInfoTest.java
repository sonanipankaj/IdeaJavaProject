package edu.devry.week2;

import java.text.DecimalFormat;
import java.util.Scanner;


public class StudentInfoTest {

    static Scanner input = new Scanner(System.in);
    static StudentInfo student = new StudentInfo();
    public static void main(String[] args)
    {

       String answer = "";
       double pointsInt = 0;
       double  totalCredits = 0;
       boolean isFirstTime  = true;

        do{

           if(isFirstTime) {
               input = new Scanner(System.in);
               String studentName;
               System.out.println("Enter your name: ");
               studentName = input.nextLine();
               student.setStudentName(studentName);
               isFirstTime = false;
           }
            int credit;
            System.out.println("Enter your class credits: ");
            credit =(input.nextInt());
            student.setTotalCredits(credit);


            String letterGrade;
            input = new Scanner(System.in);
            System.out.println("Enter your Letter Grade: ");
            letterGrade = (input.nextLine());
            student.setLetterGrade(letterGrade);

            pointsInt+=calculatePoints(credit, letterGrade);
            totalCredits += credit;

            System.out.print("Another class (Y/N) ? \n");
            input = new Scanner(System.in);
            answer = (input.nextLine());

        }while(answer.equalsIgnoreCase("Y"));

        double calculatedGPA = calculateGPA(pointsInt,totalCredits);

        displayStudentInfo(calculatedGPA);

        input.close();


    }//end of main class

    public static double calculateGPA(double points, double credit){
           double  calGPA =0.0;

        calGPA = (points / credit);

        return calGPA;
    }



    public static int calculatePoints(int credits, String grade) {
        int points = 0;

        // totLetGrad += credits;
        if (grade.equalsIgnoreCase ("A"))
        {
            points = 4*credits;
        }
        else if (grade.equalsIgnoreCase ("B"))
        {
            points = 3*credits;
        }
        else if (grade.equalsIgnoreCase ("C"))
        {
            points = 2*credits;
        }
        else if (grade.equalsIgnoreCase ("D"))
        {
            points = 1*credits;
        }
        else if (grade.equalsIgnoreCase("E"))
        {
            points = 0*credits;
        }

        return points;
    }

    public static void displayStudentInfo(double gpa){

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print(student.getStudentName());
        System.out.println(",  Your GPA is: " +df.format(gpa));

    }

}
