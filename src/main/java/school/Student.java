package school;

import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private Subject major;
    private List<String> scoreList;

    public Student(int studentId, String studentName, Subject major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }

    public List<String> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<String> scoreList) {
        this.scoreList = scoreList;
    }
}
