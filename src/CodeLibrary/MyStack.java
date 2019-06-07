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
    
    private static class StackNode<T>{
        private StackNode<T> next;
        private T data;
        StackNode(T data){
            this.data = data;
        }
    }
    public void push(T value){
        StackNode<T> temp  = new StackNode(value);
        temp.next = top;
        top = temp;
    }
    
    public T pop(){
        if (top == null) return null;
        T t = top.data;
        top = top.next;
        return t;
    }
    
    public T peek(){
        if(top == null)
            return null;
        return top.data;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
}
