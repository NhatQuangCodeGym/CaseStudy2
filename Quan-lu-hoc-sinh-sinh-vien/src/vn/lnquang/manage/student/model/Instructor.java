package vn.lnquang.manage.student.model;

public class Instructor extends Person {
    private double salaryIndex;
    private double teachingHours;
    public Instructor() {
    }

    public Instructor(double salaryIndex, double teachingHours) {
        this.salaryIndex = salaryIndex;
        this.teachingHours = teachingHours;
    }

    public Instructor(String Name, String Gender, String Birthday, String Address, double salaryIndex, double teachingHours) {
        super(Name, Gender, Birthday, Address);
        this.salaryIndex = salaryIndex;
        this.teachingHours = teachingHours;
    }

    public void setSalaryIndex(double salaryIndex) {
        this.salaryIndex = salaryIndex;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

    public double getSalaryIndex() {
        return salaryIndex;
    }
}
