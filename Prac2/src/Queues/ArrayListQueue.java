package Queues;
import java.util.ArrayList; 
public class ArrayListQueue {
	ArrayList array=new ArrayList();

	public void enqueue(int value){
		array.add(value);
		System.out.println(array);
	}
	
	 public int dequeue() {
		  if (!isEmpty())
		   return (int) array.remove(0);
		return 0;
		
		 }

		 public boolean isEmpty() {
		  return (array.size() == 0);
		 }

		 public void display(){
			 System.out.println(array);
		 }
	
}