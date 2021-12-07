package vn.lnquang.manage.student.service;

import vn.lnquang.manage.student.model.ClassRoom;
import vn.lnquang.manage.student.model.Instructor;
import vn.lnquang.manage.student.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomService {
    List<ClassRoom> classList = new ArrayList<>();
//    1. Tao lop hoc
    public void createClass(String id, String GVCN, InstructorService instructorList) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassId(id);
        for (Instructor giangVien: instructorList.getInstructors() ) {
            if(giangVien.getName().equals(GVCN))
                classRoom.setHeadTeacher(giangVien);
        }
        classList.add(classRoom);
    }
//        2. Them giang vien vao lop minh muon
    public void addInstructorIntoClass(String id, String name, InstructorService instructList) {
        ClassRoom classRoom = getClassRoom(id);
        List<Instructor> instructorList = new ArrayList<>();
        for (Instructor person : instructList.getInstructors()) {
            if(person.getName().equals(name))
            instructorList.add(person);
        }
        classRoom.setSubjectTeacherList(instructorList);
    }
    //        3. Them sinh vien vao lop minh muon
    public void addStudentIntoClass(String id, String name, StudentService ssList) {
        ClassRoom classRoom = getClassRoom(id);
        List<Student> studentList = new ArrayList<>();
        for (Student person : ssList.getStudents()) {
            if(person.getName().equals(name))
                studentList.add(person);
        }
        classRoom.setStudentList(studentList);
    }

    public ClassRoom getClassRoom(String id){
            for (ClassRoom classRoom: classList) {
                if(classRoom.getClassId().equals(id)){
                    return classRoom;
                }
            }
            return null;
        }


}
