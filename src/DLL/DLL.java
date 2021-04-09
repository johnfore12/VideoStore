package DLL;

import SLL.SNode;
import Video.Video;

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
	 * searches DLL to find if the given string is in DLL
	 * @param title
	 */
	public boolean search(String title) {
		
		DNode current = header.getNext();
	       
		if(current.getElement() == null) {
			System.out.println("List is empty");
			return false;
		}
		while(current.getElement() != null) {
			if(current.getElement().toString().equalsIgnoreCase(title)) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	/**
	 * Searches DLL to find if the given string matches a Video
	 * @param title
	 * @return
	 */
	public boolean searchVideo(String title) {
		
		DNode current = header.getNext();
		
		while (current != null) {
			Video video;
			video = (Video) current.getElement();
            if(video == null) {
            	return false;
            }if(video.getTitle().equalsIgnoreCase(title)) {
            	return true;  
            }
            else {
            
            	current = current.getNext();
            }
        }
        return false;   
	}
	
	/**
	 * return the index i of element x
	 * @param element
	 * @return 
	 */
	public int findIndex(String element) {
		
		DNode current = header.getNext();
	    int count = 0;   
	
		while(current.getElement() != null) {
			if(current.getElement().toString().equalsIgnoreCase(element)) {
				return count;
			}
			current = current.getNext();
			count++;
		}
		return 9999;  //error
	}
	
	/**
	 * Adds node at specified index
	 * @param index
	 * @param value
	 */
	public void addNodeAt(int index, Object value) {
		
		DNode newNode = new DNode(value, null, null);
	
	    if (index == 0) {
	    	addFirst(newNode);
	    } else {
	        DNode node = header.getNext();
	        while (--index > 0) {
	            node = node.getNext();
	        }
	        newNode.setNext(node.getNext());
	        node.setNext(newNode);
	    }
	}
	
	/**
	 * removes node at specified index
	 * @param index
	 */
	public void removeNodeAt(int index) {
		
		DNode current = header.getNext();
		int size = size();

		System.out.println("SIZE: " + size);
		if(index<0 || index >= size) {
			System.out.println("ERROR: List index out of bounds");
		}
		if(index == 0) {
			header = header.getNext();
		}
		else {
			for(int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
	}
	
	/**
	 * returns the size of the DLL
	 * @return
	 */
	public int size() {
		DNode temp = header;
		
		while(temp.getElement() != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}
}
