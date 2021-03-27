package SLL;

/**
 * This class hosts all methods associated to 
 * Node
 * @author John W. Fore
 *
 */
public class SNode {
	
	private Object element;
	private SNode next;
	
	/**
	 * Creates a Node with the parameters
	 * @param element
	 * @param next
	 */
	public SNode(Object element, SNode next) {
		this.element = element;
		this.next = next;
	}
	
	/**
	 * Returns the element of a Node
	 * @return
	 */
	public Object getElement() {
		return element;
	}
	
	/**
	 * Sets the element of a Node
	 * @param element
	 */
	public void setElement(Object element) {
		this.element = element;
	}
	
	/**
	 * Returns the next Node in SLL
	 * @return
	 */
	public SNode getNext() {
		return next;
	}
	
	/**
	 * Sets the next Node
	 * @param next
	 */
	public void setNext(SNode next) {
		this.next = next;
	}
}
