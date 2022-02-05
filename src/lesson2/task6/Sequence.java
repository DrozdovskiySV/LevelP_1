package lesson2.task6;

public class Sequence {
    public static void main(String[] args) {
        //6. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        int i = 1000;
        while (i < 10000) {
            System.out.println(i);
            i = i+3;
        }
    }
}
