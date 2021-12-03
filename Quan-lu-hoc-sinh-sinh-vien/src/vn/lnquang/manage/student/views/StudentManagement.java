package vn.lnquang.manage.student.views;

import vn.lnquang.manage.student.model.Instructor;
import vn.lnquang.manage.student.model.Person;
import vn.lnquang.manage.student.model.Student;

import java.io.*;
import java.util.*;

public class StudentManagement {
    final Scanner scanner= new Scanner(System.in);
    List<Person> students= new ArrayList<>();
//    1. Them sinh vien vao danh sach

    public void addStudent(){
//        System.out.println(" Nhap ten sinh vien:");
//        String name= scanner.nextLine();
//        System.out.println(" Nhap gioi tinh: ");
//        String gender= scanner.nextLine();
//        System.out.println(" Nhap ngay sinh: ");
//        String birthDay=scanner.nextLine();
//        System.out.println("Nhap dia chi: ");
//        String address=scanner.nextLine();
//        System.out.println("Nhap diem trung binh: ");
//        double  averageScore= scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println(" Nhap dia chi email: ");
//        String Email= scanner.nextLine();
//        students.add(new Student(name,gender,birthDay,address,averageScore,Email));

        students.add(new Student("A","nu","4565","dfgdfg",7.5,"fdghfgh"));
        students.add(new Student("B","nu","4565","dfgdfg",6.3,"fdghfgh"));
        students.add(new Student("C","nu","4565","dfgdfg",8.2,"fdghfgh"));
//        students.add(new Student(name,gender,birthDay,address,averageScore,Email));
    }
//    2. Hien thi danh sach sinh vien
         public List<Person> getStudents() {
          return students;
}
         public void showStudentList() {
             for (Person sinhVien : students) {
                 System.out.println(sinhVien);
             }
         }
//3. Kiem tra danh sach sinh vien co rong hay khong
        public boolean checkStudentList(){
            return students.isEmpty();
             }
        public void alert(){
            if (this.checkStudentList())
                System.out.println("co");
            else
            System.out.println("ko co");
        }
//4 Lay ra so luong sinh vien trong danh sach
        public int checkQuantity(){
             return students.size();
}
//5. Lam rong danh sach sinh vien
             public void emptyStudentList(){
             students.removeAll(students);
             }
//6.Kiem tra ton tai Sinh Vien
             public Person checkAvailable(int id){
                 for (Person student: students){
                     if(student.getId()==id){
                         return student;
                     }
                 }
                     return null;
    }
// 7. Xoa mot ban  sinh vien ra khoi danh sach danh sinh vien
             public boolean removeStudent(int id){
                ArrayList<Person> listremove = new ArrayList<>();
                 for (Person student: students) {
                     if(student.getId()== id)
                         listremove.add(student);
                 }
                 boolean check = students.removeAll(listremove);
                 return check;
             }
             // 8. Tim sinh vien
             public void findStudent(String ten) {
                 for (Person sinhVien : students) {
                     if (sinhVien.getName().equals(ten)) {
                         System.out.println(sinhVien.toString());
                     }
                 }
             }
//9. Xuat ra sinh vien tu thap den cao
             public void sortStudentByScore(){
                 Collections.sort(students, new Comparator<Person>() {
                     @Override
                     public int compare(Person sv1, Person sv2) {
                         if(sv1.getAverageScore()<sv2.getAverageScore())
                             return -1;
                         else if(sv1.getAverageScore()>sv2.getAverageScore()){
                             return 1;
                         }else
                             return 0;
                     }
                 });
             }
//10. Ghi xuong file
             public void ghiDuLieuXuongFile(File file){
                 try {
                     OutputStream os = new FileOutputStream(file);
                     ObjectOutputStream oos = new ObjectOutputStream(os);

                     for(Person student : students){
                         oos.writeObject(student);
                     }
                     oos.flush();
                     oos.close();
                 }catch(Exception ex){
                     ex.printStackTrace();
                 }
             }
             //11. Doc du lieu tu file
             public List<Student> docHocSinhTuDanhSach(File file){
                 List<Student> students = new ArrayList<>();
                 try{
                     FileInputStream fis = new FileInputStream(file);
                     ObjectInputStream ois = new ObjectInputStream(fis);
                     students = (List<Student>) ois.readObject();
                     fis.close();
                     ois.close();
                 }catch(Exception ex){
                     ex.printStackTrace();
                 }
                 return students;
             }

}
