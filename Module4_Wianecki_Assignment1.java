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
		int custArrive;
		
		//variable for random customer wait time
		int custWait;
		
		//variable to hold count for each iteration of minute and customer
		int countLoop = 1;
                
                //variable to hold count for each iteration of minute and customer
		int countEnqueue = 0;
                
                //variable to hold count for each iteration of minute and customer
		int countDequeue = 0;
		
		//will hold time for customer arrival
		int custArriveTime = 0;
		
		//will hold time for customer wait
		int custLeaveTime = 0;
		
		//creates the queue for line
		Queue line = new Queue();
                
                custArrive = getRandomTime();
		
		custArriveTime = custArrive;
		
		//loop for 720 minute simulation / 12 hour day
		for(int time = 1; time <= maxTime; time++) {
			
			//if it is the time the customer should be arriving
			if(custArriveTime == time) {
				
				//add customer to queue
				line.enqueue(custID + countLoop);
				custID += countLoop;
                                countEnqueue += countLoop;
				
				//get random wait time for customers
				custWait = getRandomTime();
				custLeaveTime = custArriveTime + custWait;
				
			}
			
			//if it is the time the customer should be leaving
			if(custLeaveTime == time && time > 0) {
				
				//remove customer from queue
				line.dequeue();
                                countDequeue += countLoop;
                                
                                //get next customer arrival time
				custArrive = getRandomTime();
                                custArriveTime = custArrive + custLeaveTime;
				
			}
			
			totalTime = time;
			
		} //end of for loop
		
	System.out.println("Total time: " + totalTime);
        System.out.println("Number of customers in line: " + line.size());
        System.out.println("Number of total customers added to line: " + countEnqueue);
        System.out.println("Number of total customers removed from line: " + countDequeue);
		
	} //end of main
	
	public static int getRandomTime() {
		
		return new Random().nextInt((5 - 1) + 1) + 1;
		
	} //end of getRandomTime
	
} //end of test
