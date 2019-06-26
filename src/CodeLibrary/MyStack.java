/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeLibrary;

/**
 *
 * @author Isaac
 */
public class MyStack<T>{
    private StackNode<T> top;
    private int capacity;
    private int size = 0;
    
    private static class StackNode<T>{
        private StackNode<T> next;
        private T data;
        StackNode(T data){
            this.data = data;
        }
    }
    public MyStack(){}
    public MyStack(int capacity){
        this.capacity = capacity;
    }
    
    public void push(T value){
        if(size == capacity)
            return;
        StackNode<T> temp  = new StackNode(value);
        temp.next = top;
        top = temp;
        size++;
    }
    
    public T pop(){
        if (top == null) return null;
        T t = top.data;
        top = top.next;
        size--;
        return t;
    }
    
    public T peek(){
        if(top == null)
            return null;
        return top.data;
    }
    public boolean isFull(){
        return size==capacity;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
}
