package lesson8.task3;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        DynamicArray<String> dynamicArray = new DynamicArray<>(3);
        for (int i = 0; i < 12; i++) {
            dynamicArray.add("Str"+i);
        }
        System.out.println(dynamicArray.toString());
        dynamicArray.remove("Str0");
        dynamicArray.remove("Str4");
        dynamicArray.remove("Str11");
        dynamicArray.remove("Trololo");
        System.out.println(dynamicArray.toString());
        dynamicArray.removeByIndex(0);
        dynamicArray.removeByIndex(2);
        dynamicArray.removeByIndex(dynamicArray.getSize()-1);
        dynamicArray.removeByIndex(999);
        System.out.println(dynamicArray.toString());

        System.out.println();

        OneWayList<String> oneWayList = new OneWayList<>();
        for (int i = 0; i < 12; i++) {
            oneWayList.add("Str"+i);
        }
        System.out.println(oneWayList.toString());
        oneWayList.remove("Str0");
        oneWayList.remove("Str4");
        oneWayList.remove("Str11");
        oneWayList.remove("Trololo");
        System.out.println(oneWayList.toString());
        oneWayList.removeByIndex(0);
        oneWayList.removeByIndex(2);
        oneWayList.removeByIndex(oneWayList.size-1);
        System.out.println(oneWayList.toString());
    }

}