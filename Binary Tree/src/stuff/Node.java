package stuff;

public class Node {
	Node left;
	Node right;
	int data;
	Node(int data) {
		this.data = data;
	}
	// Getters and setters
	int getData() {
		return data;
	}
	void setData(int newData) {
		data = newData;
	}
	Node getLeftNode() {
		return left;
	}
	void setLeftNode(Node newLeft) {
		left = newLeft;
	}
	Node getRightNode() {
		return right;
	}
	void setRightNode(Node newRight) {
		right = newRight;
	}
	boolean hasChildren() throws NullPointerException {
		try {
			if(left != null && right != null) {
				return true;
			}
		}
		catch(NullPointerException e) {
			return false;
		}
		return false;
	}
	boolean hasAnyChildren() {
		if(left != null || right != null) {
			return true;
		}
		else {
			return false;
		}
	}
}
