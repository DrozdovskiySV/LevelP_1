package lesson2.task3;

import java.util.Random;

public class Rand {
    // 3. Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
    // Примеры работы программы:
    // Число 113 не содержится в интервале (25,100). Число 72 содержится в интервале (25,100). Число 25 не содержится в интервале (25,100)Число 155 не содержится в интервале (25,100)
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(151) + 5;
        if (rndInt > 25 && rndInt < 100) System.out.println("Число "+ rndInt +" содержится в интервале (25,100).");
        else System.out.println("Число "+ rndInt +" не содержится в интервале (25,100).");
    }

}