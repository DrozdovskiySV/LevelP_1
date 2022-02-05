package lesson3.task2;

public class ArrayUtil {
    public static Integer min(int[] array) {
        if (array.length == 0) return null;
        int minNum = Integer.MAX_VALUE;
        for (int num: array) {
            if (num < minNum) minNum = num;
        }
        return minNum;
    }
    public static Integer max(int[] array) {
        if (array.length == 0) return null;
        int maxNum = Integer.MIN_VALUE;
        for (int num: array) {
            if (num > maxNum) maxNum = num;
        }
        return maxNum;
    }

}
