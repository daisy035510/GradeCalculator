package util;

public enum gradeType {

    AB_TYPE(0), // A,B,C TYPE
    SAB_TYPE(1), // S, A,B,C TYPE
    ;

    private int type;

    private gradeType(int type) {
        this.type = type;
    }
}
