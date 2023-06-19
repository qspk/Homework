package t5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        cards.add(new Card("", "Joker"));
        cards.add(new Card("", "Joker"));
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> deal(int num) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }

    public List<Card> getCards() {
        return cards;
    }
}