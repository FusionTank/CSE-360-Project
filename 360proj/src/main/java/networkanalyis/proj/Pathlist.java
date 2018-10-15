
package networkanalyis.proj;

import java.util.List;
import java.util.*;


public class Pathlist {
    
    private int pathtime;
    private List<String> path;

   
    
   
   //Default Constructor---------------------------------
    public Pathlist (){
        
        
    }
     //Parameterized Constructor-----------------------------------
    public Pathlist( int pathtime, List<String> path){
        
        this.pathtime = pathtime;
        this.path = path;
        
    }
    
   public List<String> getPath(){
       return this.path;
   }
   
   public int getPathtime(){
       return this.pathtime;
   }
   
   
   public void setPathList(List<String> path){
       this.path = path;
   }
   
    public void setPathtime(int pathtime){
       this.pathtime = pathtime;
    }
    
    public void addPath(String path){
        this.path.add(path);
    }
}
