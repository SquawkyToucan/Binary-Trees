package stuff;

public class BinaryTree {
	// constructs and searches through binary trees

	Node startNode;

	BinaryTree(Node n) {
		startNode = n;
	}

	void addNode(Node newNode) {
		// search through the nodes ArrayList to find a place for it
		System.out.println(startNode);
		Node currentNode = startNode;
		boolean hasFoundSpot = false;
		while (!hasFoundSpot) {
			if (currentNode.hasChildren()) {
				if (newNode.getData() > currentNode.getData()) {
					// go to the right
					Node temp = currentNode.getRightNode();
					currentNode = temp;
				} else if (newNode.getData() == currentNode.getData()) {
					// no idea
				} else {
					// go to the left
					Node temp = currentNode.getLeftNode();
					currentNode = temp;
				}
			} else {
				// It has no children or one child.
				// Check for the one child -- if it is further in the direction, add it below
				// the child, if it isn't, add it as a child of the current term
				if (currentNode.getLeftNode() != null) {
					// The left node exists
					if (currentNode.getLeftNode().getData() > newNode.getData()) {
						currentNode.getLeftNode().setLeftNode(newNode);
					} else {
						currentNode.setRightNode(newNode);
					}
				} else if (currentNode.getRightNode() != null) {
					// The right node exists
					if (currentNode.getRightNode().getData() <= newNode.getData()) {
						currentNode.getRightNode().setRightNode(newNode);
					} else {
						currentNode.setLeftNode(newNode);
					}
				} else {
					// No children
					if (currentNode.getData() >= newNode.getData()) {
						// Add it to the left
						currentNode.setLeftNode(newNode);
					} else {
						currentNode.setRightNode(newNode);
					}
				}
				hasFoundSpot = true;
			}
		}
	}

	boolean containsNode(int i) {
		Node currentNode = startNode;
		boolean hasFoundSpot = false;
		while (!hasFoundSpot) {
			if (currentNode.hasAnyChildren()) {
				System.out.println(i);
				System.out.println(currentNode.getData());
				try {
					if (i == currentNode.getData() || currentNode.getRightNode().getData() == i || currentNode.getLeftNode().getData() == i) {
						return true;
					} else if (i > currentNode.getData()) {
						// go to the right
						System.out.println("was greater");
						Node temp = currentNode.getRightNode();
						currentNode = temp;
					} else {
						System.out.println("was less");
						// go to the left
						Node temp = currentNode.getLeftNode();
						currentNode = temp;
					}
					System.out.println("starting to look again");
				} catch (NullPointerException e) {
					if (i > currentNode.getData()) {
						// go to the right
						System.out.println("was greater");
						Node temp = currentNode.getRightNode();
						currentNode = temp;
					} else {
						System.out.println("was less");
						// go to the left
						Node temp = currentNode.getLeftNode();
						currentNode = temp;
					}
				}
			} else {
				System.out.println("spot found");
				hasFoundSpot = true;
			}
			System.out.println("actually starting");
		}
		return false;
	}
}