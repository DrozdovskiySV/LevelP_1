package lesson1.task10;

import java.util.Scanner;

public class Factorial {
    //10. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
