package main;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.gc();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        Integer []arrayInteger = new Integer[50000/7];
        Random rand = new Random();
        for (int i = 0; i < arrayInteger.length ; i++) {
            arrayInteger[i] = rand.nextInt(10000000);
        }


        System.out.println("Time for bubble sort : "+bubbleSort.testTime(arrayInteger.clone()));
     //  System.out.println("Time for insertion sort : " +(insertionSort.testTime(arrayInteger.clone())));
        System.out.println("Time for selection sort : " +(selectionSort.testTime(arrayInteger.clone())));



    }
}
