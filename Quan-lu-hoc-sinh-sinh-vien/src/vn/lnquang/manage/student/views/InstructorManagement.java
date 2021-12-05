package vn.lnquang.manage.student.views;

import vn.lnquang.manage.student.model.Instructor;
import vn.lnquang.manage.student.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstructorManagement {
    final Scanner scanner = new Scanner(System.in);
    List<Person> instructors = new ArrayList<>();
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
    //    2. Hien thi danh sach giang vien
    public List<Person> getInstructors() {
        return instructors;
    }
    public void showInstructorList() {
        for (Person giangvien : instructors) {
            System.out.println(giangvien);
        }
    }
//    3. Kiểm tra danh sách giảng viên có trống không
public boolean checkStudentList(){
    return instructors.isEmpty();
}
    public void alert(){
        if (this.checkStudentList())
            System.out.println("Không có giảng viên nào trong danh sách");
        else
            System.out.println("Có tồn tại giảng viên trong danh sách");
    }
//    4.Đếm số lượng giảng viên trong danh sách
public int checkQuantity(){
//            System.out.println(" Số lượng sinh viên trong danh sách là: ");
    return this.instructors.size();
}       public void printQuantity(){
        System.out.println("Số lượng sinh viên trong danh sách là: " + checkQuantity() );
    }
//5. Reset danh sách giảng viên
    public void emptyInstructorList(){
        instructors.removeAll(instructors);
        System.out.println("Danh sách đã được làm mới.");
    }
    //        6. Tìm giảng viên theo tên.
    public void findInstructor(String ten) {
        for (Person giangvien : instructors) {
            if (giangvien.getName().equals(ten)) {
                 System.out.println(giangvien.toString());
                 return;
            }else
                System.out.println("Không có giảng viên cần tìm");
        }
    }
    public void checkInstructor(){
        System.out.println(" Nhập vào tên sinh viên bạn muốn tìm:");
        String name = scanner.nextLine();
        findInstructor(name);
    }
//    3.Tinh luong cua giang vien
public double tinh_luong(String name) {
    double basicSalary = 2000000;
    for (Person instructor: instructors) {
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
    public void getSalary(){
        System.out.println("Nhập tên giảng viên cần tính lương: ");
        String name = scanner.nextLine();
        findInstructor(name);
        System.out.println(" có tổng lương là " + tinh_luong(name));

    }
//4. Xoa giang vien ra khoi danh sach
}
