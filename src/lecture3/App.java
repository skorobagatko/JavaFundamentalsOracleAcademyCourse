package lecture3;

public class App {

    public static void main(String[] args) {

        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) continue outer;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static boolean first(boolean b) {
        System.out.println("first operand = " + b);
        return b;
    }

    private static boolean second(boolean b) {
        System.out.println("second operand = " + b);
        return b;
    }
}
