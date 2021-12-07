package vn.lnquang.manage.student.views;

import vn.lnquang.manage.student.model.Student;
import vn.lnquang.manage.student.service.ClassRoomService;
import vn.lnquang.manage.student.service.InstructorService;
import vn.lnquang.manage.student.service.StudentService;

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
public void checkList(){
    if (studentService.checkStudentList())
        System.out.println("Không có sinh viên nào trong danh sách");
    else
        System.out.println("Có tồn tại sinh viên trong danh sách");
}
//4.Lay ra so luong sinh vien trong danh sach
public void printQuantity() {
    System.out.println("Số lượng sinh viên trong danh sách là: " + studentService.checkQuantity());
}
//5. Lam rong danh sach sinh vien
public void resetStudentList(){
        studentService.remove();
    System.out.println("Danh sách sinh viên đã được làm mới.");
}
//6.Kiem tra ton tai Sinh Vien theo ID
//    public void checkStudentinList(){
//        Scanner scanner = new Scanner(System.in);
//        int id = scanner.nextInt();
//        if(studentService.checkAvailable(id)){
//            System.out.println(" Có sinh viên trong danh sách là: ");
//            studentService.getStudent(id);
//            //NOTE: thieu phuong thuc tra ve 1 hoc sinh theo id
//        }else
//            System.out.println("ID sinh viên không tồn tại");
//
//    }
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
//public void checkStudent(){
//        Scanner scanner = new Scanner(System.in);
//    System.out.println(" Nhập vào tên sinh viên bạn muốn tìm:");
//    String name = scanner.nextLine();
//    studentService.findStudent(name);
//}
//    9.Sap xep sinh vien tu thap den cao
//    10.
}
