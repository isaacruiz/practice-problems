/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeLibrary;
import java.util.ArrayList;
/**
 * Implementation of a stack of plates, that consists of a set of stacks and
 * creates a new one when the previous stack exceeds capacity. It should still
 * function as a regular stack with the push and pop methods. As a follow-up,
 * implement a method popAt that pops the element at a specific
 * sub-stack
 * @author Isaac
 */
public class SetOfStacks<T>{
    ArrayList<MyStack<T>> substacks;
    
    public SetOfStacks(){
        substacks = new ArrayList();
    }
    
    public void push(T t){
        
    }
}
