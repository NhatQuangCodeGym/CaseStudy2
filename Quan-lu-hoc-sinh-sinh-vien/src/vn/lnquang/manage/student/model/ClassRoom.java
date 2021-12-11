package vn.lnquang.manage.student.model;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String ClassId;
    private Person headTeacher;
    private List<Instructor> subjectTeacherList= new ArrayList<>();
    private List<Student> studentList= new ArrayList<>();

    public ClassRoom() {
    }

    public ClassRoom(String classId, Person headTeacher) {
        ClassId = classId;
        this.headTeacher = headTeacher;
    }

    public ClassRoom(String classId, Person headTeacher, List<Instructor> subjectTeacherList, List<Student> studentList) {
        ClassId = classId;
        this.headTeacher = headTeacher;
        this.subjectTeacherList = subjectTeacherList;
        this.studentList = studentList;
    }

    public String getClassId() {
        return ClassId;
    }

    public void setClassId(String classId) {
        ClassId = classId;
    }

    public Person getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(Person headTeacher) {
        this.headTeacher = headTeacher;
    }

    public List<Instructor> getSubjectTeacherList() {
        return subjectTeacherList;
    }

    public void setSubjectTeacherList( Instructor giangvien) {
        this.subjectTeacherList.add(giangvien);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Student student) {
        this.studentList.add(student);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "ClassId='" + ClassId + '\'' +
                ", headTeacher=" + headTeacher +
                ", subjectTeacherList=" + subjectTeacherList +
                ", studentList=" + studentList +
                '}';
    }
}
