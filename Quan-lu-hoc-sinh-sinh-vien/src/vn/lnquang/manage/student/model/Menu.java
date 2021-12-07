package vn.lnquang.manage.student.model;

//import vn.lnquang.manage.student.views.InstructorManagement;
import vn.lnquang.manage.student.service.InstructorService;
import vn.lnquang.manage.student.service.StudentService;
import vn.lnquang.manage.student.views.View;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                        instructorManager();
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
        View view = new View();
        Scanner scanner = new Scanner(System.in);
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
                        view.addStudentIntoList();

                            break;
                        case 2:
                        view.showStudentList();
                            break;
                        case 3:
                            view.checkList();
                            break;
                        case 4:
                            view.printQuantity();
                            break;
                        case 5:
                            view.resetStudentList();
                            break;
                        case 6:

                            break;
//                        case 7:
//                            student.checkRemove();
//                            break;
//                        case 8:
//                            student.checkStudent();
//                            break;
//                        case 9:
//                            break;
//                        case 10:
//                            break;
//                        case 11:
//                            break;
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
    public static void instructorManager(){
        Scanner scanner = new Scanner(System.in);
        InstructorService teacher = new InstructorService();
        do {

            System.out.println("Menu--------");
            System.out.println("Vui long chon chuc nang");
            System.out.println("1. Thêm giảng viên vào danh sách");
            System.out.println("2. Hiển thị danh sách giảng viên hiện có.");
            System.out.println("3. Kiểm tra danh sách giảng viên có rỗng không.");
            System.out.println("4. Đếm số lượng giảng viên trong danh sách");
            System.out.println("5. Reset danh sách giảng viên");
            System.out.println("6. Tìm giảng viên theo tên.");
            System.out.println("7. Tính lương của giảng viên theo tên");
            System.out.println("0. Ket thuc chuong trinh.");
            System.out.println("Nhap so: ");
            try {
                int choice = Integer.parseInt(scanner.next());
                if (choice > 0 && choice < 8) {
                    switch (choice) {
                        case 1:
                            teacher.add();
                            break;
                        case 2:
                            teacher.showInstructorList();
                            break;
                        case 3:
                            teacher.alert();
                            break;
                        case 4:
                            teacher.printQuantity();
                            break;
                        case 5:
                            teacher.emptyInstructorList();
                            break;
                        case 6:
                            teacher.checkInstructor();
                            break;
                        case 7:
                            teacher.getSalary();
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

    public static void classRoomManager(){

    }
    }

