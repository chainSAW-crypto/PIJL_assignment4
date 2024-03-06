import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            System.out.println("\n--- Card Deck Menu ---");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Deal 5 Cards");
            System.out.println("4. Print a specific card by index");
            System.out.println("5. Find cards from the same suit");
            System.out.println("6. Find cards with the same rank");
            System.out.println("7. Search for a specific card");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    break;
                case 3:
                    deck.dealCard();
                    break;
                case 4:
                    System.out.print("Enter card index: ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 5:
                    System.out.print("Enter suit (Hearts, Diamonds, Clubs, Spades): ");
                    scanner.nextLine(); // Consume newline
                    String suit = scanner.nextLine();
                    deck.sameCard(suit);
                    break;
                case 6:
                    System.out.print("Enter rank (2 to Ace): ");
                    scanner.nextLine(); // Consume newline
                    String rank = scanner.nextLine();
                    deck.compareCard(rank);
                    break;
                case 7:
                    System.out.print("Enter suit and rank (e.g., Spades Ace): ");
                    scanner.nextLine(); // Consume newline
                    String suitRankInput = scanner.nextLine();
                    String[] parts = suitRankInput.split(" ", 2);
                    if (parts.length == 2) {
                        deck.findCard(parts[0], parts[1]);
                    } else {
                        System.out.println("Invalid input format.");
                    }
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return; // exits the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
