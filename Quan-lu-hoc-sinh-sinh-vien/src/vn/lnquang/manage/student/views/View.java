package vn.lnquang.manage.student.views;

import vn.lnquang.manage.student.model.ClassRoom;
import vn.lnquang.manage.student.model.Instructor;
import vn.lnquang.manage.student.model.Student;
import vn.lnquang.manage.student.service.ClassRoomService;
import vn.lnquang.manage.student.service.InstructorService;
import vn.lnquang.manage.student.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private final ClassRoomService classRoomService = new ClassRoomService();
    private final InstructorService instructorService = new InstructorService();
    private final StudentService studentService = new StudentService();
//    I. Quản lý lớp học
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
//    /    3. Them sinh vien vao lop hoc minh muon
    public String addStudentIntoClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID lop hoc ban muon them sinh vien vao: ");
        String id = scanner.nextLine();
        System.out.println("Nhap vao ten giang vien ban muon them vao: ");
        String name = scanner.nextLine();
        classRoomService.addStudentIntoClass(id,name,studentService);

        return "Sinh viên " + name + " đã được thêm vào lớp " + id ;
    }
//    4. Thong tin lop hoc vua tao
    public void getClassInformation(String id){
        ClassRoom classRoom = classRoomService.getClassRoom(id);
        System.out.println(" Thông tin lớp học: " + classRoom);
    }
//II. Quản lí danh sách sinh viên
//        1. Them SV vao danh sach sinh vien
public void addStudentIntoList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap ten sinh vien:");
        String name= scanner.nextLine();
        System.out.println(" Nhap gioi tinh: ");
        String gender= scanner.nextLine();
        System.out.println(" Nhap ngay sinh: ");
        String birthDay=scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address=scanner.nextLine();
        System.out.println("Nhap diem trung binh: ");
        double  averageScore= scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Nhap dia chi email: ");
        String Email= scanner.nextLine();
        studentService.addStudent(new Student(name,gender,birthDay,address,averageScore,Email));
}
//    2. Hien thi danh sach sinh vien hien co
public void showStudentList() {
    List<Student> list =studentService.getStudents();
    for(Student sinhVien: list){
        System.out.println(sinhVien);
    }
}
//   3. Kiem tra danh sach sinh vien co rong hay khong
public void checkStudentList(){
    if (studentService.checkStudentList())
        System.out.println("Không có sinh viên nào trong danh sách");
    else
        System.out.println("Có tồn tại sinh viên trong danh sách");
}
//4.Lay ra so luong sinh vien trong danh sach
public void printQuantity() {
    System.out.println("Số lượng sinh viên trong danh sách là: " + studentService.checkStudentQuantity());
}
//5. Lam rong danh sach sinh vien
public void resetStudentList(){
        studentService.remove();
    System.out.println("Danh sách sinh viên đã được làm mới.");
}
//6.Kiem tra ton tai Sinh Vien theo ID
    public void checkStudentInList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập id sinh viên bạn muốn tìm: ");
        int id = scanner.nextInt();
        if(studentService.checkAvailable(id)){
            System.out.println(" Có sinh viên trong danh sách là: ");
            Student student = studentService.findStudentByID(id);
            System.out.println(student);
        }else
            System.out.println("ID sinh viên không tồn tại");

    }
//    7. Xoa mot ban  sinh vien ra khoi danh sach danh sinh vien theo ID
public void checkRemove(){
        Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhập vào id sinh viên bạn muốn xoá khỏi danh sách: ");
    int id = scanner.nextInt();
    studentService.removeStudent(id);
    if(studentService.removeStudent(id))
        System.out.println("Sinh viên có MSV" + id +" đã bị xoá khỏi danh sách");
    else
        System.out.println(" Không tìm ra sinh viên trong danh sách");
}
//    8.Tim sinh vien theo ten
public void checkStudent(){
        Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhập vào tên sinh viên bạn muốn tìm:");
    String name = scanner.nextLine();
     Student student = studentService.findStudent(name);
     if(student != null){
         System.out.println("Có sinh viên: " + student);
     }else
         System.out.println(" không có sinh viên tên: " + name);
}
//    9.Sap xep sinh vien tu thap den cao
    public void sortStudentList(){
        List<Student> students = studentService.sortStudentByScore();
        for(Student sinhVien : students)
            System.out.println(sinhVien);
    }
//    10.
//    III. Quản lí danh sách giảng viên
//1. Thêm giảng viên vào danh sách");
    public void addInstructorIntoList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten giang vien: ");
        String name = scanner.nextLine();
        System.out.println(" Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println(" Nhap ngay sinh: ");
        String birthDay = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap luong cua Giang Vien: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap so gio day cua Giang Vien: ");
        double teachingHours = scanner.nextDouble();
        scanner.nextLine();
        instructorService.addInstructor(new Instructor(name,gender,birthDay,address,salary,teachingHours));
    }
//2. Hiển thị danh sách giảng viên hiện có.");
public void showInstructorList() {
    List<Instructor> list =instructorService.getInstructors();
    for(Instructor giangvien: list) {
        System.out.println(giangvien);
    }
    }
//3. Kiểm tra danh sách giảng viên có rỗng không.");
public void checkInstructorList(){
    if (instructorService.checkInstructorList())
        System.out.println("Không có giảng viên nào trong danh sách");
    else
        System.out.println("Có tồn tại giảng viên trong danh sách");
}
//4. Đếm số lượng giảng viên trong danh sách
public void printInstructorQuantity() {
    System.out.println("Số lượng sinh viên trong danh sách là: " + instructorService.checkInstructorQuantity());
}
//5. Reset danh sách giảng viên");
public void resetInstructorList(){
    instructorService.emptyInstructorList();
    System.out.println("Danh sách sinh viên đã được làm mới.");
}
//6. Tìm giảng viên theo tên;
    public void checkInstructor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào tên giảng viên bạn muốn tìm:");
        String name = scanner.nextLine();
        Instructor giangVien = instructorService.findInstructor(name);
        if(giangVien != null){
            System.out.println("Có sinh viên: " + giangVien);
        }else
            System.out.println(" không có sinh viên tên: " + name);
    }
//7. Tính lương của giảng viên theo tên
public void getSalary() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập tên giảng viên cần tính lương: ");
    String name = scanner.nextLine();
    System.out.println("Nhập tên lớp của giảng viên");
    String idClass = scanner.nextLine();
    double sum = instructorService.getSumSalary(name, idClass);

    System.out.println("Giảng viên " + name + " có tổng lương là " + sum );

}
//0. Ket thuc chuong trinh.");


}

