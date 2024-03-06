import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        createDeck();
    }

    public void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
        System.out.println("Deck shuffled.");
    }

    public void dealCard() {
        Collections.shuffle(cards);
        System.out.println("Dealing 5 cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
    }

    public void printCard(int index) {
        if (index >= 0 && index < cards.size()) {
            System.out.println("Card at index " + index + ": " + cards.get(index));
        } else {
            System.out.println("Invalid card index.");
        }
    }

    public void sameCard(String suit) {
        System.out.println("Cards from the suit " + suit + ":");
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    public void compareCard(String rank) {
        System.out.println("Cards with the rank " + rank + ":");
        for (Card card : cards) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    public void findCard(String suit, String rank) {
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Found card: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }
}
