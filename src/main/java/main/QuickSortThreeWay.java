package main;

public class QuickSortThreeWay implements SortingAlgorithm {

    @Override
    public void sortIntegerArray(Integer[] param) {
        sort(param, 0, param.length - 1);
    }

    private void sort(Integer[] param, int lowerBound, int higherBound) {

        if (lowerBound < higherBound) {
            int pivot = param[lowerBound];
            int start = lowerBound, end = higherBound, reader = lowerBound, countSmaller = 0, countLarger = 0;

            while (reader <= end) {
                if (param[reader] < pivot) {
                    int temp = param[reader];
                    param[reader] = param[start];
                    param[start] = temp;
                    reader++;
                    start++;
                    countSmaller++;

                } else if (param[reader] == pivot) {
                    reader++;

                } else if (param[reader] > pivot) {
                    int temp = param[reader];
                    param[reader] = param[end];
                    param[end] = temp;
                    end--;
                    countLarger++;
                }

            }

            if(countSmaller>=1) sort(param, lowerBound, lowerBound+countSmaller - 1);
            if(countLarger>=1)sort(param, higherBound - countLarger + 1, higherBound);

        }

    }


}


