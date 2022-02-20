package lesson8.task2;

import java.util.*;

public class Application {
    public static final int NUM_RANDOM = 10;

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(100);
        Random random = new Random();


        // заполняем коллекцию (будут числа [-NUM_RANDOM; NUM_RANDOM] включительно обе границы)
        for (int i = 0; i < 30; i++) { intList.add(random.nextInt(NUM_RANDOM*2+1)-NUM_RANDOM); }
        System.out.println("Первоначальная коллекция (intList): " + intList.toString());

        // новая коллекция, как часть первой
        ArrayList<Integer> newIntList = new ArrayList<>();
        newIntList.addAll(intList.subList(0,10));
        System.out.println("Часть коллекции intList (newIntList): " + newIntList);

        // найти уникальные числа
        Set<Integer> intSet = new HashSet<>(newIntList);
        ArrayList<Integer> uniqList = new ArrayList<>();
        uniqList.addAll(intSet);
        System.out.println("Список уникальных значений коллекции newIntList (uniqList)" + uniqList);

        // сортировка
        Collections.sort(intList);
        System.out.println("Отсортированная по возрастанию intList: " + intList.toString());
        Collections.sort(newIntList, Collections.reverseOrder());
        System.out.println("Отсортированная по убываю newIntList: " + newIntList.toString());

        // max, min, sum
        int sum = 0;
        for (int n: newIntList) sum = sum + n;
        System.out.println("Максимум в newIntList: " + Collections.max(newIntList));
        System.out.println("Минимум в newIntList: " + Collections.min(newIntList));
        System.out.println("Сумма чисел коллекции newIntList: " + sum);

        // только положительные числа первой коллекции
        ArrayList<Integer> positiveList = new ArrayList<>();
        for (int n: intList)
            if (n >= 0) positiveList.add(n);
        System.out.println("Только положительные числа из intList: " + positiveList.toString());

        // удаляем нечетные числа
        intList.removeIf(n -> n%2 != 0);
        System.out.println("Коллекция intList без нечетных чисел: " + intList);

        // найти индекс числа в коллекции
        System.out.println("Индекс числа 5 в коллекции newIntList: " + newIntList.indexOf(5));

    }
}
