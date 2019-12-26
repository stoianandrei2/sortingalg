package main;

public class QuickSort implements SortingAlgorithm {
    @Override
    public void sortIntegerArray(Integer[] param) {
        sort(param,0,param.length-1);
    }

    private void sort (Integer[] param, int lowerBound, int higherBound) {
        int pivot = param[lowerBound];
        if(higherBound!=lowerBound) {
            int start = lowerBound, end = higherBound;
            while(start<=end) {
                boolean foundStart = false, foundEnd = false;
                if(param[start] <= pivot) {
                    start++;
                } else foundStart = true;

                if(param[end] >= pivot) {
                    end--;
                } else foundEnd = true;

                if(foundStart && foundEnd) {
                    int temp = param[start];
                    param[start] = param[end];
                    param[end] = temp;
                }
            }

            int temp = param[lowerBound];
            param[lowerBound] = param[end];
            param[end] = temp;
            if(end!=lowerBound) sort(param, lowerBound, end-1);
            if(end!=higherBound) sort(param, end+1, higherBound);

        }

    }

}
