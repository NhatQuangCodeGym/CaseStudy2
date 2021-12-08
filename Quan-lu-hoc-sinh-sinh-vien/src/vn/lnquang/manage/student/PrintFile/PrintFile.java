//package vn.lnquang.manage.student.PrintFile;
//
//import vn.lnquang.manage.student.model.Person;
//import vn.lnquang.manage.student.model.Student;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
//import java.util.List;
//
//public class PrintFile {
//    public void ghiDuLieuSinhVien(File file, List<Student> list) {
//        try {
//            OutputStream os = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(os);
//
//            for (Student student : list) {
//                oos.writeObject(student);
//            }
//            oos.flush();
//            oos.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//}
//
