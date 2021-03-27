package SLL;


/**
 * This class hosts all methods associated to 
 * singly linked list
 * @author John W. Fore
 *
 */
public class SLL {
	
	private SNode head;
	
	/**
	 * Constructor
	 */
	public SLL() {
		head = null;
	}

	/**
	 * Returns the head of the SLL
	 * @return
	 */
	public SNode getHead() {
		return head;
	}

	/**
	 * Sets the head of the SLL
	 * @param head
	 */
	public void setHead(SNode head) {
		this.head = head;
	}
	
	/**
	 * Prints the SLL
	 */
	public void print(){
		
		SNode current = head;
	
		while(current != null) {
			System.out.print(current.getElement() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
	
	/**
	 * Adds a node to the SLL
	 * @param n
	 */
	public void add(SNode n) {

		if(head == null) {
			head = n;
		}
		else {
			SNode current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(n);
		}
		n.setNext(null);
	}
	
	/**
	 * Removes a node form the SLL
	 */
	public void remove() {
		
		SNode current = head;
		
		if(head.getNext() == null) {
			head = null;
		}
		if(head == null) {
			return;
		}
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		
	}
	
	/**
	 * Reverses the SLL
	 */
	public void reverse() {
		
		SNode current = head;
		SNode prev = null;
		SNode next = null;
		
		if (head == null) {
		      return;
		}
		while(current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}	
		head = prev;		
	}
	
	/**
	 * Returns the middle element of SLL
	 * @return
	 */
	public SNode middle() {
       if (head == null) {
    	   return null;
       }else {
    	   int length = 0;
    	   int middle;
    	   SNode current = head;
    	   
    	   //finding the length of the SLL
    	   while(current != null) {
    		   current = current.getNext();
    		   length++;
    	   }
    	   // if length is even
    	   if (length % 2 == 0) {
               middle = length / 2;
    	   }
    	   // if length is odd
    	   else {
               middle = (length + 1) / 2;
    	   }
    	   current = head;
    	   int i = 1;
    	   // iterates through SLL and sets current
    	   // equal to the middle
    	   while(i < middle) {
    		   current = current.getNext();
    		   i++;
    	   }
    	   return current;   
       }
	}
}
	
	/**
	 * Need TODO:
	 *  Add a method in SLL to search whether it contains an element x  
	 *  Add a method in SLL to return the index i of element x  
	 *  Add a method in SLL to add a node at index i
	 *  Add a method in SLL to remove the node at index i
	 */
	
	
	
	
	
	

