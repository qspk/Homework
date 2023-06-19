package landlords.entry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entry {

    public static void main(String[] args) {

        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        List<String> broker = new ArrayList<>();

        /*往牌盒里装牌
         * ♦♣♥♠
         * */
        //定义花色数组
        String[] colors = {"♦" , "♣" , "♥" , "♠" };

        //定义点数数组
        String[] numbers = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A"};

        //拼接让每个花色都有13张从2-A的牌
        for (String color : colors) {
            for (String number : numbers) {
                broker.add(color+number);
            }
        }

        //加入大小王
        broker.add("小王");
        broker.add("大王");

        // 洗牌，打乱集合中的元素
        Collections.shuffle(broker);

        // 补全代码
        //发牌，遍历集合给三个玩家发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < broker.size(); i++) {

            String poker = broker.get(i);   //得到array集合里所有的牌

            //判断最后三张牌
            if (i >= broker.size() - 3){
                dipai.add(poker);
            }else if(i % 3==0){
                player01.add(poker);
            }else if(i % 3==1){
                player02.add(poker);
            }else if(i % 3==2){
                player03.add(poker);
            }
        }

        lookPoker("玩家一",player01);
        lookPoker("玩家二",player02);
        lookPoker("玩家三",player03);
        lookPoker("底牌",dipai);

    }

    //每个人看牌的方法，其实就是遍历每个人集合的方法
    public static void lookPoker(String name , ArrayList<String> array){
        System.out.print(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}
