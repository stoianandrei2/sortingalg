package main;
import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.gc();
        BubbleSort bubbleSort = new BubbleSort();
        //   InsertionSortWithList insertionSortWithList = new InsertionSortWithList();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        ShellSort shellSort = new ShellSort();
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();
        QuickSort quickSort = new QuickSort();
        QuickSortThreeWay quickSortThreeWay = new QuickSortThreeWay();

        Integer []arrayInteger = new Integer[50000/7];
        Random rand = new Random();
        for (int i = 0; i < arrayInteger.length ; i++) {
            arrayInteger[i] = rand.nextInt(1000);
        }


        Integer[][] test = new Integer[8][];

        for (int i = 0; i < 8; i++) {
            test[i] = arrayInteger.clone();
        }

        System.out.println("Numbers to sort : "+test[0].length);
        System.out.println("Time for bubble sort : "+bubbleSort.testTime(test[0]));
        System.out.println("Time for insertion sort : " +(insertionSort.testTime(test[1])));
        System.out.println("Time for selection sort : " +(selectionSort.testTime(test[2])));
        System.out.println("Time for shell sort : " +(shellSort.testTime(test[3])));
        System.out.println("Time for merge sort : "+(mergeSort.testTime(test[4])));
        System.out.println("Time for heap sort : "+(heapSort.testTime(test[5])));
        System.out.println("Time for quick sort : "+(quickSort.testTime(test[6])));
        System.out.println("Time for three way quick sort : "+(quickSortThreeWay.testTime(test[7])));







    }
}
