package vn.lnquang.manage.student.views;

import vn.lnquang.manage.student.model.Instructor;
import vn.lnquang.manage.student.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstructorManagement {
    final Scanner scanner = new Scanner(System.in);
    List<Instructor> instructors = new ArrayList<>();
//    1. Them giang vien vao danh sach
    public void add(){
//        System.out.println("Nhap ten giang vien: ");
//        String name = scanner.nextLine();
//        System.out.println(" Nhap gioi tinh: ");
//        String gender = scanner.nextLine();
//        System.out.println(" Nhap ngay sinh: ");
//        String birthDay = scanner.nextLine();
//        System.out.println("Nhap dia chi: ");
//        String address = scanner.nextLine();
//        System.out.println("Nhap lop cua Giang Vien: ");
//        String aClass = scanner.nextLine();
//        System.out.println("Nhap luong cua Giang Vien: ");
//        double salary = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Nhap so gio day cua Giang Vien: ");
//        double teachingHours = scanner.nextDouble();
//        scanner.nextLine();
        instructors.add(new Instructor("A","Nam","456456","dfgdfg","10A5",60000.00,70.0));
        instructors.add(new Instructor("B","Nu","456456","dfgdfg","10A5",50000.00,45.5));
        instructors.add(new Instructor("C","Nu","456456","dfgdfg","10A5",40000.00,45.5));
    }
    //    2. Hien thi danh sach sinh vien
    public List<Instructor> getStudents() {
        return instructors;
    }
    public void showInstructorList() {
        for (Instructor giangvien : instructors) {
            System.out.println(giangvien);
        }
    }
//    3.Tinh luong cua giang vien
public double tinh_luong(String name) {
    double basicSalary = 2000000;
    for (Instructor instructor: instructors) {
        if (instructor.getName().equals(name)) {
            if (instructor.getClassRoom().contains("A")) {
                double totalSalary = instructor.getSalaryIndex() * instructor.getTeachingHours() + basicSalary;
                return totalSalary;
            } else {
                double totalSalary = instructor.getSalaryIndex() * instructor.getTeachingHours();
                return totalSalary;
            }
        }
    }return -1;
}
}
