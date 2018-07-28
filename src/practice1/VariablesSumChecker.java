package practice1;

public class VariablesSumChecker {

    public static void main(String[] args) {
        System.out.println(checkVariablesSum(1, 2, 3));
        System.out.println(checkVariablesSum(1, 3, 2));
        System.out.println(checkVariablesSum(3, 1, 2));

        System.out.println(checkVariablesSum(2, 3, 2));
    }

    public static boolean checkVariablesSum(int a, int b, int c) {
        return ((a + b) == c || (a + c) == b || (b + c) == a);
    }
}
