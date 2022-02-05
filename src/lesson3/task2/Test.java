package lesson3.task2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[]{-2,3,45,-20,30};
        int[] array2 = new int[0];
        System.out.println("min of "+ Arrays.toString(array1) + " is " + ArrayUtil.min(array1));
        System.out.println("min of "+ Arrays.toString(array2) + " is " + ArrayUtil.min(array2));
        System.out.println("max of "+ Arrays.toString(array1) + " is " + ArrayUtil.max(array1));
        System.out.println("max of "+ Arrays.toString(array2) + " is " + ArrayUtil.max(array2));
    }
}
