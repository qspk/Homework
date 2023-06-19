package t6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 发红包
 */
public class Test {
    public static void main(String[] args) {
        HaremMaster master = new HaremMaster("老大",100);
        Member member01 = new Member("小弟一号",0);
        Member member02 = new Member("小弟二号",2.5);
        Member member03 = new Member("小弟三号",10);
        Member member04 = new Member("小弟四号",250);

        System.out.println("=================================");
        System.out.print("群主你想发几块钱的红包呢？");
        int inputMoney = new Scanner(System.in).nextInt(); // 输入发红包的金额

        System.out.println("=============恭喜发财==============");

        ArrayList<Member> members = new ArrayList<>(); // 把成员放到一个集合
        // 添加成员
        members.add(member01);
        members.add(member02);
        members.add(member03);
        members.add(member04);
        ArrayList<Double> redList = master.givePacket(inputMoney,members.size());
        for (int i = 0; i < members.size(); i++) {
            members.get(i).receivePacket(redList); // 成员抢红包
        }

        // 抢红包后各自的余额显示
        master.show();
        member01.show();
        member02.show();
        member03.show();
        member04.show();

        System.out.println("=============抢红包结束=============");
    }

}
