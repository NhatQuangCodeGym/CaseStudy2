package vn.lnquang.manage.student.service;

import vn.lnquang.manage.student.model.Person;
import vn.lnquang.manage.student.model.Student;

import java.io.*;
import java.util.*;

public class StudentService {
    public void add(Student student) {

    }
//    final Scanner scanner= new Scanner(System.in);
    List<Student> students= new ArrayList<>();
////    1. Them sinh vien vao danh sach
            public void addStudent(Student sv){
                students.add(sv);
            }

////    2. Hien thi danh sach sinh vien
         public List<Student> getStudents() {
             return students;
         }
//}
//         public void showStudentList() {
//             for (Person sinhVien : students) {
//                 System.out.println(sinhVien);
//             }
//         }
////3. Kiem tra danh sach sinh vien co rong hay khong
        public boolean checkStudentList(){
            return students.isEmpty();
             }

////4 Lay ra so luong sinh vien trong danh sach
        public int checkQuantity(){
//            System.out.println(" Số lượng sinh viên trong danh sách là: ");
             return students.size();
}

////5. Lam rong danh sach sinh vien
             public void remove(){
            students.removeAll(students);
             }

////6.Kiem tra ton tai Sinh Vien
             public boolean checkAvailable(int id){
                 for (Student student: students){
                     if(student.getId()==id){
                         return true;
                     }
                 }
                     return false;
    }
//// 7. Xoa mot ban  sinh vien ra khoi danh sach danh sinh vien
             public boolean removeStudent(int id){
                ArrayList<Person> listremove = new ArrayList<>();
                 for (Person student: students) {
                     if(student.getId()== id)
                         listremove.add(student);
                 }
                 boolean check = students.removeAll(listremove);
                 return check;
             }
//             // 8. Tim sinh vien
//             public boolean findStudent(String ten) {
//                 for (Person sinhVien : students) {
//                     if (sinhVien.getName().equals(ten)) {
//                         System.out.println(sinhVien.toString());
//                     }else
//                         System.out.println(" Không có sinh viên trong danh sách");
//                 }
//             }
//             public void checkStudent(){
//                 System.out.println(" Nhập vào tên sinh viên bạn muốn tìm:");
//                 String name = scanner.nextLine();
//                 findStudent(name);
//             }
//
////9. Xuat ra sinh vien tu thap den cao
//             public void sortStudentByScore(){
//                 Collections.sort(students, new Comparator<Person>() {
//                     @Override
//                     public int compare(Person sv1, Person sv2) {
//                         if(sv1.getAverageScore()<sv2.getAverageScore())
//                             return -1;
//                         else if(sv1.getAverageScore()>sv2.getAverageScore()){
//                             return 1;
//                         }else
//                             return 0;
//                     }
//                 });
//             }
////10. Ghi xuong file
//             public void ghiDuLieuXuongFile(File file){
//                 try {
//                     OutputStream os = new FileOutputStream(file);
//                     ObjectOutputStream oos = new ObjectOutputStream(os);
//
//                     for(Person student : students){
//                         oos.writeObject(student);
//                     }
//                     oos.flush();
//                     oos.close();
//                 }catch(Exception ex){
//                     ex.printStackTrace();
//                 }
//             }
//             //11. Doc du lieu tu file
//             public List<Student> docHocSinhTuDanhSach(File file){
//                 List<Student> students = new ArrayList<>();
//                 try{
//                     FileInputStream fis = new FileInputStream(file);
//                     ObjectInputStream ois = new ObjectInputStream(fis);
//                     students = (List<Student>) ois.readObject();
//                     fis.close();
//                     ois.close();
//                 }catch(Exception ex){
//                     ex.printStackTrace();
//                 }
//                 return students;
//             }

}
