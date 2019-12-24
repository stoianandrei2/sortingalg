package main;

public class BubbleSort implements SortingAlgorithm {


    @Override
    public void sortIntegerArray(Integer[] param) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < param.length - 1; i++) {
                if(param[i] > param[i+1]) {
                    sorted = false;
                    Integer rep = param[i+1];
                    param[i+1] = param[i];
                    param[i] = rep;
                }
            }
        }
    }


}
