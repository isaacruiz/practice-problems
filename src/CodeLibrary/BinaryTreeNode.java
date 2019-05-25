/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeLibrary;

/**
 * Represents a node in an unsorted binary tree
 * @author Isaac
 */
public class BinaryTreeNode {
    /**
     * integer value of the node
     */
    int data;
    
    /**
     * left child node
     */
    BinaryTreeNode left;
    
    /**
     * right child node
     */
    BinaryTreeNode right;
    
    /**
     * Creates a new node
     * @param {@link BinaryTreeNode#data}
     */
    public BinaryTreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
    
    /**
     * Adds node as left child of given node
     * <p>
     * If a subtree already exists in the left child position, the subtree
     * becomes the left child of the added node
     * </p>
     * @param {@link BinaryTreeNode}
     * @return {@link BinaryTreeNode} reference to inserted node
     */
    public BinaryTreeNode addLeftChild(BinaryTreeNode node){
        if(this.left != null){
            node.addLeftChild(this.left);
        }
        this.left = node;
        return node;
    }
    
/**
     * Adds node as right child of given node
     * <p>
     * If a subtree already exists in the right child position, the subtree
     * becomes the right child of the added node
     * </p>
     * @param {@link BinaryTreeNode}
     * @return {@link BinaryTreeNode} reference to inserted node
     */
    public BinaryTreeNode addRightChild(BinaryTreeNode node){
        if(this.right != null){
            node.addRightChild(this.right);
        }
        this.right = node;
        return node;
    }
    /**
     * Gets left child
     * @return {@link BinaryTreeNode}
     */
    public BinaryTreeNode getLeft(){
        return this.left;
    }
    
    /**
     * Gets right child
     * @return {@link BinaryTreeNode}
     */
    public BinaryTreeNode getRight(){
        return this.right;
    }
    
    /**
     * Gets value of node
     * @return {@link BinaryTreeNode#data}
     */
    public int getValue(){
        return this.data;
    }
    
    /**
     * Calculates the height of a tree from given root
     * @param {@link BinaryTreeNode}
     * @return int height of subtree from node parameter
     */
    public static int height(BinaryTreeNode root){
        if(root == null)
            return -1;
        int height_left = height(root.getLeft());
        int height_right = height(root.getRight());
        return height_left > height_right ? 1 + height_left : 1 + height_right;
    }
}
