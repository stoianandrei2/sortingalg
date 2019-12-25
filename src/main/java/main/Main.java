package main;
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
        Integer []arrayInteger = new Integer[50000/5];
        Random rand = new Random();
        for (int i = 0; i < arrayInteger.length ; i++) {
            arrayInteger[i] = rand.nextInt(100);
        }


        Integer[][] test = new Integer[5][];

        for (int i = 0; i < 5; i++) {
            test[i] = arrayInteger.clone();
        }

        System.out.println("Time for bubble sort : "+bubbleSort.testTime(test[0]));
        System.out.println("Time for insertion sort : " +(insertionSort.testTime(test[1])));
        System.out.println("Time for selection sort : " +(selectionSort.testTime(test[2])));
        System.out.println("Time for shell sort : " +(shellSort.testTime(test[3])));
        System.out.println("Time for merge sort : "+(mergeSort.testTime(test[4])));







    }
}
