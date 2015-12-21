package Queues;

public class QuieueClient {

	public static void main(String[] args) {
		QueueArrays queueArrays=new QueueArrays(5);
		queueArrays.enqueue(100);
		queueArrays.dequeue();
		queueArrays.enqueue(1000);
		queueArrays.display();
	}

}
