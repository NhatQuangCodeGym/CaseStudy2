package vn.lnquang.manage.student.service;

import vn.lnquang.manage.student.model.Person;
import vn.lnquang.manage.student.model.Student;

import java.io.*;
import java.util.*;

public class StudentService {
    final Scanner scanner= new Scanner(System.in);
    List<Student> students= new ArrayList<>();
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
         public List<Student> getStudents() {
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
                System.out.println("Không có sinh viên nào trong danh sách");
            else
            System.out.println("Có tồn tại sinh viên trong danh sách");
        }
//4 Lay ra so luong sinh vien trong danh sach
        public int checkQuantity(){
//            System.out.println(" Số lượng sinh viên trong danh sách là: ");
             return this.students.size();
}       public void printQuantity(){
        System.out.println("Số lượng sinh viên trong danh sách là: " + checkQuantity() );
    }
//5. Lam rong danh sach sinh vien
             public void emptyStudentList(){
            students.removeAll(students);
                 System.out.println("Danh sách đã được làm mới.");
             }
//6.Kiem tra ton tai Sinh Vien
             public Person checkAvailable(int id){
                 for (Person student: students){
                     if(student.getId()==id){
                         System.out.println("Có sinh viên trong danh sách");
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
             public void checkRemove(){
                 System.out.println(" Nhập vào id sinh viên bạn muốn xoá khỏi danh sách: ");
                 int id = scanner.nextInt();
                 removeStudent(id);
                 if(removeStudent(id))
                 System.out.println("Sinh viên có MSV" + id +" đã bị xoá khỏi danh sách");
                 else
                     System.out.println(" Không tìm ra sinh viên trong danh sách");
             }
             // 8. Tim sinh vien
             public void findStudent(String ten) {
                 for (Person sinhVien : students) {
                     if (sinhVien.getName().equals(ten)) {
                         System.out.println(sinhVien.toString());
                     }else
                         System.out.println(" Không có sinh viên trong danh sách");
                 }
             }
             public void checkStudent(){
                 System.out.println(" Nhập vào tên sinh viên bạn muốn tìm:");
                 String name = scanner.nextLine();
                 findStudent(name);
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
