package lesson1.task7;

public class Sequence {
    public static void main(String[] args) {
        //7. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …
        int n = 1;
        for (int i = 0; i < 55; i++) {
            System.out.println(n);
            n = n+2;
        }
    }
}
