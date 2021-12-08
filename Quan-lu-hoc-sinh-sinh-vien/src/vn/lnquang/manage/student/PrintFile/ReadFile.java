package vn.lnquang.manage.student.PrintFile;

import vn.lnquang.manage.student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    static BufferedReader bufferedReader = null;
    public static void main(String[] args) {
        File file = new File("src\\Danhsach\\Student.csv");
        List<Student> student = docHocSinhTuDanhSach(file);
        System.out.println(student);
    }

    public static List<Student> docHocSinhTuDanhSach(File file) {
        List<Student> students = new ArrayList<>();
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                String data[] = line.split(",");
                String name = data[0];
                String gender = data[1];
                String birthday = data[2];
                String address = data[3];
                double aver = Double.parseDouble(data[4]);
                String email = data[5];
                students.add(new  Student(name, gender, birthday, address, aver, email));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}


