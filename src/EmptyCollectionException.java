/**
 * This class represents a situation in which a collection
 * is empty.
 * @author chessicanation
 * CS215
 * Assignment 2.3
 *
 */

public class EmptyCollectionException extends RuntimeException
{
	/**
	 * Sets up the exception with an appropriate message.
	 * @param collection
	 */
	public EmptyCollectionException(String collection)
	{
		super("The " + collection + " is empty.");

	}//end preferred constructor
	
}//end class
