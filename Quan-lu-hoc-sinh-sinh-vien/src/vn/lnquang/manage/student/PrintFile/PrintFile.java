package vn.lnquang.manage.student.PrintFile;


import vn.lnquang.manage.student.model.Instructor;
import vn.lnquang.manage.student.model.Student;

import java.io.*;
import java.util.List;

public class PrintFile {

    public  void ghiDuLieuSinhVien(List<Student> list) {
        String a= null;
        try {
            FileWriter writer= new FileWriter("src/Danhsach/Student.csv", false);
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            for (Student student:list) {
                a= String.format("%s,%s,%s,%s,%f,%s\n",student.getName(),student.getGender(),student.getBirthDay(),student.getAddress(),student.getAverageScore(), student.getEmail());
                bufferedWriter.write(a);
            }
            bufferedWriter.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ghiDuLieuGiangVien(List<Instructor> list){
        String a= null;
        try {
            FileWriter writer= new FileWriter("src/Danhsach/Instructor.csv", false);
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            for (Instructor instructor:list) {
                a= String.format("%s,%s,%s,%s,%f,%f\n",instructor.getName(),instructor.getGender(),instructor.getBirthDay(),instructor.getAddress(),instructor.getSalaryIndex(), instructor.getTeachingHours());
                bufferedWriter.write(a);
                }
            bufferedWriter.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
