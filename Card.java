/**
 * Representation of a single playing card (from a standard 52 card deck). 
 * A card consists of a suit value and a rank value.  Once instantiated, the
 * Card object cannot change.
 *
 * @Jackie Horton
 this was basically all taken from Jackie, I modified some of the rank constants a little
 */

public class Card 
{     
    // Constants     
    // suits
    public final static int SPADES = 0,      
                            HEARTS = 1,
                            DIAMONDS = 2,
                            CLUBS = 3;
    // ranks
    // Cards 2 through 9 have face value
               
     public final static int JACK = 10,        
                             QUEEN = 11,       
                             KING = 12,
                             ACE = 13;
                            
    // instance variables
    private int suit;   // The suit of this card, one of the constants
                              // SPADES, HEARTS, DIAMONDS, CLUBS.
                              
    private int rank;  // The rank of this card, from 1 to 13.
    
    private String imageTag;// stores string representatin of image file name
                             
   /**
   * Creates a new playing card.
   * @param suit the suit value of this card.
   * @param rank the rank rank of this card.
   */
    public Card(int rank, int suit) 
    {
        this.rank = rank;
        this.suit = suit;
    }
    
   /**
   * Creates a new playing card as exact copy of otherCard
   * @param otherCar the card to be copied
   */
    public Card(Card otherCard) 
    {
         this.rank = otherCard.rank;
         this.suit = otherCard.suit;
    }
    
   /**
   * Returns the suit of the card.
   * @return a Suit constant representing the suit value of the card.
   */
  
    public int getSuit() 
    {
      return suit;
    }
   /**
   * Returns the rank of the card.
   * @return a Rank constant representing the rank value of the card.
   */

    public int getRank() 
    {
            // Return the int that codes for this card's rank.
        return rank;
    }
    
   /**
   * Returns a description of the suit of this card.
   * @return the suit value of the card as a string.
   */
    public String getSuitAsString() 
    {
            // Return a String representing the card's suit.
            // (If the card's suit is invalid, "??" is returned.)
        switch ( suit ) {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
           default:       return "Invalid";
        }
    }
   /**
   * Returns a description of the rank of this card.
   * @return the rank value of the card as a string.
   */
   public String getRankAsString() 
   {
        switch ( rank ) {
           case 13:   return "Ace";
           case 1:   return "2";
           case 2:   return "3";
           case 3:   return "4";
           case 4:   return "5";
           case 5:   return "6";
           case 6:   return "7";
           case 7:   return "8";
           case 8:   return "9";
           case 9:  return "10";
           case 10:  return "Jack";
           case 11:  return "Queen";
           case 12:  return "King";
           default:  return "??";
        }
    }
   /**
   * Returns a description of this card.
   * @return the name of the card.
   */

    public String toString() 
    {
        return getRankAsString() + " of " + getSuitAsString();
    }
    
   /**
   * Compares two cards to determine if they have the same value.
   * @param card the other card
   * @return true if the two cards have the same rank and suitvalues,
   * falseotherwise.
   */
   public boolean equals(Card otherCard ) 
   {
      if ( ( rank != otherCard.rank ) || ( suit != otherCard.suit ) )
         return false;
      else
         return true;
   }
   
   
   public void setImageTag(String s)
   {
   
      imageTag = s;
   }
   
   public String getImageTag()
   {
      return imageTag;
   }


public static void main(String[]args)
{
   Card ner = new Card(2,2);
   System.out.println(ner.getRank());
}
}
    

