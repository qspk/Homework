package t5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements Runnable {
    private String name;
    private List<Card> hand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void receiveCards(List<Card> cards) {
        hand.addAll(cards);
    }

    public void playCards(List<Card> cards) {
        hand.removeAll(cards);
        System.out.println(name + " plays: " + cards);
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if (hand.size() > 0) {
                    List<Card> cards = new ArrayList<>();
                    for (Card card : hand) {
                        if (cards.size() == 0 || card.getRank().equals(cards.get(0).getRank())) {
                            cards.add(card);
                        } else {
                            break;
                        }
                    }
                    if (cards.size() > 0) {
                        playCards(cards);
                    } else {
                        playCards(Arrays.asList(hand.get(0)));
                    }
                }
            }
        }
    }
}