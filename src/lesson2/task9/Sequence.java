package lesson2.task9;

public class Sequence {
    //9. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i < 21; i++) {
            System.out.println((int) Math.pow(2,i));
        }
    }
}
