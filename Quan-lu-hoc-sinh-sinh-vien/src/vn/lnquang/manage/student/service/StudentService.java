package vn.lnquang.manage.student.service;

import vn.lnquang.manage.student.PrintFile.PrintFile;
import vn.lnquang.manage.student.model.Person;
import vn.lnquang.manage.student.model.Student;

import java.io.*;
import java.util.*;

public class StudentService {
    final PrintFile printFile = new PrintFile();
    final File path = new File("/Users/macbookprom1/Desktop/CaseStudy2/CaseStudy2/Quan-lu-hoc-sinh-sinh-vien/src/Danhsach/Student.csv");
    public void add(Student student) {

    }
//    final Scanner scanner= new Scanner(System.in);
    List<Student> students= new ArrayList<>();
////    1. Them sinh vien vao danh sach
            public void addStudent(Student sv){
                students.add(sv);
//                printFile.ghiDuLieuSinhVien();
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
        public int checkStudentQuantity(){
//            System.out.println(" Số lượng sinh viên trong danh sách là: ");
             return students.size();
}

////5. Lam rong danh sach sinh vien
             public void remove(){
            students.removeAll(students);
             }
//6. Tra ve hoc sinh theo ID
            public Student findStudentByID(int id){
                for ( Student student : students){
                    if(student.getId()==id){
                        return student;
                    }
                }return null;
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
                ArrayList<Student> listremove = new ArrayList<>();
                 for (Student student: students) {
                     if(student.getId()== id)
                         listremove.add(student);
                 }
                 boolean check = students.removeAll(listremove);
                 return check;
             }
//             // 8. Tim sinh vien
             public Student findStudent(String ten) {
                 for (Student sinhVien : students) {
                     if (sinhVien.getName().equals(ten)) {
                         return sinhVien;
                     }
                 }return null;
             }
//
////9. Xuat ra sinh vien tu thap den cao
             public List<Student> sortStudentByScore(){
                List<Student> list = new ArrayList<>();
                 for (Student student: students) {
                         list.add(student);
                 }
                 Collections.sort(list, new Comparator<Student>() {
                     @Override
                     public int compare(Student sv1, Student sv2) {
                         if(sv1.getAverageScore()<sv2.getAverageScore())
                             return -1;
                         else if(sv1.getAverageScore()>sv2.getAverageScore()){
                             return 1;
                         }else
                             return 0;
                     }
                 });
                 return list;
             }
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
