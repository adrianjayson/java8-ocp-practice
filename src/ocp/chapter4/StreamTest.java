package ocp.chapter4;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by adrianjayson on 11/26/16.
 */
public class StreamTest {

    public static void main(String args[]) {
        Employee[] emps = {new Employee("A", "Rachel", 4.0),
                new Employee("A", "YooA", 4.0),
                new Employee("B", "Arin", 3.5),
                new Employee("C", "Jiho", 3.0)};

        Arrays.stream(emps)
                .map(e -> e.getName().toUpperCase())
                .forEach(e -> System.out.println(e));

        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.print(i))
                .map(i -> i * 2)
                .peek(i -> System.out.print(i))
                .count();
    }
}
