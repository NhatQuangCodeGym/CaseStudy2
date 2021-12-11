package vn.lnquang.manage.student.PrintFile;

import vn.lnquang.manage.student.model.Person;
import vn.lnquang.manage.student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PrintFile {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();
        lists.add(new Student("test ghi", "Nam", "01/09/1996", "TQK", 8.5, "lnquang0109@gmail.com"));
        String path = "src\\Danhsach\\Student.csv";
        ghiDuLieuSinhVien(path,lists);

    }

    public static void ghiDuLieuSinhVien(String path, List<Student> list) {
        String a= null;
        try {
            FileWriter writer= new FileWriter(path, true);
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            for (Student student:list) {
                a=String.format("%s,%s,%s,%s,%f,%s",student.getName(),student.getGender(),student, student.getBirthDay(),student.getAverageScore(),student.getEmail());
                bufferedWriter.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
