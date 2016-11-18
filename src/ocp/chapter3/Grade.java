package ocp.chapter3;

/**
 * Created by adrianjayson on 11/18/16.
 */
public enum Grade {
    AA(100), A(90), B(80), C(70), F(60);

    private int grade;

    private Grade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
