package vn.lnquang.manage.student.model;

import java.util.Scanner;

public class Instructor extends Person {

    String Class;
    double SalaryIndex;
    double TeachingHours;

    public Instructor() {
    }

    public Instructor(String Class, double Salary, double TeachingHours) {
        this.Class = Class;
        this.SalaryIndex = Salary;
        this.TeachingHours = TeachingHours;
    }

    public Instructor(String Name, String Gender, String Birthday, String Address, String aClass, double salaryIndex, double teachingHours) {
        super(Name, Gender, Birthday, Address);
        Class = aClass;
        SalaryIndex = salaryIndex;
        TeachingHours = teachingHours;
    }
    @Override
    public String getClassRoom() {
        return Class;
    }

    public void setClassRoom(String Lop_hoc) {
        this.Class = Lop_hoc;
    }
    @Override
    public double getSalaryIndex() {
        return SalaryIndex;
    }

    public void setSalaryIndex(double Salary) {
        this.SalaryIndex = Salary;
    }
    @Override
    public double getTeachingHours() {
        return TeachingHours;
    }

    public void setTeachingHours(double Hours) {
        this.TeachingHours = Hours;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + " Lop_hoc=" + Class + ", Luong=" + SalaryIndex + ", So_gio_day=" + TeachingHours;
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhap ten lop hoc:");
        Class = sc.nextLine();
        System.out.println("Nhap Luong:");
        SalaryIndex = sc.nextFloat();
        System.out.println("Nhap so gio day:");
        TeachingHours = sc.nextInt();
        System.out.println();
    }


}
