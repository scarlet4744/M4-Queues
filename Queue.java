
public class Queue {
	private int length;
	private Node front;
    private Node rear;
    
    //default constructor for queue
    public Queue() {
    	length = 0;
        this.front = this.rear = null;
    } //end of constructor
    
    //insert customer into queue (rear)
    public void enqueue(int key) {
        Node temp = new Node(key);
        
        if(isEmpty()) {
            this.front = temp;
        } else {
        	rear.setNext(temp);
        }
            rear = temp;
            length++;
        
    } //end of enqueue
    
    //remove customer from queue
    public int dequeue() throws Exception{
    	if(isEmpty() ) {
    		throw new Exception ("queue");
    	}
    	
    	int result = front.getKey();
    	front = front.getNext();
    	length--;
    	
        if(isEmpty()) {
            rear = null;
        }
        return result;
        
    } //end of dequeue
    
    //number of customers in line
    public int size() {
    	return length;
    } //end of size
    
    //checks to see if queue is empty
    public boolean isEmpty() {
    	return (length ==0);
    }
    
    //shows data at front of queue
    public int first() throws Exception {
    	if(isEmpty()) {
    		throw new Exception();
    	}
    	
    	return front.getKey();
    } //end of first
    
    //shows data at end of queue
    public int last() throws Exception {
    	if(isEmpty()) {
    		throw new Exception();
    	}
    	
    	return rear.getKey();
    } //end of last
    
    //searches the queue for specified key
    public void search(int key) throws Exception {
    	Node current = front;
    	int i = 1;
    	boolean flag = false;
    	
    	if(isEmpty()) {
    		throw new Exception();
    	} else {
    		while(current != null) {
    			if(current.getKey() == key) {
    				flag = true;
    				break;
    			}
    			i++;
    			current = current.getNext();
    		}
    	}
    	
    	if(flag) {
    		System.out.println("[" + key + "] is in line in spot: " + i);
    	} else {
    		System.out.println("Key is not in the line.");
    	}
    } //end of search
    
    //overridden toString method
    @Override
    public String toString() {
    	String result = "";
    	Node current = front;
    	while(current != null) {
    		result = result + current.toString() + "\n";
    		current = current.getNext();
    	}
    	
    	return result;
    } //end of toString
    
} //end of class
