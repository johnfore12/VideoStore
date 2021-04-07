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
	
	/**
	 * searches SLL to find if the given string is in SLL
	 * @param title
	 */
	public boolean search(String title) {
		
	        SNode current = head;  //Initialize current
	       
	        while (current != null) {
	            if (current.getElement().toString().equalsIgnoreCase(title)) {
	                  return true;    //data found
	            }else {
	            	current = current.getNext();
	            }
	        }
	        return false;    //data not found
	    
	}
	
	/**
	 * return the index i of element x
	 * @param element
	 * @return 
	 */
	public int findIndex(String element) {
		
		int i = 0;
        SNode current = head;  //Initialize current
        
        while (current != null) {
            if (current.getElement().toString().equalsIgnoreCase(element)) {
                  return i;    //data found
            }else {
	            current = current.getNext();
	            i++;
            }
        }
        
        return 9999; //error
	}
	
	/**
	 * Adds node at specified index
	 * @param index
	 * @param value
	 */
	public void addNodeAt(int index, Object value) {
		SNode newNode = new SNode(value, null);
		 
	    // insert as the new head?
	    if (index == 0) {
	        // The 1st case.
	        newNode.setNext(head);
	        head = newNode;
	    } else {
	        // The 2nd case.
	        // start from the head:
	        SNode node = head;
	        // find position just before the expected one:
	        while (--index > 0) {
	            node = node.getNext();
	        }
	        // insert the new node:
	        newNode.setNext(node.getNext());
	        node.setNext(newNode);
	    }
	}
	
	/**
	 * removes node at specified index
	 * @param index
	 */
	public void removeNodeAt(int index) {
		
		SNode temp = head;
		SNode current = head;
		int size = 0;
		
		while(temp != null) {
			size++;
			temp = temp.getNext();
		}
		
		if(index<0 || index >= size) {
			System.out.println("ERROR: List index out of bounds");
		}
		if(index == 0) {
			head = head.getNext();
		}
		else {
			for(int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
		
	}
}