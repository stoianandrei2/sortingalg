package main;

public class HeapSort implements SortingAlgorithm {
    @Override
    public void sortIntegerArray(Integer[] param) {

        for(int j = param.length-1; j>=0;j--) {
            heapify(param, j);
            int temp = param[0];
            param[0] = param[j];
            param[j] = temp;

        }

    }

    private static void heapify (Integer[] param, int n) {
        if (n > 0) {
            for (int j = 1; j <= n; j++) {
                int k = j;
                while (((k - 1) / 2) >= 0 && param[k] >= param[(k - 1) / 2] && (k-1)>=0) {
                    int temp = param[k];
                    param[k] = param[(k - 1) / 2];
                    param[(k - 1) / 2] = temp;
                    k = (k-1)/2;
                }
            }
        }

    }


}
