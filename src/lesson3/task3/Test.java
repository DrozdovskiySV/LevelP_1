package lesson3.task3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{3,-5,0,1,10,2,-6};
        int[] arr2 = new int[]{0,-1,1,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ArraySorting.bubbleSort(arr)));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ArraySorting.bubbleSort(arr2)));
    }
}
