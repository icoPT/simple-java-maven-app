/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams.stacktdd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ico
 */
public class StackAMSTest1 {
    
    protected StackAMS<String> instanceStack;
    
    @Before
    public void setUp() {
        instanceStack = new InclassStack<>();
    }

    @org.junit.Test
    public void testNPush() {
        instanceStack.push("A");
        instanceStack.push("B");
        instanceStack.push("C");
        assertEquals(3, instanceStack.size());
        assertFalse( instanceStack.isEmpty());
    }

    @org.junit.Test
    public void testPop() {

    }

    @org.junit.Test
    public void testPeek() {
    }

    @org.junit.Test
    public void testSize() {
    }

    @org.junit.Test
    public void testIsEmptyOnConstuction() {
        assertTrue( instanceStack.isEmpty());
    }

    
}
