package JC_HW3;

import java.util.Arrays;

public class Change {
        public static void main(String[] args) {
            Integer[] arr = {1, 2, 3, 4};
            System.out.println("Массив до: " + Arrays.toString(arr));
            exchange (arr,1,3);
            System.out.println("Массив после: " + Arrays.toString(arr));

        }
    private static <T> void exchange(T[] arr, int n1, int n2) {
        T t = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = t;
    }
}