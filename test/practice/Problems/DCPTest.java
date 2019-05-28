/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Problems.DCP;
import CodeLibrary.*;

/**
 *
 * @author Isaac
 */
public class DCPTest {
    DCP dcp;
    public DCPTest() {
        dcp = new DCP();
    }
    /**
     * Test of Problem1 method, of class DCP.
     */
    @Test
    public void testProblem1() {
        System.out.println("Problem1");
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,0,0,6};
        int[] nums3 = {5};
        assertEquals(dcp.Problem1A(nums1, 5), true);
        assertEquals(dcp.Problem1B(nums1, 5), true);
        assertEquals(dcp.Problem1A(nums2, 7), true);
        assertEquals(dcp.Problem1B(nums2, 7), true);
        assertEquals(dcp.Problem1A(nums3, 5), false);
        assertEquals(dcp.Problem1B(nums3, 5), false);
    }

    /**
     * Test of Problem2 method, of class DCP.
     */
    @Test
    public void testProblem2() {
        System.out.println("Problem2");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] res1 = {120, 60, 40, 30, 24};
        int[] nums2 = {5, 6, 7, 9};
        int[] res2 = {378, 315, 270, 210};
        int[] nums3 = {12, 3, 0, 1};
        int[] res3 = {0, 0, 36, 0};
        assertArrayEquals(dcp.Problem2A(nums1), res1);
        assertArrayEquals(dcp.Problem2B(nums1), res1);
        assertArrayEquals(dcp.Problem2A(nums2), res2);
        assertArrayEquals(dcp.Problem2B(nums2), res2);
        assertArrayEquals(dcp.Problem2A(nums3), res3);
        assertArrayEquals(dcp.Problem2B(nums3), res3);        
    }

    /**
     * Test of Problem102 method, of class DCP.
     */
    @Test
    public void testProblem102() {
        System.out.println("Problem102");
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        int k = 3;
        expected.add(1);
        expected.add(2);
        assertEquals(dcp.Problem102(nums, k), expected);
        expected.clear();
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(dcp.Problem102(nums, 12), expected);
        nums.clear();
        expected.clear();
        nums.add(0);
        nums.add(0);
        nums.add(0);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(2);
        expected.add(2);
        expected.add(2);
        assertEquals(dcp.Problem102(nums, 6), expected);
    }

    /**
     * Test of Problem103 method, of class DCP.
     */
    @Test
    public void testProblem103() {
        System.out.println("Problem103");
        char[] chars = {'e', 'l', 'o'};
        assertEquals(dcp.Problem103("Hello sir", chars), "ello");
        
        chars = new char[]{'o', 'l', 'e'};
        assertEquals(dcp.Problem103("Hello sir", chars), "ello");
        
        chars = new char[]{'H', 'l', 'r'};
        assertEquals(dcp.Problem103("Hello sir", chars), "Hello sir");
        
        chars = new char[]{'r'};
        assertEquals(dcp.Problem103("Hello sir", chars), "r");
        
        chars = new char[]{'e', 'b'};
        assertEquals(dcp.Problem103("absdieslbde", chars), "bde");
        assertNull(dcp.Problem103("ice cream", chars));
    }

    /**
     * Test of Problem104 method, of class DCP.
     */
    @Test
    public void testProblem104() {
        System.out.println("Problem104");
        LinkedList<Character> evenPalindrome = new LinkedList<>();
        evenPalindrome.add('g');
        evenPalindrome.add('s');
        evenPalindrome.add('b');
        evenPalindrome.add('a');
        evenPalindrome.add('a');
        evenPalindrome.add('b');
        evenPalindrome.add('s');
        evenPalindrome.add('g');
        
        LinkedList<Character> oddPalindrome = new LinkedList<>();
        oddPalindrome.add('g');
        oddPalindrome.add('s');
        oddPalindrome.add('b');
        oddPalindrome.add('a');
        oddPalindrome.add('b');
        oddPalindrome.add('s');
        oddPalindrome.add('g');
        
        assertTrue(dcp.Problem104A(evenPalindrome));
        assertTrue(dcp.Problem104B(evenPalindrome));
        assertTrue(dcp.Problem104A(oddPalindrome));
        assertTrue(dcp.Problem104B(oddPalindrome));
        
        oddPalindrome.removeLast();
        assertFalse(dcp.Problem104A(oddPalindrome));
        assertFalse(dcp.Problem104B(oddPalindrome));
        
        evenPalindrome.removeFirst();
        assertFalse(dcp.Problem104A(evenPalindrome));
        assertFalse(dcp.Problem104B(evenPalindrome));
    }
    /**
     * Test of Problem106 method of class DCP
     */
    @Test
    public void testProblem106() {
        int[] case1 = {2, 0, 1, 0};
        int[] case2 = {1, 1, 0, 1};
        int[] case3 = {5, 2, 0, 1};
        int[] case4 = {0};
        int[] case5 = {5, 0, 0, 0, 0, 0};
        
        assertTrue(dcp.Problem106(case1));
        assertFalse(dcp.Problem106(case2));
        assertTrue(dcp.Problem106(case3));
        assertTrue(dcp.Problem106(case4));
        assertTrue(dcp.Problem106(case5));
    }
    
    /**
     * Test of Problem107() method in class DCP
     */
    @Test
    public void testProblem107(){
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.addLeftChild(new BinaryTreeNode(2));
        root.addRightChild(new BinaryTreeNode(3));
        root.getRight().addLeftChild(new BinaryTreeNode(4));
        root.getRight().addRightChild(new BinaryTreeNode(5));
        System.out.println(dcp.Problem107(root));
        assertEquals("1, 2, 3, 4, 5", dcp.Problem107(root));
        
        BinaryTreeNode[] tree = new BinaryTreeNode[9];
        for(int i = 0; i < tree.length; i++)
                tree[i] = new BinaryTreeNode(i);
        tree[0].addLeftChild(tree[1]);
        tree[1].addLeftChild(tree[3]);
        tree[3].addRightChild(tree[5]);
        tree[5].addLeftChild(tree[7]);
        tree[5].addRightChild(tree[8]);
        tree[0].addRightChild(tree[2]);
        tree[2].addRightChild(tree[4]);
        tree[4].addLeftChild(tree[6]);
        assertEquals("0, 1, 2, 3, 4, 5, 6, 7, 8", dcp.Problem107(tree[0]));
    }
}
