package vn.lnquang.manage.student.model;

import java.util.Scanner;

public class Student extends Person {

    int id;
    double AverageScore;
    String Email;
    static int count=0;

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    public Student() {
    }

    public Student(String Name, String Gender, String Birthday, String Address, double averageScore, String email) {

        super(Name, Gender, Birthday, Address);
        count++;
        this.id = count;
        AverageScore = averageScore;
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int Ma_sv) {
        this.id = Ma_sv;
    }

    public double getAverageScore() {
        return AverageScore;
    }

    public void setAverageScore(double Diem_tb) {
        this.AverageScore = Diem_tb;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Student(int Ma_sv, double Diem_tb, String Email) {
        this.id = Ma_sv;
        this.AverageScore = Diem_tb;
        this.Email = Email;
    }

    @Override
    public void inputInfo() {
//        Scanner sc = new Scanner(System.in);
//        super.inputInfo();
//        System.out.println("Nhap ma sinh vien");
//        id = sc.nextLine();
//        if (id.length() > 8) {
//            System.out.println("Nhap lai ma sinh vien:");
//            id = sc.nextLine();
//        }
//        System.out.println("Nhap Diem trung binh");
//        AverageScore = Float.parseFloat(sc.nextLine());
//        if (AverageScore < 0.0 || AverageScore > 10.0) {
//            System.out.println("Nhap Diem trung binh:");
//            AverageScore = Float.parseFloat(sc.nextLine());
//        }
//        System.out.println("Nhap Email");
//        Email = sc.nextLine();
//        if (Email.contains("@")) {
//            System.out.println("Nhap lai Email:");
//            Email = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Ma_sv=" + id + ", Diem_tb=" + AverageScore + ", Email=" + Email;
    }

    public boolean kiem_tra_hb() {
        if (AverageScore >= 8.0) {
            return true;
        } else {
            return false;
        }
    }

}