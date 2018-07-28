package practice1;

public class NumberUtils {

    public static void main(String[] args) {
        System.out.println(getAllRangeNumbersSum(1, 20));
        System.out.println(getAllRangeEvenNumbersSum(1, 20));
        System.out.println(getAllRangePrimeNumbersSum(1, 20));
        System.out.println(getAverageValueForRange(1, 10));
    }

    public static int getAllRangeNumbersSum(int from, int to) {
        if (to < from) throw new IllegalArgumentException();

        int result = 0;
        for (int i = from; i <= to; i++) {
            result += i;
        }
        return result;
    }

    public static int getAllRangeEvenNumbersSum(int from, int to) {
        if (to < from) throw new IllegalArgumentException();

        int result = 0;
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static int getAllRangePrimeNumbersSum(int from, int to) {
        if (to < from) throw new IllegalArgumentException();
        if (from < 1) throw new IllegalArgumentException();

        boolean isPrimeNumber;
        int result = 0;
        for (int i = from; i <= to; i++) {
            if (i == 1) continue;
            isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                result += i;
            }
        }
        return result;
    }

    public static double getAverageValueForRange(int from, int to) {
        if (from < 0) throw new IllegalArgumentException();

        int sum = getAllRangeNumbersSum(from, to);
        int numbers = to - from + 1;
        return (double) sum / numbers;
    }
}
