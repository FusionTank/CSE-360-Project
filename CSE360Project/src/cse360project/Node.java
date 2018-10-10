package cse360project;

import java.util.List;
import java.util.*;
import my.networkanalysis.NetworkAnalysisGUI;
import cse360project.LinkedListofNodes;

public class Node {
    private String name;
    private int duration;
    private List<String> dependents; //Parents
    private List<String> children;
    
    
    
    
   //Default Constructor---------------------------------
    public Node (){
        
        
    }
     //Parameterized Constructor-----------------------------------
    public Node( String name, int duration, List<String> dependents){
        
        this.name = name;
        this.duration = duration;
        this.dependents = dependents;
        
    }
    
    //Methods-----------------------------------------------------------
    
    public void addTochildren(){
        if(this.dependents.toString().matches(name) == nodelist.
                
                

                }
    
    
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
      
      public void setName(String name){
          this.name = name;
      } 
    
       public void setDuration(int duration){
          this.duration = duration;
      } 
       
       
        public void setDependents(List<String> dependents){
          this.dependents = dependents;
      } 
        
   
      
      
}
