package vn.lnquang.manage.student.model;

//import vn.lnquang.manage.student.views.InstructorManagement;
import vn.lnquang.manage.student.views.ClassRoomManagement;
import vn.lnquang.manage.student.views.InstructorManagement;
import vn.lnquang.manage.student.views.StudentManagement;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        StudentManagement list = new StudentManagement();
//                list.addStudent();
//                list.showStudentList();
//        System.out.println(list.checkStudentList());
//        System.out.println(list.checkQuantity());
        do {

            System.out.println("Menu--------");
            System.out.println("Vui long chon chuc nang");
            System.out.println("1. Quản lí danh sách sinh viên hiện có.");
            System.out.println("2. Quản lí danh sách giảng viên hiện có.");
            System.out.println("3. Quản lí lớp học.");
            System.out.println("0. Ket thuc chuong trinh.");
            System.out.println("Nhap so: ");
            try {
                int choice = Integer.parseInt(scanner.next());
                if (choice > 0 && choice < 4) {
                    switch (choice) {
                        case 1:
                        studentManager();
                            break;
                        case 2:
//                        instructorManager();
                            break;
                        case 3:
//                        classroomManager();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("tam biet");
                    break;
                } else
                    System.out.println("nhap tu 0-3");

            } catch (Exception e) {
                System.err.println("yeu cau nhap so");
            }
        }
            while (true);

    }

    public static void studentManager(){
        Scanner scanner = new Scanner(System.in);
        StudentManagement student = new StudentManagement();

        do {

            System.out.println("Menu--------");
            System.out.println("Vui long chon chuc nang");
            System.out.println("1. Thêm sinh viên vào danh sách");
            System.out.println("2. Hiển thị danh sách sinh viên hiện có.");
            System.out.println("3. Kiểm tra danh sách sinh viên có rỗng không.");
            System.out.println("4. Đếm số lượng sinh viên trong danh sách");
            System.out.println("5. Reset danh sách sinh viên");
            System.out.println("6. Kiểm tra sinh viên trong danh sách bằng MSV ");
            System.out.println("7. Xoá sinh viên ra khỏi danh sách bằng MSV");
            System.out.println("8. Tìm sinh viên theo tên.");
            System.out.println("9. Sắp xếp sinh viên theo điểm từ cao đến thấp");
            System.out.println("0. Ket thuc chuong trinh.");
            System.out.println("Nhap so: ");
            try {
                int choice = Integer.parseInt(scanner.next());
                if (choice > 0 && choice < 10) {
                    switch (choice) {
                        case 1:
                        student.addStudent();
//                        student.showStudentList();
                            break;
                        case 2:
                        student.showStudentList();
                            break;
                        case 3:
                            student.alert();
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;
                        case 11:
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("tam biet");
                    break;
                } else
                    System.out.println("nhap tu 0-3");

            } catch (Exception e) {
                System.err.println("yeu cau nhap so");
            }
        }
        while (true);
    }
    }

