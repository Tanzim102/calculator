package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator {
   JFrame frame = new JFrame();
   JPanel panel = new JPanel();
   JTextArea textarea = new JTextArea(2,10);
   
   JButton button1 = new JButton();
   JButton button2 = new JButton();
   JButton button3 = new JButton();
   JButton button4 = new JButton();
   JButton button5 = new JButton();
   JButton button6 = new JButton();
   JButton button7 = new JButton();
   JButton button8 = new JButton();
   JButton button9 = new JButton();
   JButton button0 = new JButton();
   JButton buttonadd = new JButton();
   JButton buttonsub= new JButton();
   JButton buttonmul= new JButton();
   JButton buttondiv= new JButton();
   JButton buttonclear= new JButton();
   JButton buttondot= new JButton();
   JButton buttonequal= new JButton();
  
   
   
   public calculator( ) {
	   frame.setSize(340,450);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setTitle("calculator");
      
      frame.add(panel);
      panel.setBackground(Color.LIGHT_GRAY);
      Border border = BorderFactory.createLineBorder(Color.RED,4);
      panel.setBorder(border);
      
      panel.add(textarea);
      
      textarea.setBackground(Color.BLACK);
      Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
      textarea.setBorder(tborder);
      Font font = new Font ("arial",Font.BOLD,33);
      textarea.setFont(font);
      textarea.setForeground(Color.WHITE);
      textarea.setPreferredSize(new Dimension(2,10));
      textarea.setLineWrap(true);
      
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);
      panel.add(button7);
      panel.add(button8);
      panel.add(button9);
      panel.add(button0);
      
      panel.add(buttondot);
      panel.add(buttonsub);
      panel.add(buttonmul);
      panel.add(buttonadd);
      panel.add(buttondiv);
      panel.add(buttonequal);
      
      panel.add(buttonclear);
      
      
      
      
      
      
      
	   
   }
   
   
   
}
  