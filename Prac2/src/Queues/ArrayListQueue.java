package Queues;
import java.util.ArrayList; 
public class ArrayListQueue implements Queue{
	ArrayList array=new ArrayList();

	public void enqueue(int value){
		array.add(value);
		System.out.println(array);
	}
	
	 public void dequeue() {
		  if (!isEmpty())
		  System.out.println(array.remove(0)); 
		
		
		 }

		 public boolean isEmpty() {
		  return (array.size() == 0);
		 }

		 public void display(){
			 System.out.println(array);
		 }
	
}
