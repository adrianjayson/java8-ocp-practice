package ocp.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by adrianjayson on 11/26/16.
 */
public class TestClass {


    static void strUpper(Employee e) {
        System.out.println(e.getName().toUpperCase());
    }

    public static void main(String[] args) {
//        ArrayList<String> crushes = new ArrayList<>();
//        crushes.add("Rachel");
//        crushes.add("YooA");
//        crushes.add("Arin");
//        crushes.add("Jiho");
//
//        for (String crush : crushes) {
//            System.out.println("I love you " + crush);
//        }
//
//        for (Iterator<String> crush = crushes.iterator(); crush.hasNext();) {
//            System.out.println("I love you " + crush.next() + "!");
//        }
        Employee[] emps = {new Employee("A", "Rachel", 4.0),
                new Employee("A", "YooA", 4.0),
                new Employee("B", "Arin", 3.5),
                new Employee("C", "Jiho", 3.0)};

        Arrays.sort(emps, new GPAComparator());

        System.out.println(Arrays.toString(emps));

        List<Employee> empsList = Arrays.asList(emps);
        empsList.forEach(TestClass::strUpper);
    }
}
