package Queues;
import java.util.ArrayList; 
public class ArrayListQueue implements Queue{
	ArrayList array=new ArrayList();

	public void enqueue(int value){
		array.add(value);
		System.out.println("Enqueued element"+array+"\n");
	}
	
	 public void dequeue() {
		  if (!isEmpty())
		  System.out.println("Dequeued element"+array.remove(0)+"\n"); 
		
		
		 }

		 public boolean isEmpty() {
		  return (array.size() == 0);
		 }

		 public void display(){
			 System.out.println("Array Elemnts:");
			 System.out.println(array);
		 }
	
}
