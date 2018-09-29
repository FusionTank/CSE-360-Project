
package cse360project;

import javax.swing.*;
import java.awt.*;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


public class NodeGUI extends JFrame {
    
    JLabel      durationLabel = new JLabel ( "Duration: ");
    JTextField  durationTextField = new JTextField (10);
    
    JLabel       nameLabel = new JLabel ( "Name: ");
    JTextField   nameTextField = new JTextField (10);
    
    JLabel       dependentsLabel = new JLabel ( "Dependents: ");
    JTextField   dependentsTextField = new JTextField (10);
    
    
 //Buttons
    JButton     addButton       = new JButton ("Add");
    JButton     deleteButton    = new JButton ("Delete");
    JButton     displayButton   = new JButton ("Display all");
    JButton     exitButton      = new JButton ("Exit");
    
    
   public NodeGUI (){
       
       JPanel flow1Panel    = new JPanel(new FlowLayout (FlowLayout.CENTER) );
       JPanel flow2Panel    = new JPanel(new FlowLayout (FlowLayout.CENTER) );
       
       JPanel gridPanel     = new JPanel (new GridLayout(2,1));
       
       flow1Panel.add (durationLabel);
       flow1Panel.add (durationTextField);
       flow1Panel.add (nameLabel);
       flow1Panel.add (nameTextField);
       flow1Panel.add (dependentsLabel);
       flow1Panel.add (dependentsTextField);
       
       flow2Panel.add (addButton);
       flow2Panel.add (deleteButton);
       flow2Panel.add (displayButton);
       flow2Panel.add (exitButton);
       
       gridPanel.add (flow1Panel);
       gridPanel.add (flow2Panel);
       
       add (gridPanel, BorderLayout.SOUTH);
   }
}
