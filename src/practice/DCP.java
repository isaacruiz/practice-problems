/*
 * Daily Coding Problem solution code
 */
package practice;
import java.util.*;
/**
 *
 * @author Isaac
 */
public class DCP {
    /*
    *Given a list of numbers and k, return whether any two numbers from list
    *add up to k
    */
    public boolean Problem1(int[] nums, int k){
        for(int i = 0; i < nums.length; i++)
            for(int j = i + 1; j < nums.length; j++)
                if(nums[i] + nums[j] == k)
                    return true;
        return false;
    }
    
    //Given a 2D board of characters and a word, find if the word exists in the
    //grid. The word can be constructed from letters of a sequentially vertically
    //and horizontally adjacent cells. The same cell can not be used twice
    public boolean Problem99(int[][] board, String word){
        
        return false;
    }
}
