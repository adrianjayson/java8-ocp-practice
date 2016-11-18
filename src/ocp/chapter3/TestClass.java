package ocp.chapter3;

/**
 * Created by adrianjayson on 11/18/16.
 */
public class TestClass {
    private Grade g;

    public TestClass(Grade g) {
        this.g = g;
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass(Grade.A);
        System.out.println("Your grade is " + tc.g.getGrade() + "."); // 90
        System.out.println("Your grade is " + tc.g.name() + "."); // A
        System.out.println("Your grade is " + tc.g.valueOf("B") + "."); // B

        for (Grade gr : Grade.values()) {
            System.out.println("Grade of " + gr.name() + " means " + gr.getGrade());
        }
    }
}
