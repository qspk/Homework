package t1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *   //需求:用户键盘录入了一个字符串,需要统计字符出现的次数并按照顺序进行打印输出
 *         //例如:用户输入的是:aaacccddddeeeeffffRRRqqq
 *         //输出结果:a(3)c(3)...
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        String s = new Scanner(System.in).nextLine();
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }

        counts.forEach((k,v)-> System.out.print(k+"("+v+")"));
    }
}
