/*
 * Daily Coding Problem solution code
 */
package practice;
import CodeLibrary.Graph;
import java.util.*;
/**
 *
 * @author Isaac
 */
public class DCP {
    //1 - Given a list of numbers and k, return whether any two numbers from list
    //add up to k
    public boolean Problem1(int[] nums, int k){
        for(int i = 0; i < nums.length; i++)
            for(int j = i + 1; j < nums.length; j++)
                if(nums[i] + nums[j] == k)
                    return true;
        return false;
    }
    
    //99 - Given a 2D board of characters and a word, find if the word exists in the
    //grid. The word can be constructed from letters of a sequentially vertically
    //and horizontally adjacent cells. The same cell can not be used twice
    public boolean Problem99(int[][] board, String word){
        Graph g = new Graph();
        g.x = 10;
        System.out.println(g.x);
        return false;
    }
    
    //102 - Given a list of integers and number k, return which contiguous
    //elements of the list sum to K
    public ArrayList<Integer> Problem102(ArrayList<Integer> list, int k){
        ArrayList<Integer> result = new ArrayList<>();
        for(int left = 0; left < list.size(); left++){
            int right = left + 1;
            int sum = list.get(left);
            while(right < list.size() && sum < k){
                sum += list.get(right);
                right++;
            }
            //Add elements summing to k to a list
            if(sum == k){
                for(int i = left; i < right; i++)
                    result.add(list.get(i));
                return result;
                
            }
        }
        return result;
    }
    
    //103 - Given a string and a set of characters, return the smallest
    //substirng that contains all characters in the set. If there is no string
    //containing all characters, return null
    public String Problem103(String s, char[] chars){
        if (s.length() < chars.length)
            return null;
        String prev = s;
        String cur = "";
        Set<Character> char_set = new HashSet<Character>();
        for(char c : chars)
            char_set.add(c);
        
        //iterate through string checking for characters in set
        int left, right;
        boolean found = false;
        for(int i = 0; i < s.length(); i++){   
            //inner loop the scan for characters in set
            Set<Character> checker = new HashSet<Character>(char_set);
            boolean overflow = false;
           
            if(checker.remove(s.charAt(i))){
                left = i;
                right = i + 1;
                while(!checker.isEmpty()){
                    if(right >= s.length()){
                        overflow = true;
                        break;
                    }
                    checker.remove(s.charAt(right));
                    right++;
                }
                if(!overflow){
                    found = true;
                    cur = s.substring(left, right);
                    if(cur.length() < prev.length())
                        prev = cur;
                }
            }
        }
        return found ? prev : null;
    }
}
