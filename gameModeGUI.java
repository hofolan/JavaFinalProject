import java.util.Scanner;
import java.util.ArrayList;

public class gameModeGUI
{
   //fields
   private Player playerOne;
   private Player playerTwo;
   private Deck play;
   private cardPile game;
   private War first;
   private War second;
   private ArrayList<Card> warBank;
   private imageSort sorter;
   private imageSort sorter2;
   
   
   
   
   //methods
   
   
   public gameModeGUI()
   {
      play = new Deck();//make deck
         
      game = new cardPile();//create card pile object
         
      game.splitDeck(play);//shuffle and split deck
         
      playerOne = new Player(game);//instantiate each player
         
      playerTwo = new Player(game);
      
      first = new War();
      second = new War();
      
      
   
   }
  
  
   public void Play()
   {
               //DRAW CARDS                        
               Card one = playerOne.takeFromTop();
               
               Card two = playerTwo.takeFromTop();
               
               //process images of the cards
                sorter = new imageSort();
                sorter2 = new imageSort();
   
                 
               sorter.fixImage(one);
               sorter2.fixImage(two);
   
                                   
               System.out.println("\n\n"+one + "  vs  "+ two +"\n");
               
                  if(one.getRank() > two.getRank())//one bigger than two
                     {
                        System.out.print(one +" is bigger than "+ two);
                        
                        playerOne.backToBottom(one);
                        playerOne.backToBottom(two);
                       
                     }   
                  
                  else if(two.getRank() > one.getRank())//two bigger than one
                     {   
                        System.out.print(two +" is bigger than "+ one);
                        
                        playerTwo.backToBottom(one);
                        playerTwo.backToBottom(two);
                        
                     }
                     
                  else //war
                  {  
                     
                     
                                         
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
                        
                                               
                        if(sixFace.getRank() > tenFace.getRank())//compare again
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
                        {//compare again
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
                  playerOne.warStatus(first);//log the status of war losses
                  playerTwo.warStatus(second);
                  
                  
            
            System.out.println("\nPlayer One Cards remaining: "+ playerOne.sizeOfHand());// print size as check
            System.out.println("\nPlayer Two Cards remaining: "+playerTwo.sizeOfHand());
            
            System.out.println("\n player One wars lost: "+ first.getWarsLost());
            System.out.println("\n player Two wars lost: "+ second.getWarsLost());
            
                        
         
         if(playerOne.loser())
         System.out.println("player One lost");
         if(playerTwo.loser())
         System.out.println("player Two lost");
               
   }
   
   
   /**
   ImageOne() and ImageTwo() methods to return strings of the image for GUI
   @return image file string
   */
   
   public String ImageOne()
   {
      String str = sorter.getImage();
      return str;
   }
   
   public String ImageTwo()
   {
      String str = sorter2.getImage();
      return str;
   }
      
   
   /**
   lostGameOne() and lostGameTwo() methods to return booleans of loss status
   @return boolean
   */
   public boolean lostGameOne()// did player one lose
   {
     boolean state = playerOne.loser();
         
      return state;
   }  
   
   public boolean lostGameTwo()//did player two lose
   {
      boolean state = playerTwo.loser();
      return state;
   } 
   
   
   
         
      
      
   
   
   
   
   
   public static void main(String[]args)
   {
   
      gameModeGUI trial = new gameModeGUI();
      
      
      trial.Play();
      
      //System.out.println("here"+ trial.ImageOne());
      
   }
   






}