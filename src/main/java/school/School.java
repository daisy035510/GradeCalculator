package school;

import java.util.ArrayList;
import java.util.List;

/**
 * 학교는 1개 밖에 없기 때문에 Singletone 패턴으로 구현
 */
public class School {

    private static School school = new School();

    private static String SCHOOL_NAME = "Good School";
    private List<Student> studentList = new ArrayList<>();
    private List<Subject> subjectList = new ArrayList<>();

    // singleton 패턴이기 때문에 private으로 선언
    private School() {

    }

    public static School getInstance() {
        if(school == null) {
            return new School();
        }

        return school;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addSubject(Subject subject) {
        this.subjectList.add(subject);
    }
}
