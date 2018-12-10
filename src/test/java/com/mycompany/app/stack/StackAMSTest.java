/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.stack;

import com.mycompany.app.stack.StackAMS;
import com.mycompany.app.stack.SimpleDListStack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ico
 */
public class StackAMSTest {

    protected StackAMS<String> instanceStack;

    @Before
    public void setUp() {
        instanceStack = new SimpleDListStack<>();
    }

    @org.junit.Test
    public void testNPush() {
        instanceStack.push("A");
        instanceStack.push("B");
        instanceStack.push("C");
        assertEquals(3, instanceStack.size());
        assertFalse(instanceStack.isEmpty());
    }

    @org.junit.Test
    public void testPopExisting() {
        instanceStack.push("A");
        instanceStack.push("B");
        instanceStack.push("C");
        assertEquals("C", instanceStack.pop());
        assertEquals("B", instanceStack.pop());
        assertEquals(1, instanceStack.size());

    }

    @org.junit.Test
    public void testPeek() {
        instanceStack.push("A");
        instanceStack.push("B");
        assertEquals("B", instanceStack.peek());
        assertEquals("B", instanceStack.peek());
        assertEquals("B", instanceStack.peek());
        assertEquals(2, instanceStack.size());

    }

    @org.junit.Test
    public void testSize() {
        
    }

    @org.junit.Test
    public void testIsEmptyOnConstuction() {
        assertTrue(instanceStack.isEmpty());
    }

}
