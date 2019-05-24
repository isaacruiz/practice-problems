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
     * @param {@link BinaryTreeNode}
     * @return false if there already exists a node in left child
     */
    public boolean addLeftChild(BinaryTreeNode node){
        if(this.left != null) return false;
        this.left = node;
        return true;
    }
    
    /**
     * Adds node as left child of given node
     * @param {@link BinaryTreeNode}
     * @return false if there already exists a node in left child
     */
    public boolean addRightChild(BinaryTreeNode node){
        if(this.right != null) return false;
        this.right = node;
        return true;
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
}
