package t4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 抓阄
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> options = new ArrayList<>();  //存储选项的集合
        ArrayList<String> people = new ArrayList<>();   //存储人名
        options.add("学羊叫五声");
        options.add("蛙跳十个");
        options.add("吃十克芥末");
        options.add("喝一瓶啤酒");
        options.add("做十个俯卧撑");
        people.add("徐明");
        people.add("张璐");
        people.add("王伟");
        people.add("李娜");
        people.add("赵雷");

        /**
         * 1.人名  2.选项名
         *
         */
        Map<String, String> map = new HashMap<>();
        Random r = new Random();
        for (String person : people) {
            int index = r.nextInt(options.size());
            String option = options.get(index);
            map.put(person, option);
            options.remove(index);
        }
        map.forEach((p, o) -> System.out.println(p + "----->" + o));

    }
}