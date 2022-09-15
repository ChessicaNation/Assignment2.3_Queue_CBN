/**
 * This class represents a queue that can have items added to and removed from it.
 * @author chessicanation
 * CS215
 * Assignment 2.3
 *
 */
public class Queue<T> 

{
	private GenericNode<T> node = new GenericNode<T>();
	private GenericLinkedList<T> list;
	
	/**
	 * Empty-argument constructor to create an empty linkedlist
	 * to hold the queue
	 */
	public Queue()
	{
		list = new GenericLinkedList<T>();
		
	}//end empty-argument constructor
	
	/**
	 * This method adds the item passed to it to the end of the queue
	 * @param item
	 */
	public void enqueue(T item) 
	{
		if(list.isEmpty())
		{
			node.setData(item);
			list.addNode(node);
			
			System.out.println(item + " is now in line.");
			System.out.println();
			this.displayQueue();
		}//end if
		else
		{
			GenericNode<T> newNode = new GenericNode<T>();
			newNode.setData(item);
			list.addNode(newNode);
			
			System.out.println(item + " is now in line.");
			System.out.println();
			this.displayQueue();
		}//end else
		
	}//end enqueue
	
	/**
	 * This method removes the item at the front of the queue
	 * @return
	 * @throws EmptyCollectionException
	 */
	public T dequeue() throws EmptyCollectionException 
	{
		if(list.isEmpty())
			throw new EmptyCollectionException("queue");
		
		T removed = list.removeNode();
		
		this.displayQueue();
		
		return removed;		
	
	}//end dequeue

	/**
	 * This method traverses the linkedlist and prints each item in the queue
	 */
	@SuppressWarnings("unchecked")
	public void displayQueue()
	{
		GenericNode<T> tempNode = list.getList();
		
		System.out.println("****** Current Queue ******");
		
		do 
		{
			System.out.println(tempNode.getData());
			tempNode = tempNode.getNextNode();
		} while (tempNode!=null);
		
		System.out.println("***************************");
		System.out.println();
	}//end displayQueue	
	
}//end class
