package lesson6.task2;

import java.util.Arrays;

public class LibSearch {

    // поиск перебором
    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // бинарный поиск
    public static int binarySearch(int[] array, int value) {
        int left = -1;
        int right = array.length;
        int middle;
        while (left < right-1) {
            middle = (left + right) / 2;
            if (array[middle] < value) left = middle;
            else right = middle;
        }
        if (right == array.length) return -1;
        else return right;
    }

}
