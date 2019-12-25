package main;

public class ShellSort implements SortingAlgorithm {
    @Override
    public void sortIntegerArray(Integer[] param) {
        int gap = param.length / 2;
        int left = 0, right = gap, end = right;
        while (gap >= 1) {

            for (end = gap; end < param.length; end+=gap) {
                right = end;
                left = end - gap;
                while  (left >= 0 && right < param.length && param[left]>=param[right]) {
                    int temp = param[left];
                    param[left] = param [right];
                    param[right] = temp;
                    left-=gap;
                    right-=gap;
                }

            }

            gap /=2;
        }
    }


}
