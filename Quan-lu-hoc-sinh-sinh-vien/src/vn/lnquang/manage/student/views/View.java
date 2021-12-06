package vn.lnquang.manage.student.views;

import vn.lnquang.manage.student.service.ClassRoomService;
import vn.lnquang.manage.student.service.InstructorService;
import vn.lnquang.manage.student.service.StudentService;

import java.util.Scanner;

public class View {
    private final ClassRoomService classRoomService = new ClassRoomService();
    private final InstructorService instructorService = new InstructorService();
    private final StudentService studentService = new StudentService();
//    1. Tao lop hoc
    public String createClassRoom(){
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhap vao ID lop muon tao: ");
        String id = scanner.nextLine();
        System.out.println("Nhap vao giao vien chu nhiem");
        String name = scanner.nextLine();
        classRoomService.createClass(id,name,instructorService);
        return "Lớp " + id + " có GVCN là: " + name + " đã được tạo." ;
    }
//    2. Them giang vien vao lop hoc minh muon
    public String addInstructor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID lop hoc ban muon them giang vien vao: ");
        String id = scanner.nextLine();
        System.out.println("Nhap vao ten giang vien ban muon them vao: ");
        String name = scanner.nextLine();
        classRoomService.addInstructorIntoClass(id,name,instructorService);

        return "Giảng viên " + name + " đã được thêm vào lớp " + id ;
    }
//    /    2. Them sinh vien vao lop hoc minh muon
    public String addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID lop hoc ban muon them sinh vien vao: ");
        String id = scanner.nextLine();
        System.out.println("Nhap vao ten giang vien ban muon them vao: ");
        String name = scanner.nextLine();
        classRoomService.addStudentIntoClass(id,name,studentService);

        return "Sinh viên " + name + " đã được thêm vào lớp " + id ;
    }
}
