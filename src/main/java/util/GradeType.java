package util;

public enum GradeType {

    AB_TYPE(0), // A, B, C TYPE
    SAB_TYPE(1), // S, A, B, C TYPE
    PF_TYPE(2), // P, F Type
    ;

    private int type;

    private GradeType(int type) {
        this.type = type;
    }
}
