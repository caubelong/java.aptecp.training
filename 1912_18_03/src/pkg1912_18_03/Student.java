/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1912_18_03;

import java.util.Scanner;

public class Student {
    private static int numberOfStudent = 0;
    private int studentId;
    private String fullName, dateOfBirth;
    private Gender gender;
    private float math, physics, chemistry;

    private Scanner getScanner() {
        return new Scanner(System.in);
    }

    enum Gender {
        MALE,
        FEMALE,
        UNKNOWN
    }

    public Student() {
        numberOfStudent++;
        studentId = numberOfStudent;
    }

    public void inputStudent() {
        System.out.println(" Enter fullname Student : ");
        this.fullName = getScanner().nextLine();
        System.out.println("enter dob : ");
        this.dateOfBirth = getScanner().nextLine();
        System.out.println("Enter gender(0 - female, 1 - male, 2 - unknown): ");
        int myGender = getScanner().nextInt();
        if (myGender == 0) {
            this.gender = Gender.FEMALE;
        }
        if (myGender == 1) {
            this.gender = Gender.MALE;
        } else {
            this.gender = Gender.UNKNOWN;
        }
    }

    public void inputPoint() {
        System.out.println("Enter point for Student : " + this.fullName);
        System.out.println(" Point math:");
        this.math = getScanner().nextFloat();
        System.out.println("enter physics:");
        this.physics = getScanner().nextFloat();
        System.out.println(" Enter chemistry");
        this.chemistry = getScanner().nextFloat();
    }

    @Override
    public String toString() {
        return "fullname: " + this.fullName + "\n"
                + "dateOfBirth: " + this.dateOfBirth + "\n"
                + "gender: " + this.gender + "\n"
                + "math: " + this.math + "\n"
                + "physics: " + this.physics + "\n"
                + "chemistry: " + this.chemistry + "\n";
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public String getDob(){
        return dateOfBirth;
    }
    public void setDob(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender gender){
        this.gender=gender;
    }
    public Float getMath(){
        return math;
    }
    public void setMath(float math){
        this.math=math;
    }
       public Float getPhysical(){
        return physics;
    }
    public void setPhysics(float physics){
        this.physics=physics;
    }
       public Float getChemistry(){
        return chemistry;
    }
    public void setChemistry(float chemistry){
        this.chemistry=chemistry;
    }
    public boolean canGetScholarship(){
        //Viet kieu nguoc(hay dung truong truong hop validate thong tin)
        if(math <5.0 || physics<5.0 || chemistry<5.0){
            return false;
        }
        if((math + physics + chemistry) / 3 <= 8.0) {
            return false;
        }
        else {
            return true;
        }
    }
    
}

