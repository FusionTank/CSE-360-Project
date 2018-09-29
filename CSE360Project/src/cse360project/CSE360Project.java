
package cse360project;

import javax.swing.JFrame;

 class CSE360Project {

    public static void main(String[] args) {
        
        NodeGUI app = new NodeGUI ();
        app.setVisible (true);
        app.setSize(800, 500);
        app.setLocation(200,100);
        app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
    }
    
}
