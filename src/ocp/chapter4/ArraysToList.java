package ocp.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by adrianjayson on 11/26/16.
 */
public class ArraysToList {

    public static void main(String args[]) {
        String[] crushes =   {"Rachel", "YooA", "Arin"};
        System.out.println(Arrays.toString(crushes));

        List<String> lst = Arrays.asList(crushes);
        lst.set(1, "YOOA");
        System.out.println(lst);
        System.out.println(Arrays.toString(crushes));
    }
}
