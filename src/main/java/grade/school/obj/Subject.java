package grade.school.obj;

import java.util.List;

public class Subject {
    private int subjectId;
    private String subjectName;
    private int gradeType; // 과목 평가 방법, 기본적으로 A, B
    private List<String> studentList;

    public Subject(int subjectId, String subjectName, int gradeType, List<String> studentList) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = gradeType;
        this.studentList = studentList;
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

    public List<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<String> studentList) {
        this.studentList = studentList;
    }
}
