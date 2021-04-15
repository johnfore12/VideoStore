package BST;

public class BSTNode {
	
	int id;
	Object element;
	BSTNode leftChild;
	BSTNode rightChild;
	
	public BSTNode(int id, Object element) {
		this.id = id;
		this.element = element;
		this.leftChild = null;
		this.rightChild = null;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public BSTNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BSTNode leftChild) {
		this.leftChild = leftChild;
	}

	public BSTNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BSTNode rightChild) {
		this.rightChild = rightChild;
	}
	
	

}
