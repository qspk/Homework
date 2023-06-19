package t5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Deck deck;
    private List<Player> players;
    private List<Card> bottomCards;

    public Game() {
        deck = new Deck();
        deck.shuffle();
        players = new ArrayList<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
        players.add(new Player("Player 3"));
        bottomCards = deck.deal(3);
    }

    public void start() throws InterruptedException {
        for (Player player : players) {
            player.receiveCards(deck.deal(17));
            new Thread(player).start();
        }
        System.out.println("Bottom Cards: " + bottomCards);
        Thread.sleep(5000);
        int index = new Random().nextInt(3);
        Player landlord = players.get(index);
        landlord.receiveCards(bottomCards);
        System.out.println("Landlord is " + landlord.getName());
        synchronized (landlord) {
            landlord.notify();
        }
    }
}

