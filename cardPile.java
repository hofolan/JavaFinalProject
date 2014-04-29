import java.util.ArrayList;

public class cardPile extends Deck
{
   //fields
   private int halfPile = 26;
   private int arrayArray = 2;
   private static ArrayList<Card> pileA;
   private static ArrayList<Card> pileB;
   
   private static ArrayList<ArrayList<Card>> bothPiles;
   
   
   
   //methods
   /**
   Constructor: sets sizes of both card piles for each player
   */
   public cardPile()
   {
     pileA = new ArrayList<Card>(halfPile);
     pileB = new ArrayList<Card>(halfPile);
     
     bothPiles = new ArrayList<ArrayList<Card>>(arrayArray);
     
     bothPiles.add(pileA);
     bothPiles.add(pileB);
   }

   
   /**
   method to give half a deck to a player
   @return array list of 26  shuffled cards
   */
   public ArrayList<Card> getHalfDeck()
   {
     
    return bothPiles.get(0);   
   }
   
   
   
   /**
   split deck method:  takes in a Deck object and divides the cards in two
   */
   public void splitDeck(Deck d)
   {
      
      d.shuffle();
      
      while(d.cardsRemaining() > 26)
      {
         pileA.add(d.dealCard());
      }
      
      while(!d.isEmpty())
      {
         pileB.add(d.dealCard());
      }
   
   
   }

   
   

      public static void main(String[] args)
      {
                 
         Deck play = new Deck();
         cardPile playerOne = new cardPile();
         playerOne.splitDeck(play);
         
         
         //for(Card o: pileA)
         //System.out.println(o);
         
         System.out.println("\n\n\n");
         Card ace = new Card(1,0);
         
         for(Card o: pileB)
         System.out.println(o);
         System.out.println("\n\n\n");
         System.out.println(pileB.remove(0));
         
      System.out.println("\n\n\n");
      
      pileB.add(ace);
        
         for(Card o: pileB)
         System.out.println(o);
      }

}