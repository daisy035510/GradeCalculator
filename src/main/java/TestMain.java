import school.School;
import school.Score;
import school.Student;
import school.Subject;
import util.GenerateGradeReport;
import util.GradeTypeEnum;
import util.SubjectTypeEnum;

public class TestMain {

    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;
    Subject dance;
    GenerateGradeReport gradeReport = new GenerateGradeReport();
    public static void main(String[] args) {

        TestMain testMain = new TestMain();

        testMain.createSubject();
        testMain.createStudent();

        String report = testMain.gradeReport.getReport();
        System.out.println(report);
    }

    public void createSubject() {
        this.korean = new Subject("국어", SubjectTypeEnum.KOREAN.getType());
        this.math = new Subject("수학", SubjectTypeEnum.MATH.getType());
        this.dance = new Subject("댄스", SubjectTypeEnum.DANCE.getType());

        this.dance.setGradeType(GradeTypeEnum.PF_TYPE.getType());

        goodSchool.addSubject(this.korean);
        goodSchool.addSubject(this.math);
        goodSchool.addSubject(this.dance);

    }

    public void createStudent() {

        Student student1 = new Student(2112213,"강감찬", korean);
        Student student2 = new Student(212330,"김유신", math);
        Student student3 = new Student(201518,"신사임당", korean);
        Student student4 = new Student(202360,"이순신", korean);
        Student student5 = new Student(201290,"홍길동", math);

        goodSchool.addStudent(student1);
        goodSchool.addStudent(student2);
        goodSchool.addStudent(student3);
        goodSchool.addStudent(student4);
        goodSchool.addStudent(student5);

        korean.regitser(student1);
        korean.regitser(student2);
        korean.regitser(student3);
        korean.regitser(student4);
        korean.regitser(student5);

        math.regitser(student1);
        math.regitser(student2);
        math.regitser(student3);
        math.regitser(student4);
        math.regitser(student5);

        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);

        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 88);

        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);


        addScoreForStudent(student1, dance, 95);
        addScoreForStudent(student2, dance, 85);
        addScoreForStudent(student3, dance, 75);

    }

    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
