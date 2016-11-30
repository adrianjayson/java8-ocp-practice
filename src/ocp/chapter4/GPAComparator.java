package ocp.chapter4;

import java.util.Comparator;

/**
 * Created by adrianjayson on 11/26/16.
 */
public class GPAComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getGpa().compareTo(o2.getGpa());
    }
}
