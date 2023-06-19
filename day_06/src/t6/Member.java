package t6;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member() {
    }

    public Member(String name, double money) {
        super(name, money);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void receivePacket(ArrayList<Double> list){

        if (list.size()>0){ // 判断集合是否为空 , 为空不执行
            // 随机抽取一个红包
            int index = new Random().nextInt(list.size());
            // 获取这个成员本来有多少钱
            double money = super.getMoney();
            // 把红包的钱存入个人账户
            super.setMoney(list.get(index)+money);
            // 删除集合中被选中的这个红包,防止下一次又选到这个红包了
            list.remove(index);
        }
    }
}
