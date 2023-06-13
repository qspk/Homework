package t3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二分查找
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stus = {"111", "222", "333", "444", "555", "666"};
        System.out.println("请输入您要查找的人名");
        String name = sc.next();
        int index_2 = Arrays.binarySearch(stus, name);
        int index = binarySearch(stus, name);
        if ( index== -1) {
            System.out.println(name + "不是系统中的用户!");
        } else {
            System.out.println(name + "是系统中存储的第" + (index + 1) +"个用户");
        }
    }

    public static int binarySearch(String[] arr,String data) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid].compareTo(data) > 0) {
                right = mid - 1;
            } else if (arr[mid].compareTo(data)<0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
