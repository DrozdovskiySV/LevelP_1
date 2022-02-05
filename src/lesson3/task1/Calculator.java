package lesson3.task1;

public class Calculator {
    // на выходе тип шире, чтоб был верный результат
    public static long sum(int a, int b) { return (long) a + b; }
    public static double sum(long a, long b) { return (double) a + b; }
    public static double sum(double a, double b) { return a + b; }

    public static long subtract(int a, int b) { return (long) a - b; }
    public static double subtract(long a, long b) { return (double) a - b; }
    public static double subtract(double a, double b) { return a - b; }

    public static double multiply(int a, int b) { return (double) a * b; }
    public static double multiply(long a, long b) { return (double) a * b; }
    public static double multiply(double a, double b) { return a * b; }

    public static double div(int a, int b) { return (double) a / b; }
    public static double div(long a, long b) { return (double) a / b; }
    public static double div(double a, double b) { return a / b; }
}
