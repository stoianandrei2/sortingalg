package main;

import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {

    @Override
    public void sortIntegerArray(Integer[] param) {

        int n = param.length;
        if (n > 1) {
            Integer[] A = Arrays.copyOfRange(param, 0, (n - n / 2));
            Integer[] B = Arrays.copyOfRange(param, n - n / 2, param.length);
            if (A.length > 1) sortIntegerArray(A);
            if (B.length > 1) sortIntegerArray(B);

            int i = 0, j = 0, k = 0;
            while (k < A.length + B.length) {
                if (i < A.length && j < B.length) {
                    if (A[i] <= B[j]) {
                        param[k] = A[i];
                        k++;
                        i++;
                    } else {
                        param[k] = B[j];
                        k++;
                        j++;
                    }
                } else if (i == A.length) {
                    param[k] = B[j];
                    k++;
                    j++;
                } else if (j == B.length) {
                    param[k] = A[i];
                    k++;
                    i++;
                }
            }
        }
    }


}
