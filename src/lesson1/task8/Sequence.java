package lesson1.task8;

public class Sequence {
    //8. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
    public static void main(String[] args) {
        int n = 90;
        while (n >= 0) {
            System.out.println(n);
            n = n-5;
        }
    }
}
