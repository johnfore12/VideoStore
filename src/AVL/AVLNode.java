package AVL;

public class AVLNode {
	
	Object element;
	AVLNode leftChild;
	AVLNode rightChild;
	int height;
	
	public AVLNode (Object element, AVLNode leftChild, AVLNode rightChild) {
		this.element = element;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public Object getElement() {
		return element;
	}
	
	public void setElement(Object element) {
		this.element = element;
	}
	
	public AVLNode getLeftChild() {
		return leftChild;
	}
	
	public void setLeftChild(AVLNode leftChild) {
		this.leftChild = leftChild;
	}
	
	public AVLNode getRightChild() {
		return rightChild;
	}
	
	public void setRightChild(AVLNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

}
