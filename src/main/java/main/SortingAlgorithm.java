package main;

import java.util.Arrays;
import java.util.List;

public interface SortingAlgorithm {

    public void sortIntegerArray(Integer[] param);


    public default void sortIntegerList(List<Integer> list) {
        Integer[] array;
        array = (Integer[]) list.toArray();
        sortIntegerArray(array);
        list = Arrays.asList(array);

    }

    public default Long testTime(List<Integer> list) {
        Integer[] array;
        array = (Integer[]) list.toArray();
        return testTime(array);
    }

    public default Long testTime(Integer[] param) {

        long t1 = System.currentTimeMillis();
        long t2;

        sortIntegerArray(param);
        t2 = System.currentTimeMillis();
        Long diff = (t2 - t1);


        return diff;
    }

}
