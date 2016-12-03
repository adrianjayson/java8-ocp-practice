package ocp.chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by adrianjayson on 11/30/16.
 */
public class LambdaPractice {

    public static void main(String args[]) {
        //using Predicate Interface
        List<String> crushes = new ArrayList<>();
        crushes.add("Rachel");
        crushes.add("YooA");
        crushes.add("Arin");

        crushes.removeIf(c -> !c.startsWith("R"));
        crushes.forEach(System.out::println);

        //using Consumer Interface
        Consumer<Integer> square = i -> System.out.println(i * i);
        square.accept(234);

        Stream<String> strs = Stream.of("I", "love", "you", "Rachel");
        Consumer<String> c = System.out::print;
        strs.forEach(c);

        //using function interface
        Function<String, Integer> test = str -> Integer.parseInt(str) * 2;
        System.out.println();
        System.out.println(test.apply("6542"));
    }
}
