package lecture5;

import java.util.Arrays;

public class ArrayInitializationTypes {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{1, 2, 3};

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = {{1, 2, 3}, {4, 5, 6, 7}, {}, null, {9, 10}};
        System.out.println(Arrays.deepToString(arr4));
    }
}
