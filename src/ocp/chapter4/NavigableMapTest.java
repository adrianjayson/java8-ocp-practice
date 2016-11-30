package ocp.chapter4;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Created by adrianjayson on 11/26/16.
 */
public class NavigableMapTest {

    public static void main(String args[]) {
        NavigableMap<String, Integer> examScores = new TreeMap<>();

        examScores.put("Rachel", 100);
        examScores.put("YooA", 100);
        examScores.put("Arin", 95);
        examScores.put("Jiho", 90);
        examScores.put("Jaymee", 60);

        System.out.println(examScores);
        System.out.println(examScores.descendingMap());
    }
}
