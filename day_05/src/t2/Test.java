package t2;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

/**
 *  Random Math.random  后者效率更好
 */
public class Test {
    public static void main(String[] args) {
        //1. 使用数组维护人员名单
        String[] names = {"张三丰","张无忌","周芷若","任我行","林青霞","柳岩"}; //[0,5]
        //2. 所谓的抽奖其实就是生成数组的随机索引
        int index_1 = getIndex_1(names);
        int index_2 = getIndex_2(names);
        //3. 将生成的随机索引位置的元素进行打印
        System.out.println("抽中："+names[index_1]+"!，恭喜"+names[index_1]+"当选本届武林盟主！");
        System.out.println("抽中："+names[index_2]+"!，恭喜"+names[index_2]+"当选本届武林盟主！");
    }

    public static int getIndex_1(String[] names) {
        Instant start = Instant.now();
        Random r = new Random();
        int index = r.nextInt(names.length);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Random方法耗时: " + duration.getSeconds() + "秒 " + duration.getNano() + "纳秒");
        return index;
    }
    public static int getIndex_2(String[] names) {
        Instant start = Instant.now();
        int index = (int)(Math.random() * names.length);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Math.random方法耗时: " + duration.getSeconds() + "秒 " + duration.getNano() + "纳秒");
        return index;
    }


}
