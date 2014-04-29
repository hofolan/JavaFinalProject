import java.util.ArrayList;

public class Player
{
   //fields
   private cardPile stack;
   private ArrayList<Card> CardsInHand;
   private String name;
   
   
   
   
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
   method returns a card object to bottom of pile. 
   this will be used for when the player wins eihter a pair of cards, or the war
   game... 8 cards...or even more
   @param card object
   */
   public void backToBottom(Card o)
   {
     CardsInHand.add(o);
   }







   public static void main(String[] args)
      {
                 
         Deck play = new Deck();//make deck
         
         cardPile game = new cardPile();//create card pile object
         
         game.splitDeck(play);//shuffle and split deck
         
         Player playerOne = new Player(game);//instantiate each player
         
         Player playerTwo = new Player(game);
         
         //now we should be able to play.
         
         
         System.out.print(playerOne.takeFromTop()+"\n");
         System.out.print(playerOne.takeFromTop());         
        
      }


}