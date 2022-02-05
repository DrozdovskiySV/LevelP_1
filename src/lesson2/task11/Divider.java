package lesson2.task11;

import java.util.Scanner;

public class Divider {
    //11. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long divider = 2;
        while (n > 1) {
            if (n % divider == 0) System.out.println(divider);
            while (n % divider == 0) {
                n = n / divider;
            }
            divider = divider + 1;
        }

    }
}
