package vn.lnquang.manage.student.model;

import java.util.Scanner;

public class Instructor extends Person {
    private int id;
    private double SalaryIndex;
    private double TeachingHours;

    public Instructor() {
    }

    public Instructor(int id, double salaryIndex, double teachingHours) {
        this.id = id;
        SalaryIndex = salaryIndex;
        TeachingHours = teachingHours;
    }

    public Instructor(String Name, String Gender, String Birthday, String Address, int id, double salaryIndex, double teachingHours) {
        super(Name, Gender, Birthday, Address);
        this.id = id;
        SalaryIndex = salaryIndex;
        TeachingHours = teachingHours;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getSalaryIndex() {
        return SalaryIndex;
    }

    public void setSalaryIndex(double salaryIndex) {
        SalaryIndex = salaryIndex;
    }

    @Override
    public double getTeachingHours() {
        return TeachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        TeachingHours = teachingHours;
    }
}
