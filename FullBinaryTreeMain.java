package binarytree;

public class FullBinaryTreeMain {
	    public static void main(String[] args) {
	    	FullBinaryTree tree = new FullBinaryTree();
	        tree.insert(1);
	        tree.insert(2);
	        tree.insert(3);
	        tree.insert(4);
	        tree.insert(5);
	        tree.insert(6);
	        tree.insert(7);

	        tree.printInorder();
	    }
	}