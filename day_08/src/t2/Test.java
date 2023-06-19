package t2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test {
    static Locker lock = new Locker(20,new HashMap<String,String>());
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("请存入货物（以over结束）");
        String goods;
        String code;
        //存入物品
        while (!(goods = sc.next()).equals("over")) {
            if (lock.getGoods().size() == lock.getNumbers()) {
                System.out.println("储物柜已满,无法继续存入");
                break;
            }
            code = getCode();
            lock.getGoods().put(code, goods);
            System.out.println("存货成功,取货码为: "+code);
        }
        //取货
        System.out.println("请输入取货码（以over结束）：");
        while (!(code = sc.next()).equals("over")) {
            if (lock.getGoods().size() == 0) {
                System.out.println("储物柜没有货物,无法取货");
                break;
            }
            if (lock.getGoods().containsKey(code)) {
                String remove = lock.getGoods().remove(code);
                System.out.println("取货成功。请收好您的" + remove);
            } else {
                System.out.println("没有该取货码，请检查。");
            }
        }
    }

    //随机生成4位取货码
    private static String getCode() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        while (true) {
            for (int i = 0; i < 4; i++) {
                sb.append(r.nextInt(10));
            }
            if (!lock.getGoods().containsKey(sb.toString())) {
                break;
            }
        }
        return sb.toString();
    }
}
