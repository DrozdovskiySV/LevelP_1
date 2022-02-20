package lesson8.task1;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 34;
        array[1] = 36;
        array[2] = 0;

        //...


        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);
        System.out.println(dynamicArray.toString());
        dynamicArray.remove(1);
        dynamicArray.remove(5);
        dynamicArray.remove(12);
        dynamicArray.remove(999);
        System.out.println(dynamicArray.toString());
        dynamicArray.removeByIndex(0);
        dynamicArray.removeByIndex(2);
        dynamicArray.removeByIndex(dynamicArray.getSize()-1);
        dynamicArray.removeByIndex(999);
        System.out.println(dynamicArray.toString());

        System.out.println();

        OneWayList oneWayList = new OneWayList();
        oneWayList.add(34);
        oneWayList.add(54);
        oneWayList.add(42);
        oneWayList.add(75);
        oneWayList.add(54);
        oneWayList.add(56);
        oneWayList.add(73);
        oneWayList.add(72);
        oneWayList.add(71);
        oneWayList.add(23);
        System.out.println(oneWayList.toString());
        oneWayList.remove(34);
        oneWayList.remove(75);
        oneWayList.remove(23);
        oneWayList.remove(999);
        System.out.println(oneWayList.toString());
        oneWayList.removeByIndex(0);
        oneWayList.removeByIndex(2);
        oneWayList.removeByIndex(4);
        oneWayList.removeByIndex(999);
        System.out.println(oneWayList.toString());
    }

}