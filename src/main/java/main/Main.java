package main;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.gc();
        BubbleSort bubbleSort = new BubbleSort();
        Integer []arrayInteger = new Integer[50000/7];
        Random rand = new Random();
        for (int i = 0; i < arrayInteger.length ; i++) {
            arrayInteger[i] = rand.nextInt(10000000);
        }


        Long time = bubbleSort.testTime(arrayInteger);
        System.out.println(time);


     /*   BubbleSort.sortIntegerArray(arrayInteger);
        for (int i = 0; i < arrayInteger.length ; i++) {
            System.out.print(arrayInteger[i] + " ");
        }

     */
    }
}
