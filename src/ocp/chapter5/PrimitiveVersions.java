package ocp.chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by adrianjayson on 12/3/16.
 */
public class PrimitiveVersions {

    public static void main (String args[]) {
        long startTime = System.currentTimeMillis();

//        Stream.of(1,2,3,4,5).forEach(System.out::println);
        IntStream.range(1,6).forEach(System.out::println);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(elapsedTime);
    }
}
