package vn.lnquang.manage.student.service;

import vn.lnquang.manage.student.model.ClassRoom;
import vn.lnquang.manage.student.model.Instructor;
import vn.lnquang.manage.student.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomService {

    List<ClassRoom> classList = new ArrayList<>();


//    1. Tao lop hoc
    public void createClass(String id, String GVCN) {
        ClassRoom classRoom = new ClassRoom();
        InstructorService instructorService=new InstructorService();
        List<Instructor> instructorList = instructorService.getInstructors();
        classRoom.setClassId(id);
        for (Instructor giangVien: instructorList) {
            if(giangVien.getName().equals(GVCN))
                classRoom.setHeadTeacher(giangVien);
        }
        classList.add(classRoom);
    }
//        2. Them giang vien vao lop minh muon
    public void addInstructorIntoClass(String id, String name) {
        InstructorService instructorService=new InstructorService();
        List<Instructor> instructorList= instructorService.getInstructors();
        ClassRoom classRoom = getClassRoom(id);
        for (Instructor person : instructorList ) {
            if(person.getName().equals(name))
//            instructorList.add(person);
            classRoom.setSubjectTeacherList(person);
        }

    }
    //        3. Them sinh vien vao lop minh muon
    public void addStudentIntoClass(String id, String name) {
        StudentService studentService =new StudentService();
        List<Student> studentList = studentService.getStudents();
        ClassRoom classRoom = getClassRoom(id);
        for (Student person : studentList ) {
            if(person.getName().equals(name))
//            instructorList.add(person);
                classRoom.setStudentList(person);
        }

    }
//            4. Hien thi thong tin lop theo id
    public ClassRoom getClassRoom(String id){
            for (ClassRoom classRoom: classList) {
                if(classRoom.getClassId().equals(id)){
                    return classRoom;
                }
            }
            return null;
        }


}
