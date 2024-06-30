package binarytree;

public class FullBinaryTree {

	    TreeNode root;

	    // Constructor
	    public FullBinaryTree() {
	        root = null;
	    }

	    // Function to insert a node in the tree
	    public void insert(int val) {
	        root = insertRecursive(root, val);
	    }

	    // Recursive function to insert nodes in a full binary tree
	    private TreeNode insertRecursive(TreeNode root, int val) {
	        if (root == null) {
	            root = new TreeNode(val);
	            return root;
	        }

	        if (root.left == null) {
	            root.left = insertRecursive(root.left, val);
	        } else if (root.right == null) {
	            root.right = insertRecursive(root.right, val);
	        } else {
	            // Both left and right children are present, so recursively insert into left subtree
	            root.left = insertRecursive(root.left, val);
	        }
	        return root;
	    }

	    // Function to print the tree in inorder traversal
	    public void printInorder() {
	        System.out.print("Inorder traversal of binary tree: ");
	        printInorderRecursive(root);
	        System.out.println();
	    }

	    // Recursive function to perform inorder traversal
	    private void printInorderRecursive(TreeNode root) {
	        if (root != null) {
	            printInorderRecursive(root.left);
	            System.out.print(root.val + " ");
	            printInorderRecursive(root.right);
	        }
	    }
	}

