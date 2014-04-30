//Hunter O'Folan
//GUI interface for War game.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class playingWindow extends JFrame
{

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


   public playingWindow()
   {
            
      setTitle("War Game");
      setSize(width,heigth);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new FlowLayout());
      buildPanelLeft();
      
      buildPanelMiddle();
      buildPanelRight();
      
      add(left);
      add(middle);
      add(right);
      setVisible(true);
      }
      
      private void buildPanelLeft()
      {
         left = new JPanel();
         
         messageLeft = new JLabel("PLAYER ONE");
         
         ImageIcon pic = new ImageIcon("back.jpg");
         
         imageLeft = new JLabel(pic);
         
         
         
         left.add(messageLeft);
         left.add(imageLeft);
         
      
      
      }
      
      private void buildPanelRight()
      {
         right = new JPanel();
         messageRight = new JLabel("PLAYER TWO");
         
         ImageIcon picR = new ImageIcon("back.jpg");
         
         imageRight = new JLabel(picR);
         
         
         right.add(imageRight);
         right.add(messageRight);
         
      
      
      }
      
      private void buildPanelMiddle()
      {
         goButton = new JButton("GO");
         
         goButton.addActionListener(new ButtonListener());
         
         middle = new JPanel();
         middle.add(goButton);
         
      }

      
      private class ButtonListener implements ActionListener
      {
      
         public void actionPerformed(ActionEvent e)
         {
         
         JOptionPane.showMessageDialog(null,"you clicked it");
         }
      }
      
      
      
         

public static void main(String[]arg)
{
   playingWindow game = new playingWindow();

}







}