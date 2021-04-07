package DLL;

public class DLL {
	
	private DNode header;
	private DNode trailer;
	private int size = 0;
	
	/**
	 * Constructor
	 */
	public DLL(){
		header = new DNode(null, null, null);
		trailer = new DNode(null, header, null);
		header.setNext(trailer);
	}

	/**
	 * Returns the header
	 * @return
	 */
	public DNode getHeader() {
		return header;
	}

	/**
	 * Sets the header
	 * @param header
	 */
	public void setHeader(DNode header) {
		this.header = header;
	}

	/**
	 * Returns trailer
	 * @return
	 */
	public DNode getTrailer() {
		return trailer;
	}

	/**
	 * Sets Trailer
	 * @param trailer
	 */
	public void setTrailer(DNode trailer) {
		this.trailer = trailer;
	}
	
	/**
	 * Prints DLL
	 */
	public void print() {
		DNode current = header.getNext();
		
		if(header.getNext() == null) {
			return;
		}
		while(current != trailer) {
			System.out.print(current.getElement() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
	
	/**
	 * Adds node to the beginning of DLL
	 * @param n
	 */
	public void addFirst(DNode n) {
        n.setPrev(header);
        n.setNext(header.getNext());
        header.getNext().setPrev(n);
        header.setNext(n);         
        size++;
	}
	
	/**
	 * Adds node to the end on DLL
	 * @param n
	 */
	public void addLast(DNode n) {
       n.setNext(trailer);
       n.setPrev(trailer.getPrev());
       trailer.getPrev().setNext(n);
       trailer.setPrev(n);
       size++;
	}
	
	/**
	 * Removes node n within DLL
	 * @param n
	 */
	public void remove(DNode n) {
		DNode prev = n.getPrev();
		DNode next = n.getNext();
		prev.setNext(next);
		next.setPrev(prev);
		size--;
		
	}
	/**
	 * Reverses the DLL
	 */
	public void reverse() {
		DNode head = header;
        header = trailer;
        trailer = head;
        DNode current = header;
		
		while(current != null) {
			head = current.getNext();
			current.setNext(current.getPrev());
			current.setPrev(trailer);
			current = current.getNext();
		}	
	}
	
	/**
	 * concatenates two DLists together
	 * @param L
	 * @param M
	 * @return
	 */
	public DLL concatenate(DLL L, DLL M) {
		
		if( L == null) {
			return M;
		}
		else if( M == null) {
			return L;
		}else {
			L.trailer.getPrev().setNext(M.header.getNext());
			M.header.getNext().setPrev(L.trailer.getPrev());
			L.trailer = M.trailer;
			L.size = L.size + M.size;
		}
		
		return L;
	}
	
	/**
	 * searches DLL to find if the given string is in SLL
	 * @param title
	 */
//	public boolean search(String title) {
//		
//	}
	
	/**
	 * return the index i of element x
	 * @param element
	 * @return 
	 */
//	public int findIndex(String element) {
//		
//	}
	
	/**
	 * Adds node at specified index
	 * @param index
	 * @param value
	 */
	public void addNodeAt(int index, Object value) {
		
	}
	
	/**
	 * removes node at specified index
	 * @param index
	 */
	public void removeNodeAt(int index) {
		
	}
	/**
	 * Need TODO:
	 * Add a method in DList to search whether it contains an element x  
	 * Add a method in DList to return the index i of element x  
	 * Add a method in DList to add a node at index i  
	 * Add a method in DList to remove the node at index i 
	 */

}
