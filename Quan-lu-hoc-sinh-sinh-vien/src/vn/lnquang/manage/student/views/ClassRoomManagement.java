package vn.lnquang.manage.student.views;

import vn.lnquang.manage.student.model.Person;
import vn.lnquang.manage.student.views.InstructorManagement;
import vn.lnquang.manage.student.views.StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassRoomManagement {
    List<Person> ClassList = new ArrayList<>();
    List<Person> StudentList = new ArrayList<>();
    List<Person> InstructorList = new ArrayList<>();
//    1. Tao lop hoc
    public void adjustClass(StudentManagement studentList, InstructorManagement instructorList) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh can them vao lop: ");
        String name = scanner.nextLine();
        for (Person sinhvien : studentList.getStudents()) {
            if (sinhvien.getName().equals(name)) {
                ClassList.add(sinhvien);
            }
        }
        System.out.println("Nhap ten giao vien bo mon vao lop: ");
        String name1 = scanner.nextLine();;
        for (Person giangvien: instructorList.getInstructors()) {
            ClassList.add(giangvien);
        }

    }
//        2. Hien thi danh sach sinh vien trong lop
    public List<Person> getClassList(){
        return StudentList;
    }
    public void showClassList(){
        for (Person list: ClassList) {
            System.out.println(list);
        }
    }

}
