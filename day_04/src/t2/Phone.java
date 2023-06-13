package t2;

import java.util.Scanner;

public class Phone implements RedRay{
    @Override
    public void control(TV tv) {
        System.out.println("手机开启红外功能,控制电视");
        System.out.println("请输入想观看的节目");
        String channel = new Scanner(System.in).nextLine();
        tv.play(channel);
    }
}
