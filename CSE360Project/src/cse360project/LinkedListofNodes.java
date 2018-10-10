
package cse360project;
import java.util.LinkedList;
import java.util.List;
import my.networkanalysis.NetworkAnalysisGUI;




public class LinkedListofNodes {
    Node node = new Node();
    static Node head;
    
    LinkedList<Node> nodeLinkedList = new LinkedList<Node>();
    
    public static void addNode(String name, int duration, List<String> dependents){
    
        Node newNode = new Node(name, duration, dependents);
         if (head == null)
       {
            head = newNode;
            return;
       }

           newNode.next = head;
            head = newNode;
            return;
        
    
}
    
    public String displayNode(){
       Node current;
    String output = "";

    for (current=head; current!=null; current=current.next)
    {
        output+=current.getName()+" ("+current.getDuration()+") "+current.getDependents()+"\n";
    }
    
    return output;
    }
    
   public String displayNodeName(){
       Node current;
    String output = "";

    for (current=head; current!=null; current=current.next)
    {
        output+=current.getName()+"\n";
    }
    
    return output;
    } 
   
   
    public String displayNodeDuration(){
       Node current;
    String output = "";

    for (current=head; current!=null; current=current.next)
    {
        output+=current.getDuration()+"\n";
    }
    
    return output;
    } 
    
    
      public String displayNodeDependents(){
       Node current;
    String output = "";

    for (current=head; current!=null; current=current.next)
    {
        output+=current.getDependents()+"\n";
    }
    
    return output;
    } 
 

}
