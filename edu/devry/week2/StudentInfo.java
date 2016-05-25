package edu.devry.week2;

public class StudentInfo {


    private String studentName;
    private String addClass;

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    private String letterGrade;
    private int totalCredits;

    public StudentInfo() {
        studentName = "none";
        totalCredits = 0;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddClass() {
        return addClass;
    }

    public void setAddClass(String addClass) {
        this.addClass = addClass;
    }



    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }



}
