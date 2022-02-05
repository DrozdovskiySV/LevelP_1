package lesson2.task4;

import java.util.Random;

public class Rand {
    //4. Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру. Примеры работы программы:
    //В числе 208 наибольшая цифра 8. В числе 774 наибольшая цифра 7. В числе 613 наибольшая цифра 6
    public static void main(String[] args) {
        Random rnd = new Random();
        int intVal = rnd.nextInt(900)+100;
        System.out.println(intVal);
        int maxDig = 0;
        while (intVal > 0) {
            if (intVal%10 > maxDig) maxDig = intVal%10;
            intVal = intVal/10;
        }
        System.out.println(maxDig);
    }
}
