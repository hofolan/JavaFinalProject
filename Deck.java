import java.util.Random;
public class Deck 
{
   final int CARDS_IN_DECK = 52;

   Card [] deck;
   int ct;
   
   
   /**
   constructor: automatically makes a fresh deck and all the cards to go with it.
   */   
   public Deck()
   {
      freshDeck();
   }
   
   /**
   freshDeck() method to create 52 cards
   */
   public void freshDeck()
   {
      deck = new Card[CARDS_IN_DECK];
      for (int r = 1; r<=Card.ACE;r++)
      {
         for (int s=Card.SPADES;s<=Card.CLUBS;s++)
         {
            deck[ct]=new Card(r,s);
            ct = ct + 1;
         }
      }
     
   
   
   }
   
   /**
   dealCard() method
   @return card object
   */
   public Card dealCard()
   {
      ct--;
      return deck[ct];
   }
   
   /**
   cardsRemaining()
   @return the number of cards remaining in deck
   */
   public int cardsRemaining()
   {  
      return ct;
   }
   
   /**
   shuffle method
   */
   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < ct; i++)
      {
         randNum = r.nextInt(ct);
         temp = deck[i];
         deck[i]=deck[randNum];
         deck[randNum]=temp;
      }
   }
   
   /**
   method to detemine whether the deck is empty or not
   isEmpty()
   */
   public boolean isEmpty()
   {
      return (cardsRemaining() == 0);
   }
   
   
      
   
   public static void main(String [] args) 
   {
      Deck deck = new Deck();
      
      //deck.shuffle();
      for(int i=0;i<52;i++)
            
      System.out.println(deck.dealCard());
      
      //System.out.println(deck.images[7]);
      //System.out.println(deck.ct);
      
   }
   
}