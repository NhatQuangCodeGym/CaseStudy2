//package vn.lnquang.manage.student.PrintFile;
//
//import vn.lnquang.manage.student.model.Student;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadFile {
//    public static void main(String[] args) {
//        File hocSinh = new File("/Users/macbookprom1/Desktop/CaseStudy2/CaseStudy2/Quan-lu-hoc-sinh-sinh-vien/src/Danhsach/Student.csv");
//        List<Student> student = docHocSinhTuDanhSach(hocSinh);
//        System.out.println(student);
//    }
//
//    public static List<Student> docHocSinhTuDanhSach(File file) {
//        List<Student> students = new ArrayList<>();
//        try {
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            students = (List<Student>) ois.read();
//            fis.close();
//            ois.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return students;
//    }
//}
//
//
