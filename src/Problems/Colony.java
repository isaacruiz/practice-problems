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
public class Colony {

  //METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static int[] cellCompete(int[] cells, int days)
  {
    int[] prev = new int[8];
    
    for(int i = 0; i < 8; i++){
        prev[i] = cells[i];
    }
    
    int[] next = new int[8];
    
    for(int d = 0; d < days; d++){
        next[0] = prev[1];
        next[7] = prev[6];
        for(int i = 1; i < 7; i++){
            if(prev[i-1] == prev[i+1])
                next[i] = 0;
            else
                next[i] = 1;
        }
        prev = next;
    }
    
    return next;

  }
  // METHOD SIGNATURE ENDS
}

