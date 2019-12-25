package main;

import java.nio.channels.SeekableByteChannel;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sortIntegerArray(Integer[] param) {


        for (int i = 0; i < param.length; i++) {
            int min = i;
            for (int j = i; j < param.length; j++) {
                if(param[j]<=param[min]) { min = j;
                }
            }

                int temp = param[i];
                param[i] = param[min];
                param[min] = temp;
        }

    }


}
