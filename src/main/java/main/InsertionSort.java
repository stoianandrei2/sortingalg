package main;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sortIntegerArray(Integer[] param) {

        List<Integer> listInteger = new LinkedList<>();
        listInteger.add(param[0]);
        for (int i = 1; i < param.length; i++) {
            if (param[i]<=listInteger.get(0)) {
                listInteger.add(0, param[i]);
                continue;
            }

            if(param[i]>listInteger.get(i-1)) {
                listInteger.add(i,param[i]);
                continue;
            }

            for (int j = i-1; j > 0 ; j--) {
                if (param[i] <= listInteger.get(j) && param[i] > listInteger.get(j-1)) {
                    listInteger.add(j,param[i]);
                    break;
                };
            }

        }

       param = listInteger.toArray(param);

    }


}
