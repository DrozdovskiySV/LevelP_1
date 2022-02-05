package lesson2.task5;

public class Sort {
    //5. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа. Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
    private static int a = 7;
    private static int b = 0;
    private static int c = -5;

    public static void main(String[] args) {

        System.out.println("Числа в переменных a, b и c: "+ a +", "+ b +", " + c);
        int tmp;
        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (b > c) {
            tmp = c;
            c = b;
            b = tmp;
        }
        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println("Возрастающая последовательность: "+ a +", "+ b +", " + c);

    }


}
