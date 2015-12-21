package Queues;

public class QueueArrays {
	int size,i;
	int front,rear;
	int QArray[];
	
	public QueueArrays(int size){
		this.size=size;
		this.QArray=new int[size];
		this.front=this.rear=-1;
	}
	
	public boolean IsFull(){
		if(rear==(size-1))
		return true;
		else
			return false;
	}
	
	public void enqueue(int value){
		
		if(IsFull()==true){
			System.out.println("The queue is full");
		}
		else
			
			if(front==-1){
				front=front+1;
			
			this.QArray[rear+1]=value;
			System.out.println("Element enqueued"+QArray[rear+1]);
	}
	
	}
	
	
	public void dequeue(){
		
		System.out.println("Element dequeued"+QArray[front]);
		front=front+1;
			
	}
	
	public void display(){
		System.out.println("Queue Elements are:");
		for(i=front;i<rear;i++){
			System.out.println("\n"+QArray[i]);
		}
	}
}
