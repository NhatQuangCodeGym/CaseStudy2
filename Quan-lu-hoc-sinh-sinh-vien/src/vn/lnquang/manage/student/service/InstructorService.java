package vn.lnquang.manage.student.service;

import vn.lnquang.manage.student.PrintFile.ReadFile;
import vn.lnquang.manage.student.model.ClassRoom;
import vn.lnquang.manage.student.model.Instructor;
import vn.lnquang.manage.student.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstructorService {
    final ReadFile readFile = new ReadFile();
    final Scanner scanner = new Scanner(System.in);
     ClassRoomService classRoomService = new ClassRoomService();
    List<Instructor> instructors = readFile.docGiangVienTuDanhSach();

    //    1. Them giang vien vao danh sach
    public void addInstructor(Instructor giangvien) {
        instructors.add(giangvien);
    }

    //    2. Hien thi danh sach giang vien
    public List<Instructor> getInstructors() {
        return instructors;
    }

    //    3. Kiểm tra danh sách giảng viên có trống không
    public boolean checkInstructorList() {
        return instructors.isEmpty();
    }

    //    4.Đếm số lượng giảng viên trong danh sách
    public int checkInstructorQuantity() {
        return instructors.size();
    }

    //5. Reset danh sách giảng viên
    public void emptyInstructorList() {
        instructors.removeAll(instructors);
        System.out.println("Danh sách đã được làm mới.");
    }

    //        6. Tìm giảng viên theo tên.
    public Instructor findInstructor(String ten) {
        for (Instructor giangvien : instructors) {
            if (giangvien.getName().equals(ten)) {
                return giangvien;
            }

        }
        return null;
    }

}

