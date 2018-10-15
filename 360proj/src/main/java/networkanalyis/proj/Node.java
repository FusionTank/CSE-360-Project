package networkanalyis.proj;

import java.util.List;
import java.util.*;


public class Node {
    private String name;
    private int duration;
    private List<String> dependents; //Parents
    private List<String> children;
    
    //public List<Node> nodelist;
    
    
    
    
   //Default Constructor---------------------------------
    public Node (){
        
        
    }
     //Parameterized Constructor-----------------------------------
    public Node( String name, int duration, List<String> dependents,List<String> children){
        
        this.name = name;
        this.duration = duration;
        this.dependents = dependents;
        this.children= children;
        
    }
    
    //Methods-----------------------------------------------------------
    
//    public void addTochildren(){
//        if(this.dependents.toString().matches(name) == nodelist.toString().matches(name))
//        {
//            this.children.add(name);
//        }
//
//    
//                
//                
//
//                }
    
    
    public String displayNode(){
        return name + duration + dependents;
    }
    
    
    public String getName (){
        return name;
    }
    
     public int getDuration (){
        return duration;
    }
     
     
      public List<String> getDependents (){
        return dependents;
    }
      
         public List<String> getChildren (){
        return children;
    }
      
      public void setName(String name){
          this.name = name;
      } 
    
       public void setDuration(int duration){
          this.duration = duration;
      } 
       
       
        public void setDependents(List<String> dependents){
          this.dependents = dependents;
      } 
        
        
          public void setChildren(List<String> children){
          this.children = children;
      } 
          
           public void addChildren(String child){
          children.add(child);
      } 
           
           
        
        public String toString(Node node){
          String convertedToString = String.valueOf(this.name); 
          return convertedToString;
      } 
      
      
}
