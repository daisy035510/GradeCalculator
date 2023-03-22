package grade.school.obj;

public class Score {
    private int studentId;
    private Subject subjectId;
    private int point;

    public Score(int studentId, Subject subjectd, int point) {
        this.studentId = studentId;
        this.subjectId = subjectd;
        this.point = point;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subject subjectId) {
        this.subjectId = subjectId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
