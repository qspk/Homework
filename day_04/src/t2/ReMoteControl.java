package t2;

import java.util.Scanner;

public class ReMoteControl {
    public void controlTv(TV tv) {
        System.out.println("遥控器控制电视");
        System.out.println("请输入想观看的节目");
        String channel = new Scanner(System.in).nextLine();
        tv.play(channel);
    }
}
