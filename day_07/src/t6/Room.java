package t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 创建新牌
 * 洗牌
 * 发牌
 */
public class Room {
    private final ArrayList<MyCard> cards = new ArrayList<>();
    public Room() {
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♣", "♠", "♥", "♦"};

        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {

                cards.add(new MyCard(color, number, size));
            }
        }
        cards.add(new MyCard("", "\uD83C\uDCCF", ++size));
        cards.add(new MyCard("", "\uD83D\uDC72", ++size));
        System.out.println("新牌: "+cards);
    }

    //洗牌和发牌
    public void start() {
        ArrayList<MyCard> aaa = new ArrayList<>();
        ArrayList<MyCard> bbb = new ArrayList<>();
        ArrayList<MyCard> ccc = new ArrayList<>();
        Collections.shuffle(cards);

        for (int i = 0; i < cards.size() - 3; i++) {
            MyCard c = cards.get(i);
            if (i % 3 == 0) {
                aaa.add(c);
            } else if (i % 3 == 1) {
                bbb.add(c);
            } else {
                ccc.add(c);
            }
        }

        List<MyCard> lastThreeCards = new ArrayList<>();
        lastThreeCards = cards.subList(51, 54);


        sortCards(aaa);
        sortCards(bbb);
        sortCards(ccc);

        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(ccc);

        System.out.println("aaa抢到地主");
        aaa.addAll(lastThreeCards);
        sortCards(aaa);
        System.out.println(aaa);
    }

    //给牌排序
    private void sortCards(ArrayList<MyCard> cards) {
        cards.sort((o1, o2) -> o2.getSize() - o1.getSize());
    }
}
