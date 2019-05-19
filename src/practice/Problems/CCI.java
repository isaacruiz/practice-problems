/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
import CtCILibrary.*;
/**
 *
 * @author Isaac
 */
public class CCI {
    //-------------------------------Chapter 1----------------------------------
    //1.1 Function to determine if a string has all unique characters
    //TODO: implement solution without using additional data structure
    public boolean isUnique(String s){
        /*
        HashSet set = new HashSet();
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i)))
                return false;
            else
                set.add(s.charAt(i));
        }
        return true;
        */
        //Without additional data structures
        
        return true;
    }
    
    //1.2 Given two strings, decide if one string is a permutation of the other
    public boolean checkPermutation(String a, String b){
        if(a.length() != b.length())
            return false;
        
        int[] chars = new int[256];
        for(int i = 0; i < a.length(); i++){
            chars[a.charAt(i)]++;
        }
        
        for(int i  = 0; i < b.length(); i++){
            if(chars[b.charAt(i)] == 0)
                return false;
            else
                chars[b.charAt(i)]--;
        }
        
        return true;
    }
    
    //1.3 Replace the spaces in a string "%20" and you are given the true length
    //of the string
    public String URLify(String s, int len){
        char[] str_array = new char[s.length()];
        str_array = s.toCharArray();
        int i = len - 1;
        for(int j = s.length()-1; j >= 0 && i >= 0; j--, i--){
            
            
            if(str_array[i] == ' '){
                str_array[j] = '0';
                str_array[j-1] = '2';
                str_array[j-2] = '%';
                j -= 2;
            }
            else
                str_array[j] = str_array[i];
        }
        return new String(str_array);
    }
    
    //1.4 Check if given string is a permutation of a palindrome
    public boolean palindromePermutation(String s){
        //Solution 1
        /*
        int[] count = new int[256];
        String lower = s.toLowerCase();
        for(char c: lower.toCharArray()){
            if(c == ' ')
                continue;
            count[c]++;
        }
        boolean foundOdd = false;
        for(int num : count){
            
            if (num % 2 == 1){
                if(foundOdd)
                    return false;
                foundOdd = true;
            }
        }
        return true;
        */
        //Solution 2: Using a bit vector
        int bit_vector = 0;
        String lower = s.toLowerCase();
        int index;
        for(int i = 0; i < lower.length(); i++){
            if (lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z'){
                index = lower.charAt(i) - 'a';
                bit_vector = toggle(bit_vector, index);
            }
        }
        
        if (bit_vector == 0) return true;
        else return (bit_vector & (bit_vector -1)) == 0;
    }
    
    protected int toggle(int bit_vector, int index){
        int mask = 1 << index;
        return bit_vector ^ mask;
    }
    //1.5 Returns true if two given strings are one/zero edits away from being
    //the same string via insertion, deletion, or replacement of a character
    public boolean oneAway(String a, String b){
        
        int charDiff = a.length() - b.length();
        
        //case 1: difference in length exceeds single edit
        if(Math.abs(charDiff) > 1)
            return false;
        
        //case 2: replace a character(string lengths are equal)
        else if(charDiff == 0){
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != b.charAt(i)){
                    StringBuilder sb = new StringBuilder(b);
                    sb.setCharAt(i, a.charAt(i));
                    b = sb.toString();
                    break;
                }
            }
        } 
        //case 3: insert/delete a character(string lenths differ by 1)
        else{
            String longer = (a.length() > b.length()) ? a : b;
            String shorter = (a.length() < b.length()) ? a : b;
            StringBuilder sb = new StringBuilder(shorter);
            boolean madeEdit = false;
            for(int i = 0; i < shorter.length(); i++){
                if(shorter.charAt(i) != longer.charAt(i)){        
                    sb.insert(i, longer.charAt(i));
                    shorter = sb.toString();
                    madeEdit = true;
                    break;
                }
            }
            if(!madeEdit){
                sb.append(longer.charAt(longer.length() - 1));
                shorter = sb.toString();
            }
            a = longer;
            b = shorter;
        }
        return (a.equals(b));
    }
    
    //1.6 Implement method that returns a string telling the count of duplicate
    //adjacent characters rather than the whole string. If the result string is
    //longer, return the original string.
    //(input: aaabbcccccddx output: a3b2c5d2x1
    public String stringCompression(String s){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char cur;
        int count = 0;
        while(i < s.length()){
            cur = s.charAt(i);
            count = 1;
            while((i + 1 < s.length()) && (s.charAt(i+1) == cur)){
                count++;
                i++;
            }
            sb.append(cur).append(count);
            i++;
        }
       
        return sb.toString().length() < s.length() ? sb.toString() : s;
    }
    
    //1.7 Rotate an NxN matrix in place
    public boolean rotateMatrix(int[][]matrix){
        for(int layer = 0; layer < matrix.length/2; layer++){
            rotateLayer(matrix, layer);
        }
        return true;
    }
    private boolean rotateLayer(int[][]matrix, int layer){
        if(matrix.length != matrix[0].length || matrix.length == 0)
            return false;
        int[] top = new int[2];
        int[] right = new int[2];
        int[] bottom = new int[2];
        int[] left = new int[2];
        //Initialize top row index
        int n = matrix[0].length;
        top[0] = layer;
        top[1] = layer;
        //Initialize right col index
        right[0] = layer; 
        right[1] = n - 1 - layer;
        //Initialize bottom row index
        bottom[0] = n - 1 - layer;
        bottom[1] = n - 1 - layer;
        //Initialize left col index
        left[0] = n - 1 - layer;
        left[1] = layer;
        
        for(int i = 0; i < n - 1 - 2*layer; i++){
                        
            int temp = matrix[top[0]][top[1]];
            matrix[top[0]][top[1]] = matrix[left[0]][left[1]];
            matrix[left[0]][left[1]] = matrix[bottom[0]][bottom[1]];
            matrix[bottom[0]][bottom[1]] = matrix[right[0]][right[1]];
            matrix[right[0]][right[1]] = temp;
            //System.out.println("top:    " + Arrays.toString(top));
            //System.out.println("right:  " + Arrays.toString(right));
            //System.out.println("bottom: " + Arrays.toString(bottom));
            //System.out.println("left:   " + Arrays.toString(left) + "\n");
            top[1]++;
            right[0]++;
            bottom[1]--;
            left[0]--;
            
        }
        return true;
    }
    //-------------------------------Chapter 2----------------------------------
    //2.1 Write code to remove duplicates from unsorted linked list
    
    
    //-------------------------------Chapter 8----------------------------------
    //8.1 Count the number of ways to ascend a stair case only taking 1, 2,
    //or 3 steps at a time
    public int tripleStep(int steps){
        /*
        if (steps == 1) return 1;
        if (steps == 2) return 2;
        if (steps == 3) return 4;
        return tripleStep(steps - 3) + tripleStep(steps - 2) + tripleStep(steps - 1);
        */
        int[] memo = new int[steps + 1];
        memo[0] = 1;
        return numWays(steps, memo);
        
    }
    private int numWays(int steps, int[] memo){
        if(steps < 0)
            return 0;
        
        if(memo[steps] == 0)
            memo[steps] = numWays(steps - 1, memo) + numWays(steps - 2, memo)
                    + numWays(steps - 3, memo);
        return memo[steps];
    }
}
