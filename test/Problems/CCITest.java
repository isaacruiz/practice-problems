/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems;

import CtCILibrary.LinkedListNode;
import junit.framework.TestCase;
import practice.CCI;

/**
 *
 * @author Isaac
 */
public class CCITest extends TestCase {
    CCI cci;
    
    public CCITest(String testName) {
        super(testName);
        cci = new CCI();
    }

    /**
     * Test of isUnique method, of class CCI.
     */
    public void testIsUnique() {

    }

    /**
     * Test of checkPermutation method, of class CCI.
     */
    public void testCheckPermutation() {

    }

    /**
     * Test of URLify method, of class CCI.
     */
    public void testURLify() {

    }

    /**
     * Test of palindromePermutation method, of class CCI.
     */
    public void testPalindromePermutation() {

    }

    /**
     * Test of toggle method, of class CCI.
     */
    public void testToggle() {

    }

    /**
     * Test of oneAway method, of class CCI.
     */
    public void testOneAway() {

    }

    /**
     * Test of stringCompression method, of class CCI.
     */
    public void testStringCompression() {

    }

    /**
     * Test of rotateMatrix method, of class CCI.
     */
    public void testRotateMatrix() {

    }

    /**
     * Test of removeDups method, of class CCI.
     */
    public void testRemoveDups() {
        LinkedListNode[] list = new LinkedListNode[4];
        list[0] = new LinkedListNode(1);
        list[1] = new LinkedListNode(3, list[0], null);
        list[2] = new LinkedListNode(3, list[1], null);
        list[3] = new LinkedListNode(1, list[2], null);
        
        LinkedListNode expected = new LinkedListNode(1);
        LinkedListNode e2 = new LinkedListNode(3, expected, null);
        testLists(expected, list[0]);
        
        LinkedListNode[] list2 = new LinkedListNode[2];
        list2[0] = new LinkedListNode(1);
        list2[1] = new LinkedListNode(1, list2[0], null);
        
        LinkedListNode expected2 = new LinkedListNode(1);
        testLists(expected2, list2[0]);
        
    }
    private void testLists(LinkedListNode l1, LinkedListNode l2){
        while(l1 != null){
            assertEquals(l1.data, l2.data);
            l1 = l1.next; l2 = l2.next;
        }
        assertNull(l2);
    }
    /**
     * Test of getKthToLast method, of class CCI.
     */
    public void testGetKthToLast(){
        LinkedListNode[] nodes = new LinkedListNode[10];
        nodes[0] = new LinkedListNode(0);
        for(int i = 1; i < nodes.length; i++){
            nodes[i] = new LinkedListNode(i, null, nodes[i-1]);
        }
        assertEquals(nodes[0], cci.getKthToLast(nodes[0], 10));
        assertEquals(nodes[9], cci.getKthToLast(nodes[0], 1));
        assertEquals(nodes[8], cci.getKthToLast(nodes[0], 2));
        assertEquals(nodes[4], cci.getKthToLast(nodes[0], 6));
        assertNull(cci.getKthToLast(nodes[0], 11));
        assertNull(cci.getKthToLast(nodes[0], 0));
    }
    
    /**
     * Test of tripleStep method, of class CCI.
     */
    public void testTripleStep() {

    }
    
}
