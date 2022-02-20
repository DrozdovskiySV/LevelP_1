package lesson8.task3;

public class Application {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
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

   /*     OneWayList oneWayList = new OneWayList();
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
        System.out.println(oneWayList.toString());*/
    }

}