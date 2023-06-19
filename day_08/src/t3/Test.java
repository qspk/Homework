package t3;

import java.util.Arrays;

/**
 *  现获取到一个字符串"90 -7 0 18 2 0 2 2 45 4"，
 *     其中的数据是空格间隔的一些数字，请使用集合所学知识将字符串中的数值进行降序排序，但不要去除其中的重复数字。
 */
public class Test {
    public static void main(String[] args) {
        String num = "90 -7 0 18 2 0 2 2 45 4";
        String[] s = num.split(" ");
        Arrays.stream(s).sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
    }
}
