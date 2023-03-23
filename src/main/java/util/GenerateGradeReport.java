package util;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * builder pattern 으로 구현
 */
public class GenerateGradeReport {
    School school = School.getInstance();
    public static final String TITLE = "수강생 학점 \t\t\n";
    public static final String HEADER = "이름   |   학번   |   중간과목   |  점수 \n ";
    public static final String LINE = "------------------------------------------\n";
    private StringBuffer buffer = new StringBuffer();

    /**
     * 모든 과목에 대한 학점 산출
     */
    public String getReport() {

        for(Subject subject : school.getSubjectList()) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter(subject);
        }

        return buffer.toString();
    }

    /**
     * HEADER
     */
    public void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }

    /**
     * BDOY
     */
    public void makeBody(Subject subject) {

        List<Student> studentList = new ArrayList<>();

        for(Student student : school.getStudentList()) {
            buffer.append(student.getStudentName() + "\t");
            buffer.append("|");
            buffer.append(student.getStudentId() + "\t");
            buffer.append("|");
            buffer.append(student.getMajor().getSubjectName() + "\t");
            buffer.append("|");
            getScoreGrade(student, subject); // 학점 계산
            buffer.append("\n");


        }
    }

    public void getScoreGrade(Student student, Subject subject) {

        int majorId = student.getMajor().getSubjectId();
        List<Score> scoreList = student.getScoreList();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};

//        for(Score score : scoreList) {
        for(int i = 0; i < scoreList.size(); i++) {

            Score score = scoreList.get(i);
            if (score.getSubject().getSubjectId() == subject.getSubjectId()) {

                String grade;

                // pass or fail
                if (score.getSubject().getGradeType() == GradeTypeEnum.PF_TYPE.getType()) {
                    grade = gradeEvaluation[GradeTypeEnum.PF_TYPE.getType()].getGrade(score.getPoint());
                } else {

                    if (score.getSubject().getSubjectId() == majorId) {
                        grade = gradeEvaluation[GradeTypeEnum.SAB_TYPE.getType()].getGrade(score.getPoint());
                    } else {
                        grade = gradeEvaluation[GradeTypeEnum.AB_TYPE.getType()].getGrade(score.getPoint());
                    }
                }

                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append("|");
            }
        }
    }

    /**
     * FOOTER
     */
    public void makeFooter(Subject subject) {
        buffer.append("\n");
    }

}
