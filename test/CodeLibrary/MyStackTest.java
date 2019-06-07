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
public class MyStackTest extends TestCase {
    
    public MyStackTest(String testName) {
        super(testName);
    }

    /**
     * Test of push method, of class MyStack.
     */
    public void testPush() {
        MyStack<String> instance = new MyStack();
        instance.push("Hello");
        instance.push("test");
        assertEquals("test", instance.peek());
    }

    /**
     * Test of pop method, of class MyStack.
     */
    public void testPop() {

        MyStack<String> instance = new MyStack();
        instance.push("Hello");
        assertEquals("Hello", instance.pop());
    }

    /**
     * Test of peek method, of class MyStack.
     */
    public void testPeek() {
        System.out.println("peek");
        MyStack instance = new MyStack();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class MyStack.
     */
    public void testIsEmpty() {
        System.out.println("isEmpty");
        MyStack instance = new MyStack();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
