package Queues;

public class QuieueClient {

	public static void main(String[] args) {
		QueueArrays queueArrays=new QueueArrays(5);
		queueArrays.enqueue(100);
		queueArrays.display();
		queueArrays.dequeue();
		queueArrays.enqueue(1000);
		queueArrays.enqueue(17);
		queueArrays.display();
		ArrayListQueue arraylistQueue=new ArrayListQueue();
		arraylistQueue.enqueue(24);
		arraylistQueue.enqueue(102);
		arraylistQueue.dequeue();
		arraylistQueue.enqueue(249);
		arraylistQueue.dequeue();
		arraylistQueue.display();
	}

}
