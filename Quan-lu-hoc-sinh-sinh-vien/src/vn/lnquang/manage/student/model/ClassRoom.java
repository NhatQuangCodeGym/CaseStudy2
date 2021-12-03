package vn.lnquang.manage.student.model;

import java.util.List;

public class ClassRoom {
    private String ClassId;
    private Person headTeacher;
    private Person subjectTeacherList;
    private List studentList;

    public ClassRoom(String classId, Person headTeacher, Person subjectTeacher, List studentList) {
        ClassId = classId;
        this.headTeacher = headTeacher;
        this.subjectTeacherList = subjectTeacher;
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

    public Person getSubjectTeacher() {
        return subjectTeacherList;
    }

    public void setSubjectTeacher(Person subjectTeacher) {
        this.subjectTeacherList = subjectTeacher;
    }

    public List getStudentList() {
        return studentList;
    }

    public void setStudentList(List studentList) {
        this.studentList = studentList;
    }

}
