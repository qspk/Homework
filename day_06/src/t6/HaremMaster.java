package t6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class HaremMaster extends User {
    public HaremMaster() {
    }

    public HaremMaster(String name, double money) {
        super(name, money);
    }

    public ArrayList<Double> givePacket(int totalMoney, int sum) {
        ArrayList<Double> redList = new ArrayList<>();
        double money = getMoney();
        if (money < totalMoney) {
            System.out.println("老板你钱不够呀, 别装大款啦, 有多少就发多少");
            return redList;
        }
        setMoney(money - totalMoney);
//        double averMoney = new BigDecimal((double) totalMoney / sum).
//                setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        Double aveMoney = BigDecimal.valueOf(totalMoney).
                divide(BigDecimal.valueOf(sum), RoundingMode.HALF_UP).doubleValue();


        for (int i = 0; i < sum; i++) {
            redList.add(aveMoney);
        }
        return redList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
