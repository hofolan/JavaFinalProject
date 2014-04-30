public class War
{

//i want this to keep track of how many wars have been won. if equal to three, that player wins.
//the contents of this class can be used to inform the loser() method in Player class.

   //FIELDS
   private int warsLost;
   
   //methods
   
   /**
   constructor:  sets losses to zero initially
   */
   public War()
   {
      warsLost = 0;
   }
   
   
   /**
   method to increase the number of wars lost in case a player loses a war battle
   */
   public void addWarLost()
   {
      warsLost++;
   }
      
      
   /**
   method to return the number of wars lost for  player
   @return number of wars lost.  IF it's three, you lose.
   */   
   public int getWarsLost()
   {
      return warsLost;
   }   
   

}