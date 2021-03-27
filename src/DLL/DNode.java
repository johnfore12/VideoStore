package DLL;

public class DNode {
	
	private Object element;
	private DNode next;
	private DNode prev;
	
	/**
	 * Constructor
	 * @param element
	 * @param next
	 * @param prev
	 */
	public DNode(Object element, DNode next, DNode prev) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}

	/**
	 * Returns the element of Node
	 * @return
	 */
	public Object getElement() {
		return element;
	}

	/**
	 * Sets element of node
	 * @param element
	 */
	public void setElement(Object element) {
		this.element = element;
	}

	/**
	 * Returns next Node
	 * @return
	 */
	public DNode getNext() {
		return next;
	}

	/**
	 * Sets next Node
	 * @param next
	 */
	public void setNext(DNode next) {
		this.next = next;
	}

	/**
	 * Returns previous Node
	 * @return
	 */
	public DNode getPrev() {
		return prev;
	}

	/**
	 * Sets previous Node
	 * @param prev
	 */
	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	
}
