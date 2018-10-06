//This is going to be a node from a doubly linked list

package cse360project;

public class node {
	
	//start of the linked list
	node head;
	
	String act_name;
	int duration;
	
	//Pointers. Parent points to node on the left, dependents points to node on the right
	node parent;
	node dependents;
	
	 public node(){
	        
	        act_name = "";
	        duration = 0;
	        dependents = null;
	        
	    }
	
	//Adding an activity that doesn't have any dependency 
	public node(String activity, int duration) {
		act_name = activity;
		this.duration = duration;	
		parent = null;
		dependents = null;
	}
	
	//When adding an activity that is dependent on another
	public node(String activity, int duration, node dependency) {
		this.act_name = activity;
		this.duration = duration;	
		parent = dependency;
		dependents = null;
	}
	

}
