package Treee.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Imple {
    static class Node {
        int key;
        Node left, right;
    
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    
    static class BinaryTree {
        Node root;
    
        public BinaryTree() {
            root = null;
        }
    
        void inorderTraversal(Node node) {
            if (node != null) {
                inorderTraversal(node.left);
                System.out.print(node.key + " ");
                inorderTraversal(node.right);
            }
        }
    
        void preorderTraversal(Node node) {
            if (node != null) {
                System.out.print(node.key + " ");
                preorderTraversal(node.left);
                preorderTraversal(node.right);
            }
        }
    
        void postorderTraversal(Node node) {
            if (node != null) {
                postorderTraversal(node.left);
                postorderTraversal(node.right);
                System.out.print(node.key + " ");
            }
        }
        // Method to perform level order traversal
        void levelOrderTraversal(Node root) {
            if (root == null)
                return;
    
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
    
            while (!queue.isEmpty()) {
                Node tempNode = queue.poll();
                System.out.print(tempNode.key + " ");
    
                if (tempNode.left != null)
                    queue.add(tempNode.left);
    
                if (tempNode.right != null)
                    queue.add(tempNode.right);
            }
        }
    }
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    
        System.out.println("Inorder traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPreorder traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal(tree.root);
        System.out.println("\nLevel order traversal:");
        tree.levelOrderTraversal(tree.root);
    }
}
