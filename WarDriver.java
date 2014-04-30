//Hunter O'Folan
//CS 110 Final Project

//War game player

// this card game takes a deck, shuffles it, splits it in half and gives one half to one player
//and the other half to the other player.

//One card is played at a time. the player with the higher card takes both cards.

//if the cards match, War ensues, 3 cards ar placed face down, and one face up.
// whoevers face up cards are higher takes all 8 cards.

// the game is lost if 3 consecutive wars are lost, or a player runs out of cards.

public class WarDriver
{
   public static void main(String[]args)
   {
         gameMode newGame = new gameMode();
      
      
         newGame.Play();
   
   }


}