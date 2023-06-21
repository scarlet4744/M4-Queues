
public class Node {
	public int key;
    public Node next;
    
    //default constructor
    public Node() {
    	next = null;
    	key = 0;
    }
    
    //constructor 
    public Node(int key) {
        this.key = key;
        this.next = null;
    }
    
    //setters and getters for nodes and keys
    public Node getNext() {
    	return next;
    }
    
    public void setNext(Node node) {
    	next = node;
    }
    
    public int getKey() {
    	return key;
    }
    
    public void setKey(int element) {
    	key = element;
    }
    
    //toString method
    @Override
    public String toString() {
    	return Integer.toString(key);
    }
    
} //end of class
