import java.util.Scanner;
import java.util.ArrayList;

public class gameMode
{
   //fields
   private Player playerOne;
   private Player playerTwo;
   private Deck play;
   private cardPile game;
   private War first;
   private War second;
   private ArrayList<Card> warBank;
   
   
   //methods
   
   
   public gameMode()
   {
      play = new Deck();//make deck
         
      game = new cardPile();//create card pile object
         
      game.splitDeck(play);//shuffle and split deck
         
      playerOne = new Player(game);//instantiate each player
         
      playerTwo = new Player(game);
   
   }
  
  
   public void Play()
   {
                     
                     first = new War();
                     second = new War();
            
            while(!playerOne.loser() && !playerTwo.loser())
            {
            
               Card one = playerOne.takeFromTop();
               
               Card two = playerTwo.takeFromTop();
               
                     
               System.out.println(one + "  vs  "+ two +"\n");
               
                  if(one.getRank() > two.getRank())
                     {
                        System.out.print(one +" is bigger than "+ two);
                        
                        playerOne.backToBottom(one);
                        playerOne.backToBottom(two);
                       
                     }   
                  
                  else if(two.getRank() > one.getRank())
                     {   
                        System.out.print(two +" is bigger than "+ one);
                        
                        playerTwo.backToBottom(one);
                        playerTwo.backToBottom(two);
                        
                     }
                     
                  else //war
                  {  
                     //create two war objects to keep track of losses
                     
                     //add first two cards to war bank.
                     //warBank.add(one);
                     //warBank.add(two);
                     
                     //now each player draws three face down, and one face up.
                     Card three = playerOne.takeFromTop();
                     Card four = playerOne.takeFromTop();
                     Card five = playerOne.takeFromTop();
                     Card sixFace = playerOne.takeFromTop();
                     System.out.println("3 cards drawn for player One, Face card: "+sixFace);
                     
                     Card seven = playerTwo.takeFromTop();
                     Card eight = playerTwo.takeFromTop();
                     Card nine = playerTwo.takeFromTop();
                     Card tenFace = playerTwo.takeFromTop();
                     System.out.println("\n3 cards drawn for player Two, Face card: "+tenFace);
                        
                       // while(tenFace.getRank() == sixFace.getRank())//loop to catch repeated matches
//                         {
//                         
//                         //add previous cards
//                         warBank.add(three);
//                         warBank.add(four);
//                         warBank.add(five);
//                         warBank.add(sixFace);
//                         warBank.add(seven);
//                         warBank.add(eight);
//                         warBank.add(nine);
//                         warBank.add(tenFace);
//                         
//                         System.out.println("unlikely second match in war");
//                         Card a = playerOne.takeFromTop();
//                         Card b = playerOne.takeFromTop();
//                         Card c = playerOne.takeFromTop();
//                         Card dFace = playerOne.takeFromTop();
//                         System.out.println("3 cards drawn for player One, Face card: "+dFace);
//                         
//                         Card e = playerTwo.takeFromTop();
//                         Card f = playerTwo.takeFromTop();
//                         Card g = playerTwo.takeFromTop();
//                         Card hFace = playerTwo.takeFromTop();
//                         System.out.println("\n3 cards drawn for player Two, Face card: "+hFace);
// 
//                         warBank.add(a);
//                         warBank.add(b);
//                         warBank.add(c);
//                         warBank.add(dFace);
//                         warBank.add(e);
//                         warBank.add(f);
//                         warBank.add(g);
//                         warBank.add(hFace);
//                                                 
//                         
//                         } 
                        
                        if(sixFace.getRank() > tenFace.getRank())
                        {
                           second.addWarLost();
                           playerOne.backToBottom(one);
                           playerOne.backToBottom(two);
                           playerOne.backToBottom(three);
                           playerOne.backToBottom(four);
                           playerOne.backToBottom(five);
                           playerOne.backToBottom(sixFace);
                           playerOne.backToBottom(seven);
                           playerOne.backToBottom(eight);
                           playerOne.backToBottom(nine);
                           playerOne.backToBottom(tenFace);
                           System.out.println("player one wins");
                           
                        }
                        
                        else
                        {
                           first.addWarLost();
                           playerTwo.backToBottom(one);
                           playerTwo.backToBottom(two);
                           playerTwo.backToBottom(three);
                           playerTwo.backToBottom(four);
                           playerTwo.backToBottom(five);
                           playerTwo.backToBottom(sixFace);
                           playerTwo.backToBottom(seven);
                           playerTwo.backToBottom(eight);
                           playerTwo.backToBottom(nine);
                           playerTwo.backToBottom(tenFace);
                           System.out.println("player two wins");
                        }

                  
                  }
                  playerOne.warStatus(first);
                  playerTwo.warStatus(second);
            
            System.out.println("\nPlayer One Cards remaining: "+ playerOne.sizeOfHand());// print size as check
            System.out.println("\nPlayer Two Cards remaining: "+playerTwo.sizeOfHand());
            
            System.out.println("\n player One wars lost: "+ first.getWarsLost());
            System.out.println("\n player Two wars lost: "+ second.getWarsLost());
            //need user input delay for each loop.
            
            Scanner delay = new Scanner(System.in);
            String advance = delay.next();
            }
         
         if(playerOne.loser())
         System.out.println("player One lost");
         else
         System.out.println("player Two lost");
               
   }
   
   
   
         
      
      
      
   
   
   
   
   
   public static void main(String[]args)
   {
   
      gameMode trial = new gameMode();
      
      
      trial.Play();
   }
   






}