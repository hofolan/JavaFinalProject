import java.util.ArrayList;

public class Player
{
   //fields
   private cardPile stack;
   private ArrayList<Card> CardsInHand;
   private String name;
   private int warsLost;
   private boolean status = false;
   
   
   
   
   //methods
   
   
   /**
   Constructor:  gives the player half of the deck
   */
   public Player(cardPile c)
   {
      CardsInHand = c.getHalfDeck();
   }

   /**
   method takes card from top of pile in preparation for playing it
   @return Card object
   */
   public Card takeFromTop()
   {
      return CardsInHand.remove(0);
   }
   
   
   
   /**
   method looks at top card. useful for loop conditionals
   @return card object from the top of array
   */
   public Card examineTop()
   {
      return CardsInHand.get(0);
   }
   
   /**
   method returns a card object to bottom of pile. 
   this will be used for when the player wins eihter a pair of cards, or the war
   game... 8 cards...or even more
   @param card object 
   */
   public void backToBottom(Card o)
   {
     CardsInHand.add(o);
   }
   
   /**
   method to return number of wars lost from War class
   @return the number of wars one player has lost.
   */
   public void warStatus(War object)
   {
      warsLost = object.getWarsLost();
      
   
   }

/**
method to see if players hand is ever empty
@return boolean
*/
   public boolean loser()
   {
   
      boolean status;
         if(CardsInHand.isEmpty() || warsLost >=3)
            status = true;
         else
            status = false;
    
   return status;
   }

   
   
   public int sizeOfHand()
   {
      return CardsInHand.size();
   }  




   public static void main(String[] args)
      {
                 
             
        
      }


}