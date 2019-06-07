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
public class StackMinTest extends TestCase {
    public StackMinTest(String testName) {
        super(testName);
    }

    /**
     * Test of pop method, of class StackMin.
     */
    public void testMinStack() {
        StackMin instance = new StackMin();
        instance.push(4);
        instance.push(5);
        instance.push(2);
        instance.push(1);
        assertEquals(1, instance.min());
        assertEquals(1, (int)instance.pop());
        assertEquals(2, instance.min());
        assertEquals(2, (int)instance.pop());
        assertEquals(4, instance.min());
        assertEquals(5, (int)instance.pop());
        assertEquals(4, (int)instance.pop());
        assertTrue(instance.isEmpty());
    }
    
}
