package util;

public enum SubjectTypeEnum {

    MATH(1001),
    KOREAN(2001),
    DANCE(3001),
    ;
    private int type;

    SubjectTypeEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
