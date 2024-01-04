package org.launchcode;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int credits) {
        // Determine the grade level of the student based on numberOfCredits

        //int anum = this.numberOfCredits;
        if (credits < 30) {
            return "Freshman";
        } else if (credits < 60) {
            return "Sophomore";
        }
        else if (credits < 90) {
            return "Junior";
        }
        else{
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double qualityScore = this.gpa * this.numberOfCredits;
        qualityScore += (grade * courseCredits);
        this.numberOfCredits += courseCredits;
        this.gpa = qualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }

    @Override
    public String toString() {
        return "Student " + this.name + " is a " + this.getGradeLevel(this.numberOfCredits) + " with " + numberOfCredits
                + " credits and a GPA of " + gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getStudentId() == student.getStudentId();
        //book example:
        //        Student theStudent = (Student) toBeCompared;
        //        return theStudent.getStudentId() == getStudentId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudentId(), getNumberOfCredits(), getGpa());
    }
}