package Queues;

public class QueueArrays implements Queue{
	int size,i=0;
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
			
			if(front==-1){
				front=front+1;
			}
		
				rear=rear+1;
			this.QArray[rear]=value;
			System.out.println("Element enqueued"+QArray[rear]+"\n");
	}
	
	
	
	
	public void dequeue(){
		
		System.out.println("Element dequeued"+QArray[front]+"\n");
		front=front+1;
			
	}
	
	public void display(){
		if((front==-1)||(rear==-1)){
			System.out.println("Queue Empty\n");
		}
		System.out.println("Queue Elements are:");
		for(i=front; i<=rear; i++){
			System.out.println("\t"+QArray[i]);
		}
	}
}
