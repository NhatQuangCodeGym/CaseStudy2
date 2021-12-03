package vn.lnquang.manage.student.model;

import java.util.Scanner;

public class Person {
    String Name, Gender, BirthDay, Address;
    Scanner scan = new Scanner(System.in);
    public Person() {
    }

    public Person(String Name, String Gender, String Birthday, String Address) {
        this.Name = Name;
        this.Gender = Gender;
        this.BirthDay = Birthday;
        this.Address = Address;
    }
    public double getAverageScore() {
        return -1;
    }

    public String getClassRoom() {
        return null;
    }

    public double getSalaryIndex() {
        return -1;
    }

    public double getTeachingHours() {
        return -1;
    }
    public int getId(){
        return -1;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Ten) {
        this.Name = Ten;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gioi_tinh) {
        this.Gender = Gioi_tinh;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String Ngay_sinh) {
        this.BirthDay = Ngay_sinh;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Dia_chi) {
        this.Address = Dia_chi;
    }

    public void inputInfo(){
        System.out.println("Nhap ten:");
        Name = scan.nextLine();
        System.out.println("Nhap gioi tinh");
        Gender = scan.nextLine();
        System.out.println("Nhap ngay sinh");
        BirthDay = scan.nextLine();
        System.out.println("Nhap dia chi");
        Address = scan.nextLine();
        System.out.println();
    }
    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ten=" + Name + ", Gioi_tinh=" + Gender + ", Ngay_sinh=" + BirthDay + ", Dia_chi=" + Address;
    }

}
