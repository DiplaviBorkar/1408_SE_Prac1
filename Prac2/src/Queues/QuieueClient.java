package Queues;

public class QuieueClient {

	public static void main(String[] args) {
		Queue queueArrays=new QueueArrays(7);
		queueArrays.enqueue(100);
		queueArrays.display();
		queueArrays.dequeue();
		queueArrays.enqueue(1000);
		queueArrays.enqueue(17);
		queueArrays.display();
		
	}

}
