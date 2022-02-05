package lesson3.task3;

public class ArraySorting {
    public static int[] bubbleSort(int[] array) {
        //int[] arrSort = new int[array.length];
        boolean flag = false;
        int tmp;
        for (int i = 1; i < array.length; i++) {
            flag = false;
            for (int j = 0; j < array.length-i; j++) {
                if (array[j] > array[j+1]) {
                    tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    flag = true; // была замена
                }
            }
            if (!flag) break;
        }
        return array;
    }
}
