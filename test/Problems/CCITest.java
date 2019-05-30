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
     * Test of deleteMiddleNode method of class CCI
     */
    public void testDeleteMiddleNode(){
        LinkedListNode[] nodes = new LinkedListNode[10];
        LinkedListNode[] expected = new LinkedListNode[10];
        nodes[0] = new LinkedListNode(0);
        expected[0] = new LinkedListNode(0);
        
        for(int i = 1; i < nodes.length; i++){
            nodes[i] = new LinkedListNode(i, null, nodes[i-1]);
            if(i != 3) expected[i] = new LinkedListNode(i, null, expected[i-1]);
        }
        cci.deleteMiddleNode(nodes[3]);
        testLists(expected[0], nodes[0]);
    }
    
    /**
     * Test of partition method of class CCI
     */
    public void testPartition(){
        LinkedListNode[] n = new LinkedListNode[7];
        n[0] = new LinkedListNode(3);
        n[1] = new LinkedListNode(8, null, n[0]);
        n[2] = new LinkedListNode(1, null, n[1]);
        //n[3] = new LinkedListNode(5, null, n[2]);
        //n[4] = new LinkedListNode(10, null, n[3]);
        //n[5] = new LinkedListNode(2, null, n[4]);
        //n[6] = new LinkedListNode(1, null, n[5]);
        cci.partition(n[0], 4);
    }
    
    /**
     * Test of sumListsRecursive method
     */
    public void testSumListsRecursive(){
        LinkedListNode[] list1 = new LinkedListNode[3];
        list1[0] = new LinkedListNode(1);
        list1[1] = new LinkedListNode(2, null, list1[0]);
        list1[2] = new LinkedListNode(3, null, list1[1]);
        assertEquals("1->2->3", list1[0].printForward());
        
        LinkedListNode[] list2 = new LinkedListNode[3];
        list2[0] = new LinkedListNode(4);
        list2[1] = new LinkedListNode(5, null, list2[0]);
        list2[2] = new LinkedListNode(6, null, list2[1]);
        assertEquals("4->5->6", list2[0].printForward());
        
        LinkedListNode[] list3 = new LinkedListNode[2];
        list3[0] = new LinkedListNode(6);
        list3[1] = new LinkedListNode(4, null, list3[0]);
        assertEquals("6->4", list3[0].printForward());
        
        LinkedListNode[] list4 = new LinkedListNode[3];
        list4[0] = new LinkedListNode(9);
        list4[1] = new LinkedListNode(9, null, list4[0]);
        list4[2] = new LinkedListNode(9, null, list4[1]);
        assertEquals("9->9->9", list4[0].printForward());
        
        LinkedListNode list5 = new LinkedListNode(1);
        assertEquals("1", list5.printForward());
        
        assertEquals("5->7->9", cci.sumLists(list1[0], list2[0]).printForward());
        assertEquals("0->0->7", cci.sumLists(list2[0], list3[0]).printForward());
        assertEquals("0->0->7", cci.sumLists(list3[0], list2[0]).printForward());
        assertEquals("0->0->7", cci.sumLists(list3[0], list2[0]).printForward());
        assertEquals("0->0->0->1", cci.sumLists(list4[0], list5).printForward());
    }
    /**
     * Test of tripleStep method, of class CCI.
     */
    public void testTripleStep() {

    }
    
}
