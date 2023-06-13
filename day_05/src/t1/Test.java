package t1;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {33, 44, 99, 11, 8, 53};
        int[] arr1 = {33, 44, 99, 11, 8, 53};
        bubble(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
