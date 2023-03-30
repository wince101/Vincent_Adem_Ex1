package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Vincent Adem Feb 4, 2023
 */
import java.util.Scanner;
import java.util.Random;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
           
        }
        System.out.print("Enter the value of the card (1 to 13): ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of the card (1 to 4): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        for (Card card : hand) {
            if (card.equals(userCard)) {
                printInfo();
                break;
            }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Vincent Adem Feb 4, 2023
     */
    private static void printInfo(){
        
        /*"I;m done! */
        System.out.println("Congratulations, you guessed right!");
        System.out.println("Now I will be editing this java code");
        
        System.out.println("My name is Vincent, a student from Sheridan College");
	System.out.println("I am starting to learn how to use the GitHub and Netbeans!");    
        System.out.println("It was difficult at first because it is unfamiliar, but now I am gradually learning!");
        
        System.out.println("My career ambitions:");
        System.out.println("-- To be Fullstack Developer");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println("-- Strive to master my coding skills");	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV Shows");
        System.out.println("-- Riding my motorcycle");

        System.out.println("Thank you for reading this and I hope you know who I am now");
        
    
    }

}
