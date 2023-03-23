package school;

import util.GradeTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int subjectId;
    private String subjectName;
    private int gradeType; // 과목 평가 방법, 기본적으로 A, B
    private List<Student> studentList;

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = GradeTypeEnum.AB_TYPE.getType(); // 기본적으로 A, B
        this.studentList = new ArrayList<>();
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void regitser(Student student) {
        studentList.add(student);
    }
}
