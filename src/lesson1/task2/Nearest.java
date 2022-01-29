package lesson1.task2;

import java.util.Scanner;

public class Nearest {
    // 2. Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        if (Math.abs(n-10) < Math.abs(m-10)) System.out.println("Ближайшее к 10: " + n);
        else if (Math.abs(n-10) > Math.abs(m-10)) System.out.println("Ближайшее к 10: " + m);
        else System.out.println("Оба одинаково близко");

    }
}
