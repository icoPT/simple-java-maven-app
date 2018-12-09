/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams.stacktdd;

import java.util.LinkedList;

/**
 *
 * @author ico
 * @param <T> data element type
 */
public class SimpleDListStack<T>  implements StackAMS<T> {

    private final LinkedList<T> list = new LinkedList<>();

    
    @Override
   public void push(T item) {list.addFirst(item);}
    @Override
    public T pop() {return list.removeFirst();}
    @Override
    public T peek() {return list.getFirst();}
    @Override
    public int size() {return list.size();}
    @Override
    public boolean isEmpty() {return list.isEmpty();}

}
