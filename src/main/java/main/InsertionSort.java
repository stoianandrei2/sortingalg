package main;

public class InsertionSort implements SortingAlgorithm{
    @Override
    public void sortIntegerArray(Integer[] param) {
        for (int i = 0; i < param.length ; i++) {
            int j = i;
            while(j-1>=0 && param[j] <= param [j-1])
            {
                int temp = param[j];
                param[j] = param[j-1];
                param [j-1] = temp;
                j--;
            }
        }
    }



}


