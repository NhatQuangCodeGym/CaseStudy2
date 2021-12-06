package vn.lnquang.manage.student.model;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String ClassId;
    private Person headTeacher;
    private List<Instructor> subjectTeacherList;
    private List<Student> studentList;

    public ClassRoom() {
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

    public void setSubjectTeacherList(List<Instructor> subjectTeacherList) {
        this.subjectTeacherList = subjectTeacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
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
