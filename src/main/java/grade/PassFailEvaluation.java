package grade;

public class PassFailEvaluation implements GradeEvaluation {
    @Override
    public String getGrade(int score) {

        if(score >= 70) {
            return "P";
        }

        return "F";
    }
}
