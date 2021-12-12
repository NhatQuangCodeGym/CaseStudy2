package vn.lnquang.manage.student.views;

import vn.lnquang.manage.student.PrintFile.PrintFile;
import vn.lnquang.manage.student.Regex.RegexEmail;
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
    private final RegexEmail regexEmail = new RegexEmail();
//    I. Quản lý lớp học
//    1. Tao lop hoc
    public void createClassRoom(){
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Input your new class ID:  ");
        String id = scanner.nextLine();
        System.out.println("Appoint the Head Teacher: ");
        showInstructorList();
        String name = scanner.nextLine();
        classRoomService.createClass(id,name);
        System.out.println("Class " + id + " led by " + name + " created" );
    }
//    2. Them giang vien vao lop hoc minh muon
    public void addInstructorIntoClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID Class For Your Instructor ");
        String id = scanner.nextLine();
        showInstructorList();
        System.out.println("Input Your Subject Teacher:  ");
        String name = scanner.nextLine();
        classRoomService.addInstructorIntoClass(id,name);
        System.out.println("Instructor " + name + " added into class " + id);
    }
//    /    3. Them sinh vien vao lop hoc minh muon
    public void addStudentIntoClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID Class For Your Student: ");
        String id = scanner.nextLine();
        showStudentList();
        System.out.println("Input Your Student Into Class: ");
        String name = scanner.nextLine();
        classRoomService.addStudentIntoClass(id,name);
        System.out.println("Student " + name + " added into class " + id);
    }
//    4. Thong tin lop hoc vua tao
    public void getClassInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input ID Class For More Information:  ");
        String id = scanner.nextLine();
        ClassRoom classRoom = classRoomService.getClassRoom(id);
        System.out.println(" Class Information "  );
        System.out.println("Class ID " + classRoom.getClassId());
        System.out.println(" Head Teacher: " +classRoom.getHeadTeacher());
        System.out.println(" Subject Teacher List Of Class " + id +" :");
        for (Instructor instructor : classRoom.getSubjectTeacherList()) {
            System.out.println(instructor);
        }
        System.out.println("Student List Of Class " + id + " :");
        for(Student student : classRoom.getStudentList()){
            System.out.println(student);
        }
    }
//II. Quản lí danh sách sinh viên
//        1. Them SV vao danh sach sinh vien
public void addStudentIntoList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input Student's Name: ");
        String name= scanner.nextLine();
        System.out.println(" Input Gender:  ");
        String gender= scanner.nextLine();
        System.out.println(" Input Date Of Birth: ");
        String birthDay=scanner.nextLine();
        System.out.println("Input Address: ");
        String address=scanner.nextLine();
        System.out.println("Input Average Score : ");
        double  averageScore= scanner.nextDouble();
        scanner.nextLine();
        do {
            System.out.println(" Input Email Address:  ");
            String Email= scanner.nextLine();
            if(regexEmail.validate(Email)){
                studentService.addStudent(new Student(name,gender,birthDay,address,averageScore,Email));
                break;
            } else System.out.println("Email invalid:");
        }while(true);


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
        System.out.println("No Student In Current List");
    else
        System.out.println("Student Existed in Current List");
}
//4.Lay ra so luong sinh vien trong danh sach
public void printQuantity() {
    System.out.println("The Number of Student Available In Current List is : " + studentService.checkStudentQuantity());
}
//5. Lam rong danh sach sinh vien
public void resetStudentList(){
        studentService.remove();
    System.out.println("Student List Renewed");
}
//6.Kiem tra ton tai Sinh Vien theo ID
    public void checkStudentInList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input Student's ID You Want To Find:  ");
        int id = scanner.nextInt();
        if(studentService.checkAvailable(id)){
            System.out.println(" Student Available in Student List with information: ");
            Student student = studentService.findStudentByID(id);
            System.out.println(student);
        }else
            System.out.println("No Student Was Found With Your Input ID");

    }
//    7. Xoa mot ban  sinh vien ra khoi danh sach danh sinh vien theo ID
public void checkRemove(){
        Scanner scanner = new Scanner(System.in);
    System.out.println(" Input Student's ID for removing: ");
    int id = scanner.nextInt();
    if(studentService.removeStudent(id))
        System.out.println("Student With ID " + id +" Has Been Removed");
    else
        System.out.println(" Student With ID" + id + " Not Found");
}
//    8.Tim sinh vien theo ten
public void checkStudentByName(){
        Scanner scanner = new Scanner(System.in);
    System.out.println(" Input Student's Name You Want To Find ");
    String name = scanner.nextLine();
     Student student = studentService.findStudent(name);
     if(student != null){
         System.out.println("Student Name: " + student + " Available");
     }else
         System.out.println(" không có sinh viên tên: " + name);
}
//    9.Sap xep sinh vien tu thap den cao
    public void sortStudentList(){
        List<Student> students = studentService.sortStudentByScore();
        for(Student sinhVien : students)
            System.out.println(sinhVien);
    }
//    10. Ghi dữ liệu sinh viên
    public void WriteStudentList(){
        List<Student> list =studentService.getStudents();
        PrintFile printFile = new PrintFile();
        printFile.ghiDuLieuSinhVien(list);
    }
//    III. Quản lí danh sách giảng viên
//1. Thêm giảng viên vào danh sách");
    public void addInstructorIntoList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Instructor's Name: ");
        String name = scanner.nextLine();
        System.out.println(" Input Gender: ");
        String gender = scanner.nextLine();
        System.out.println(" Input Date Of Birth: ");
        String birthDay = scanner.nextLine();
        System.out.println("Input Address: ");
        String address = scanner.nextLine();
        System.out.println("Input Basic Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Input Teaching Hours: ");
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
        System.out.println("No Instructor Available In Current List");
    else
        System.out.println("Instructor List Available");
}
//4. Đếm số lượng giảng viên trong danh sách
public void printInstructorQuantity() {
    System.out.println("The number of Instructors In Current List is: " + instructorService.checkInstructorQuantity());
}
//5. Reset danh sách giảng viên");
public void resetInstructorList(){
    instructorService.emptyInstructorList();
    System.out.println("Instructor List Has Been renewed");
}
//6. Tìm giảng viên theo tên;
    public void checkInstructorByName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input Instructor's Name You Want To Find: ");
        String name = scanner.nextLine();
        Instructor giangVien = instructorService.findInstructor(name);
        if(giangVien != null){
            System.out.println("Instructor With Name: " + giangVien.getName() + " Available");
        }else
            System.out.println(" No Instructor Was Found With Name: " + name);
    }

//7.Ghi giảng viên từ file
public void WriteInstructorList(){
    List<Instructor> list =instructorService.getInstructors();
    PrintFile printFile = new PrintFile();
    printFile.ghiDuLieuGiangVien(list);
}
//0. Ket thuc chuong trinh.");


}

