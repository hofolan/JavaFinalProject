//Hunter O'Folan
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class kiloConverter extends JFrame
{
   private JPanel panel;
   private JLabel messageLabel;
   private JTextField kiloTextField;
   private JButton calcButton;
   private JButton setColorCyan;
   private JButton setColorGreen;
   private JLabel image;
   private final int width = 400;
   private final int height = 100;
   
   
   public kiloConverter()
   {
      setTitle("KiloConverter");
      
      setSize(width,height);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      buildPanel();
      
      add(panel);
      
      setVisible(true);
   }
   
   private void buildPanel()
   {
      messageLabel = new JLabel("Enter a distance in Kilometers");
      
      kiloTextField = new JTextField(10);
      
      setColorCyan = new JButton("Cyanize");
      setColorGreen = new JButton("makeGreen");
      
      calcButton = new JButton("Calcumalate");
      
      ImageIcon image1 = new ImageIcon("10c.jpg");
      image = new JLabel(image1);
      calcButton.setForeground(Color.BLUE);
      
      calcButton.addActionListener(new calcButtonListener());
      setColorCyanListener listener = new setColorCyanListener();
      setColorCyan.addActionListener(listener);
      
      setColorGreenListener listenerG = new setColorGreenListener();
      setColorGreen.addActionListener(listenerG);
      calcButton.setIcon(image1);
      panel = new JPanel();
      
      panel.setLayout(new GridLayout(3,3));
      panel.setBackground(Color.RED);
      panel.add(messageLabel);
      panel.add(kiloTextField);
      panel.add(calcButton);   
      panel.add(setColorCyan);
      panel.add(setColorGreen);
      panel.add(image);
        
         
         
   }



private class setColorCyanListener implements ActionListener
{
   public void actionPerformed(ActionEvent e)
   {
      panel.setBackground(Color.CYAN);
   }
   
}



private class setColorGreenListener implements ActionListener
{
   public void actionPerformed(ActionEvent e)
   {
      String actionCommand = e.getActionCommand();
   
      panel.setBackground(Color.GREEN);
      setColorCyan.setForeground(Color.PINK);
      
      if (actionCommand.equals("makeGreen"));
      System.out.print("you like green");
   }
   
}



private class calcButtonListener implements ActionListener
{
   public void actionPerformed(ActionEvent e)
   {
      final double conversion = .6214;
      String input;
      double miles;
      
      input = kiloTextField.getText();
      miles = Double.parseDouble(input)*conversion;
      
      JOptionPane.showMessageDialog(null,input+" kilometers is "+miles+" miles");
   }



}


//main

public static void main(String[] args)
{
   new kiloConverter();
}

}