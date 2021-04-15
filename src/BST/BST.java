package BST;

import Video.Video;

public class BST {
	
	BSTNode root;
	
	
	public BST() {
		root = null;
	}

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}
	
	public void print() {
		inOrder(root);
	}  

	private void inOrder(BSTNode node) {
		if (node != null) {
			inOrder(node.getLeftChild());
			System.out.print(node.getElement() + " ");
			inOrder(node.getRightChild());
		} 
	}  
	
	public void insert(int numb, Object element) {
		
		BSTNode node = new BSTNode(numb, element);
		BSTNode current = root;
		BSTNode parent;
		
		if(root == null) {
			root = node;
			return;
		}
		
		while(true) {
            parent = current;
            
            if(numb < current.getId()) {
                current = current.getLeftChild();
                
                if(current == null) {
                    parent.setLeftChild(node);
                    return;
                }
            } else {
                current = current.getRightChild();
                
                if(current == null) {
                    parent.setRightChild(node);
                    return;
                }
            }
        }
	}

	public boolean searchVideo(int key) {
		
		BSTNode current = root;
		Video video;
		
		video = (Video) current.getElement();
		
		if(video == null || current == null) return false;
		
		while(video != null || current != null) {
			//System.out.println(current.getId());
			if(video.getId() == key) {
				return true;
			}
			
			else if(current.getId() > key) {
				current = current.getLeftChild();
				video = (Video) current.getElement();
			} 
			else {
				current = current.getRightChild();
				
				if(current == null) {
					return false;
				}
				video = (Video) current.getElement();
			}
		}
		return false;
	}
 
	
	public void remove(BSTNode node) {
		
	}
	
	
	
	
	/**
	 * TODO:
	 * 		Remove method
	 * 	
	 */
	
}
