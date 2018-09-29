package cse360project;


public class Node {
    private String name;
    private int duration;
    private String dependents;
    
    
    
   //Default Constructor---------------------------------
    public Node (){
        
        name = "";
        duration = 0;
        dependents = "";
        
    }
     //Parameterized Constructor-----------------------------------
    public Node( String name, int duration, String dependents){
        
        this.name = name;
        this.duration = duration;
        this.dependents = dependents;
        
    }
    
    //Methods-----------------------------------------------------------
    public String getName (){
        return name;
    }
    
     public int getDuration (){
        return duration;
    }
     
     
      public String getDependents (){
        return dependents;
    }
      
      public void setName(String name){
          this.name = name;
      } 
    
       public void setDuration(int duration){
          this.duration = duration;
      } 
       
       
        public void setDependents(String dependents){
          this.dependents = dependents;
      } 
        
   
      
      
}
