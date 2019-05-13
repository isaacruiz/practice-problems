/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Isaac
 */
public class BST {
    private Node root;

    
    public boolean search(int n){
        Node cur = root;
          
        while(true){
            
            if  (cur == null)
                return false;
            
            else if (n < cur.val)
                cur = cur.left;
            
            else if (n > cur.val)
                cur = cur.right;
            
            else
                return true;
        }
    }
    
    public void add(int n){
        Node temp = new Node(n);
        if (root == null){
            root = temp;
        }
        
        else{
            Node cur = root;
            while(true){
                if (n < cur.val)
                    cur = cur.left;

                else
                    cur = cur.right;
                
                if(cur == null){
                    cur = temp;
                    return;
                }
            }
        }
    }
}
