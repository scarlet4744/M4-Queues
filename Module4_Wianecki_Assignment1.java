import java.util.Random;

public class Module4_Wianecki_Assignment1 {
	
	public static void main(String[] args) throws Exception {
		
		//simulation time
		int maxTime = 720;
		
		//amount of time that has passed during simulation
		int totalTime = 0;
		
		//keep track of customers as they enter/leave queue
		int custID = 0;
		
		//gets random customer arrival time
		int custArrive = getRandomTime();
		
		//variable for random customer wait time
		int custWait;
		
		//variable to hold count for each iteration of minute and customer
		int count = 1;
		
		//will hold time for customer arrival
		int custArriveTime = 0;
		
		//will hold time for customer wait
		int custLeaveTime = 0;
		
		//creates the queue for line
		Queue line = new Queue();
		
		custArriveTime = custArrive;
		
		//loop for 720 minute simulation / 12 hour day
		for(int time = 1; time <= maxTime; time++) {
			
			//if it is the time the customer should be arriving
			if(custArriveTime == time) {
				
				//add customer to queue
				line.enqueue(custID + count);
				custID += count;
				
				//get random wait time for customers
				custWait = getRandomTime();
				custLeaveTime = custArriveTime + custWait;
				
				//get next customer arrival time
				custArriveTime += custArrive;
				
			}
			
			//if it is the time the customer should be leaving
			if(custLeaveTime == time && time > 0) {
				
				//remove customer from queue
				line.dequeue();
				
			}
			
			totalTime = time;
			
		} //end of for loop
		
		System.out.println("total time: " + totalTime);
        System.out.println("Number of customers in line: " + line.size());
		
	} //end of main
	
	public static int getRandomTime() {
		
		return new Random().nextInt((5 - 1) + 1) + 1;
		
	} //end of getRandomTime
	
} //end of test
