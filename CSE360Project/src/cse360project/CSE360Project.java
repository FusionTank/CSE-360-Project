
package cse360project;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import my.networkanalysis.NetworkAnalysisGUI;
import java.util.*;

 class CSE360Project {

    public static void main(String[] args) {
        
       List<Node> nodelist = new ArrayList<Node>();
        
        
        
        // GUI Components----------------------------------
        NetworkAnalysisGUI app = new NetworkAnalysisGUI();
        app.setVisible (true);
        app.setSize(750, 550);
        app.setLocation(200,100);
        app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
       // ---------------------------------------------------
        
      
    }
    
}
