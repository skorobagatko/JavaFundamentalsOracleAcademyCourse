package lecture6;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        byte[] arr1 = {1, 2, 3, 4};
        byte[] arr2 = new byte[10];
        System.arraycopy(arr1, 0, arr2, 0, 4);
        System.out.println(Arrays.toString(arr2));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("4");
        strings.add("5");
        System.out.println(strings);

        strings.add(2, "3");
        System.out.println(strings);

        strings.add(5, "6");
        System.out.println(strings);

        for (String string : strings) {
            System.out.println(string);
        }

        strings.trimToSize();

        Integer x, y;
        x = 212;
        y = 212;
        System.out.println(x == y);
    }
}
