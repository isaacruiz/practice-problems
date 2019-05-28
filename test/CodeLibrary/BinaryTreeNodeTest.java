/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeLibrary;

import junit.framework.TestCase;

/**
 *
 * @author Isaac
 */
public class BinaryTreeNodeTest extends TestCase {
    
    public BinaryTreeNodeTest(String testName) {
        super(testName);
    }

    /**
     * Test of addLeftChild and getLeft methods, of class BinaryTreeNode.
     */
    public void testAddLeftChild() {
        System.out.println("addLeftChild");
        BinaryTreeNode root = new BinaryTreeNode(6);
        BinaryTreeNode left = new BinaryTreeNode(7);
        assertNull(root.getLeft());
        
        root.addLeftChild(left);
        assertEquals(left, root.getLeft());
        
        BinaryTreeNode left2 = new BinaryTreeNode(8);
        root.addLeftChild(left2);
        assertEquals(left2, root.getLeft());
        assertEquals(left, left2.getLeft());
    }
    
    /**
     * Test of addRightChild and getRight methods, of class BinaryTreeNode.
     */
    public void testAddRightChild() {
        System.out.println("addRightChild");
        BinaryTreeNode root = new BinaryTreeNode(6);
        BinaryTreeNode right = new BinaryTreeNode(7);
        assertNull(root.getRight());
        
        root.addRightChild(right);
        assertEquals(right, root.getRight());
        
        BinaryTreeNode right2 = new BinaryTreeNode(8);
        root.addRightChild(right2);
        assertEquals(right2, root.getRight());
        assertEquals(right, right2.getRight());
    }

    /**
     * Test of getValue method, of class BinaryTreeNode.
     */
    public void testGetValue() {
        System.out.println("getValue");
        BinaryTreeNode instance = new BinaryTreeNode(10);
        int expResult = 10;
        int result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of height method, of class BinaryTreeNode.
     */
    public void testHeight() {
        System.out.println("height");
        BinaryTreeNode root = null;
        BinaryTreeNode[] nodes = new BinaryTreeNode[9];
        for(int i = 0; i < nodes.length; i++)
            nodes[i] = new BinaryTreeNode(i);
        assertEquals(-1, BinaryTreeNode.height(root));
        
        root = nodes[0];
        assertEquals(0, BinaryTreeNode.height(root));
        
        root.addLeftChild(nodes[1]).addLeftChild(nodes[3]);
        assertEquals(2, BinaryTreeNode.height(root));
        
        nodes[3].addRightChild(nodes[5]).addLeftChild(nodes[7]);
        assertEquals(4, BinaryTreeNode.height(root));
        nodes[5].addRightChild(nodes[8]);
        assertEquals(4, BinaryTreeNode.height(root));
        
        root.addRightChild(nodes[2]).addRightChild(nodes[4]).addLeftChild(nodes[8]);
        assertEquals(4, BinaryTreeNode.height(root));
        
        assertEquals(1, BinaryTreeNode.height(nodes[4]));
    }
    
}
