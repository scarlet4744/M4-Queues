import java.util.Random;

public class test {

	//will hold time for customer arrival
	//static int custArriveTime = 0;
			
	//will hold time for customer wait
	//static int custLeave = 0;
	
	public static void main(String[] args) throws Exception {
		
		//simulation time
		int maxTime = 15;
		
		//amount of time that has passed during simulation
		int totalTime = 0;
		
		//second time variable
		//int time = 1;
		
		//keep track of customers as they enter/leave queue
		int custID = 0;
		
		//gets random customer arrival time
		int custArrive = getRandomTime();
		
		
		
		//TODO: MOVE THIS TO AFTER THE CUSTOMER GETS ADDED TO QUEUE
		//gets random customer wait time
		int custWait;
		
		//variable to hold count for each iteration of minute and customer
		int count = 1;
		
		//will hold time for customer arrival
		int custArriveTime = 0;
		
		//will hold time for customer wait
		int custLeaveTime = 0;
		
		//creates the queue for line
		Queue line = new Queue();
		
		//System.out.println("time: " + totalTime + "\n");
		
		//System.out.println("Arrive time: " + custArrive + "\n");
		
		//System.out.println("Wait time: " + custWait + "\n");
		
		custArriveTime = custArrive;
		System.out.println("first cust arrive time: " + custArriveTime + "\n");
		
		//custLeaveTime = custArriveTime + custWait;
		//System.out.println("first cust leave time: " + custLeaveTime + "\n");
		
		System.out.println("-----------------------------------" + "\n");
		
		//loop for 720 minute simulation / 12 hour day
		//while(totalTime != maxTime) {
		for(int time = 1; time <= maxTime; time++) {
			
			System.out.println("minute: " + time + "\n");
			
			//if it is the time the customer should be arriving
			if(custArriveTime == time) {
				
				
				//add customer to queue
				System.out.println("custID count: " + (custID + count) + "\n");
				line.enqueue(custID + count);
				System.out.println("Number of customers in line after 1 join: " + line.size() + "\n");
				custID += count;
				
				//TODO: GET RANDOM WAIT TIME FOR CUSTOMERS
				custWait = getRandomTime();
				System.out.println("Wait time: " + custWait + "\n");
				custLeaveTime = custArriveTime + custWait;
				System.out.println("cust leave time: " + custLeaveTime + "\n");
				
				//get next customer arrival time
				custArriveTime += custArrive;
				System.out.println("next cust Arrive Time: " + custArriveTime + "\n");
			
				
			}
			
			if(custLeaveTime == time && time > 0) {
				
				line.dequeue();
				System.out.println("Number of customers in line after 1 leave: " + line.size() + "\n");
				
				//custLeaveTime = custArriveTime + custWait;
				//System.out.println("next cust leave time: " + custLeaveTime + "\n");
			}
			
			totalTime = time;
			
		} //end of for loop
		
		System.out.println("total time: " + totalTime);
		//System.out.println(line.toString());
        System.out.println("Number of customers in line: " + line.size());
		
		
	} //end of main
	
	public static int getRandomTime() {
		
		return new Random().nextInt((5 - 1) + 1) + 1;
	} //end of getRandomTime
	
} //end of test
