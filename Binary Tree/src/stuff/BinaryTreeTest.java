package stuff;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	void test() {
		Node start = new Node(12);
		BinaryTree binaryTree = new BinaryTree(start);
		binaryTree.addNode(new Node(7));
		binaryTree.addNode(new Node(13));
		binaryTree.addNode(new Node(11));
		binaryTree.addNode(new Node(15));
		// problem is that it's adding on the next level when it is possible to add on the current level
		assertTrue(binaryTree.containsNode(15));
		assertFalse(binaryTree.containsNode(14));
	}

}
