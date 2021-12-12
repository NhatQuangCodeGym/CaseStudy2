package vn.lnquang.manage.student.model;

//import vn.lnquang.manage.student.views.InstructorManagement;
import vn.lnquang.manage.student.views.View;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("FUNCTION:");
            System.out.println("-----------------------MENU------------------------");
            System.out.println("-----       1. Manage Current Student List    -----");
            System.out.println("-----       2. Manage Current Instructor List -----");
            System.out.println("-----       3. Manage Classroom               -----");
            System.out.println("-----       0. Ket thuc chuong trinh          -----");
            System.out.println("------------------------END------------------------");
            System.out.println("Input Your Number: ");
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
                        classRoomManager();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("THANKS FOR BEING YOUR CHOICE");
                    break;
                } else
                    System.out.println("PLEASE INPUT FROM 1 TO 3");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            while (true);

    }

    public static void studentManager(){
        View view = new View();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Vui long chon chuc nang");
            System.out.println("========================MENU==============================");
            System.out.println("========     1. Add Student Into List             ========");
            System.out.println("========     2. Show Current Student List         ========");
            System.out.println("========     3. Check Empty List                  ========");
            System.out.println("========     4. Count Student Quantity            ========");
            System.out.println("========     5. Reset Current Student List        ========");
            System.out.println("========     6. Check Student In List By ID       ========");
            System.out.println("========     7. Remove Student From List By ID    ========");
            System.out.println("========     8. Find Student By Name              ========");
            System.out.println("========     9. Sort Student By Average Score     ========");
            System.out.println("========     10. Export Student List Into File    ========");
            System.out.println("========     0. Request Ended                     ========");
            System.out.println("==========================================================");
            System.out.println("Input Your Number: ");
            try {
//                int choice = Integer.parseInt(scanner.next());
                int choice = scanner.nextInt();
                if (choice > 0 && choice < 12) {
                    switch (choice) {
                        case 1:
                        view.addStudentIntoList();

                            break;
                        case 2:
                        view.showStudentList();
                            break;
                        case 3:
                            view.checkStudentList();
                            break;
                        case 4:
                            view.printQuantity();
                            break;
                        case 5:
                            view.resetStudentList();
                            break;
                        case 6:
                            view.checkStudentInList();
                            break;
                        case 7:
                            view.checkRemove();
                            break;
                        case 8:
                            view.checkStudentByName();
                            break;
                        case 9:
                            view.sortStudentList();
                            break;
                        case 10:
                            view.WriteStudentList();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("TRY OTHER FUNCTIONS");
                    break;
                } else
                    System.out.println("Please input from 1 to 10");

            } catch (Exception e) {
                System.err.println("Please input number");
            }
        }
        while (true);
    }
    public static void instructorManager(){
        Scanner scanner = new Scanner(System.in);
        View view = new View();
        do {
            System.out.println("Vui long chon chuc nang");
            System.out.println("============================MENU==========================");
            System.out.println("========     1. Add Instructor Into List          ========");
            System.out.println("========     2. Show Current Instructor List      ========");
            System.out.println("========     3. Check Empty List                  ========");
            System.out.println("========     4. Count Instructor Quantity         ========");
            System.out.println("========     5. Reset Current List                ========");
            System.out.println("========     6. Find Instructor By Name           ========");
            System.out.println("========     7. Export Instructor List Into File  ========");
            System.out.println("========     0. Request Ended                     ========");
            System.out.println("==========================================================");
            System.out.println("Input Your Number ");
            try {
                int choice = Integer.parseInt(scanner.next());
                if (choice > 0 && choice < 8) {
                    switch (choice) {
                        case 1:
                            view.addInstructorIntoList();
                            break;
                        case 2:
                            view.showInstructorList();
                            break;
                        case 3:
                            view.checkInstructorList();
                            break;
                        case 4:
                            view.printInstructorQuantity();
                            break;
                        case 5:
                            view.resetInstructorList();
                            break;
                        case 6:
                            view.checkInstructorByName();
                            break;
                        case 7:
                            view.WriteInstructorList();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("Try Another Function");
                    break;
                } else
                    System.out.println("Input from 1 to 7");

            } catch (Exception e) {
                System.err.println("Please input number");
            }
        }
        while (true);
    }

    public static void classRoomManager(){
        Scanner scanner = new Scanner(System.in);
        View view = new View();
        do {
            System.out.println("FUNCTION:");
            System.out.println("============================MENU==============================");
            System.out.println("========        1.Create New Class                    ========");
            System.out.println("========        2. Add Instructor Into Your New Class ========");
            System.out.println("========        3. Add Student Into Your New Class    ========");
            System.out.println("========        4. Get Class Information By ID        ========");
            System.out.println("========        0. Request Ended                      ========");
            System.out.println("==============================================================");
            System.out.println("Input Number: ");
            try {
                int choice = Integer.parseInt(scanner.next());
                if (choice > 0 && choice < 5) {
                    switch (choice) {
                        case 1:
                            view.createClassRoom();
                            break;
                        case 2:
                            view.addInstructorIntoClass();
                            break;
                        case 3:
                            view.addStudentIntoClass();
                            break;
                        case 4:
                            view.getClassInformation();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("Thank you");
                    break;
                } else
                    System.out.println("Please input from 1 to 4");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (true);
    }
    }

