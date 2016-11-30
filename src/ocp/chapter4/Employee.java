package ocp.chapter4;

/**
 * Created by adrianjayson on 11/26/16.
 */
public class Employee {

    private String id;
    private String name;
    private Double gpa;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }

    public Employee(String id, String name, Double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}' + '\n';
    }
}
