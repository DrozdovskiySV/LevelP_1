package lesson3.task1;

public class Test {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        System.out.println("Integer, sum:");
        System.out.println(Calculator.sum(10,-20));
        System.out.println(Calculator.sum(maxInt, maxInt));
        System.out.println(Calculator.sum(maxInt, minInt));
        System.out.println();
        System.out.println("Integer, subtract:");
        System.out.println(Calculator.subtract(10,-20));
        System.out.println(Calculator.subtract(maxInt, maxInt));
        System.out.println(Calculator.subtract(maxInt, minInt));
        System.out.println();
        System.out.println("Integer, multiply:");
        System.out.println(Calculator.multiply(10,-20));
        System.out.println(Calculator.multiply(maxInt, maxInt));
        System.out.println(Calculator.multiply(maxInt, 0));
        System.out.println();
        System.out.println("Integer, division:");
        System.out.println(Calculator.div(10,-20));
        System.out.println(Calculator.div(maxInt, maxInt));
        System.out.println(Calculator.div(maxInt, 0));
        System.out.println(Calculator.div(0, 0));
        System.out.println();

        System.out.println("Long, sum");
        System.out.println(Calculator.sum(10L, -20L));
        System.out.println(Calculator.sum(maxLong, maxLong));
        System.out.println(Calculator.sum(maxLong, minLong));
        System.out.println();
        System.out.println("Long, subtract");
        System.out.println(Calculator.subtract(10L, -20L));
        System.out.println(Calculator.subtract(maxLong, maxLong));
        System.out.println(Calculator.subtract(maxLong, minLong));
        System.out.println();
        System.out.println("Long, multiply");
        System.out.println(Calculator.multiply(10L, -20L));
        System.out.println(Calculator.multiply(maxLong, maxLong));
        System.out.println(Calculator.multiply(maxLong, 0));
        System.out.println();
        System.out.println("Long, division");
        System.out.println(Calculator.div(10L, -20L));
        System.out.println(Calculator.div(maxLong, maxLong));
        System.out.println(Calculator.div(maxLong, 0));
        System.out.println(Calculator.div(0L, 0));
        System.out.println();

        System.out.println("Double, sum");
        System.out.println(Calculator.sum(10.54d, -20.34d));
        System.out.println(Calculator.sum((double)maxLong, minLong));
        System.out.println();
        System.out.println("Double, subtract");
        System.out.println(Calculator.subtract(10.54d, -20.34d));
        System.out.println(Calculator.subtract((double)maxLong, minLong));
        System.out.println();
        System.out.println("Double, multiply");
        System.out.println(Calculator.multiply(10.54d, -20.34d));
        System.out.println(Calculator.multiply((double)maxLong, 0));
        System.out.println();
        System.out.println("Double, division");
        System.out.println(Calculator.div(10.54d, -20.34d));
        System.out.println(Calculator.div((double)maxLong, 0));
        System.out.println(Calculator.div(0d, 0));
    }

}
