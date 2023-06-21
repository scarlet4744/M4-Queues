import java.util.Random;
import java.util.*;

public class test {

	public static void main(String[] args) throws Exception {
		
		//simulation time
		int maxTime = 720;
		
		//amount of time that has passed during simulation
		int totalTime = 0;
		
		//keep track of customers as they enter/leave queue
		int customerNumber = 1;
		
		/*
		//int custArrive = getRandomWaitTime();
		while(totalTime < maxTime) {
			int custArrive = getRandomWaitTime();
			System.out.println(custArrive);
			totalTime += custArrive;
		}
		
		System.out.println(totalTime);
		
			
		Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        //System.out.println("Queue Front : " + (q.front).key);
        //System.out.println("Queue Rear : " + (q.rear).key);
        
        System.out.println("The number of customers in the checkout line is: " + q.size());
        
		*/
		
		Queue arrayQueue = new Queue();
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);
        arrayQueue.enqueue(70);
        arrayQueue.enqueue(80);
        arrayQueue.enqueue(90);
        arrayQueue.dequeue();
        System.out.println(arrayQueue.toString());
        System.out.println("Number of customers in line: " + arrayQueue.size());
        arrayQueue.search(70);
        
		
	} //end of main
	
	private static int getRandomWaitTime() {
		
		return new Random().nextInt((5 - 1) + 1) + 1;
	} //end of getRandomNumber
	

} //end of test
