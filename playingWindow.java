//Hunter O'Folan
//GUI interface for War game.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class playingWindow extends JFrame
{
      //fields for display
      final int width = 800;
      final int heigth = 300;
      private JPanel left;
      private JPanel middle;
      private JPanel right;
      
      private JLabel messageLeft;
      private JLabel imageLeft;
      
      private JButton goButton;
      
      private JLabel messageRight;
      private JLabel imageRight;
      String[] list = {"queenc.jpg","3h.jpg","10h.jpg","5h.jpg","3s.jpg"};
      
      //field for War game content
      private gameModeGUI game = new gameModeGUI();


   public playingWindow()
   {
            
      setTitle("War Game");
      setSize(width,heigth);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new BorderLayout());
      
      //left side
      left = new JPanel();
         messageLeft = new JLabel("PLAYER ONE");
         left.add(messageLeft);
         
            ImageIcon backCard = new ImageIcon("back.jpg");
            imageLeft = new JLabel("WAR!");
            imageLeft.setIcon(backCard);
            left.add(imageLeft);
            
         add(left,BorderLayout.WEST);
         
      //middle
      middle = new JPanel();
         goButton = new JButton("GO");
         goButton.addActionListener(new ButtonListener());
         middle.add(goButton);
         add(middle,BorderLayout.CENTER);
      
      //right
      right = new JPanel();   
         messageRight = new JLabel("PLAYER TWO");
         right.add(messageRight);
         
         imageRight = new JLabel("WAR!");
         imageRight.setIcon(backCard);
         right.add(imageRight);
         
         add(right,BorderLayout.EAST);
   
         
      setVisible(true);
      
      //LOAD THE WAR GAME
      //gameModeGUI game = new gameModeGUI();
      }
      
      
      
      
      //button listener.....where the action takes place
      private class ButtonListener implements ActionListener
      {
      
         public void actionPerformed(ActionEvent e)
         {
         game.Play();//start playing
         
         //get image files
         String leftPic = game.ImageOne();
         String rightPic = game.ImageTwo();
         //get loser status
         boolean leftLost = game.lostGameOne();
         boolean rightLost = game.lostGameTwo();
                  
         
         
           //set images to what we get in                 
         ImageIcon newPicLeft = new ImageIcon(leftPic);
         ImageIcon newPicRight = new ImageIcon(rightPic);
         
         imageLeft.setIcon(newPicLeft);
         imageLeft.setText(null);
         
         imageRight.setIcon(newPicRight);
         imageRight.setText(null);
         
             //have we lost?     
            if(leftLost)
            JOptionPane.showMessageDialog(null,"Player ONE loses");
            if(rightLost)
            JOptionPane.showMessageDialog(null,"Player TWO loses");
         
                           
        }
     }
      
      
      
         
         
         
         

public static void main(String[]arg)
{
   playingWindow game = new playingWindow();

}







}