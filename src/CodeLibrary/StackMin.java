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
public class StackMin extends MyStack<Integer>{
    private MyStack<Integer> min_stack;
    public StackMin(){
        min_stack = new MyStack<Integer>();
    }
    public void push(int value){
        super.push(value);
        if(value <= min()) min_stack.push(value);
    }
    @Override
    public Integer pop(){
        int value = super.pop();
        if(value == min())
            min_stack.pop();
        return value;
    }
    public int min(){
        if(min_stack.isEmpty()) return Integer.MAX_VALUE;
        return min_stack.peek();
    }
    
}
