package lesson6.task2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] intArr = new int[]{-5,1,0,10,4,8,3,-4,-6,5};
        int num1 = 10;
        int num2 = -6;
        int num3 = 100;

        System.out.println(Arrays.toString(intArr));
        System.out.println();
        System.out.println("Полный перебор:");
        System.out.printf("Индекс элемента %s : " + LibSearch.search(intArr,num1) +  "\n", num1);
        System.out.printf("Индекс элемента %s : " + LibSearch.search(intArr,num2) +  "\n", num2);
        System.out.printf("Индекс элемента %s : " + LibSearch.search(intArr,num3) +  "\n", num3);
        System.out.println();
        // сортируем массив
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println();
        System.out.println("Двоичный поиск:");
        System.out.printf("Индекс элемента %s : " + LibSearch.binarySearch(intArr,num1) +  "\n", num1);
        System.out.printf("Индекс элемента %s : " + LibSearch.binarySearch(intArr,num2) +  "\n", num2);
        System.out.printf("Индекс элемента %s : " + LibSearch.binarySearch(intArr,num3) +  "\n", num3);
    }
}
