/**
 * This class contains a main method to test the queue class.
 * @author chessicanation
 * CS215
 * Assignment 2.3
 *
 */
public class Application 
{

	public static void main(String[] args) 
	{
	
		Queue<String> myQueue = new Queue<String>();		
		
		myQueue.enqueue("Bill");
		myQueue.enqueue("Alice");
		myQueue.enqueue("Bob");
		myQueue.dequeue();
		myQueue.enqueue("Jane");
		myQueue.enqueue("Hamad");
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.enqueue("Jim");
		myQueue.dequeue();
		myQueue.dequeue();

	}//end main

}//end class
