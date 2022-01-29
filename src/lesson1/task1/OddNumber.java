package lesson1.task1;

import java.util.Scanner;

public class OddNumber {
    // 1. Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2 == 0) System.out.println("Число четное");
        else System.out.println("Число нечетное");
    }




}
