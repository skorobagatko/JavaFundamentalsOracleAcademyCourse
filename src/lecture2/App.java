package lecture2;

public class App {

    public static void main(String[] args) {
        int i = 0x567;
        System.out.println(Integer.toBinaryString(i));

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        char c4 = '\101';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println('\u0407');
    }
}
