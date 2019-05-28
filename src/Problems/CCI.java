/**
 * Class that implements the coding questions in Cracking the Coding Interview
 * @author Isaac Ruiz
 */
package practice;
import java.util.*;
import CtCILibrary.*;

public class CCI {
    /*
     * ----------------------------Chapter 1------------------------------------
     */
    
    /**
     * Question 1.1
     * <p>
     * Function to determine if a string has all unique characters
     * </p>
     * @param s Given string
     * @return true if all characters are unique
     */
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
    /**
     * Question 1.2
     * <p>
     * Given two strings, decide if one is a permutation of the other
     * </p>
     * @param a String a
     * @param b String b
     * @return true if one string can be made by the characters of the other
     */
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
    
    /**
     * Question 1.3
     * <p>
     * Replaces the spaces in string with "%20"
     * </p>
     * @param s string to URLify
     * @param len length of the final string
     * @return string with replaced spaces
     */
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
    
    /**
     * Question 1.4
     * <p>
     * Check if a given string is a permutation of a palindrome
     * </p>
     * @param s input string to check for palindromability
     * @return true if string can be made into a palindrome
     */
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
    
    /**
     * Question 1.5
     * <p>
     * Determines if two given strings are one/zero edits away from being
     * the same string via insertion, deletion, or replacement of a character
     * </p>
     * @param a first input string
     * @param b second input string
     * @return true if strings are one edit difference
     */
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
    
    /**
     * Question 1.6
     * <p>
     * Returns a string telling the count of duplicate adjacent characters
     * rather than the whole string. If the result string is longer, return the
     * original string. (input: aaabbcccccddx output: a3b2c5d2x1
     * </p>
     * @param s uncompressed input string
     * @return string representing original string or original string if
     * representation is longer
     */
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
    
    /**
     * Question 1.7
     * <p>
     * Rotates an N x N matrix in place
     * </p>
     * @param matrix
     * @return 
     */
    public boolean rotateMatrix(int[][]matrix){
        for(int layer = 0; layer < matrix.length/2; layer++){
            rotateLayer(matrix, layer);
        }
        return true;
    }
    /**
     * Question 1.7 helper function
     * <p>
     * Rotates a single layer of a square matrix clockwise
     * </p>
     * @param matrix input matrix to be rotated
     * @param layer the layer the rotation is performed on, counting from outside
     * inwards
     * @return true if rotation was successful 
     */
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
    /*
     * ----------------------------Chapter 2------------------------------------
     */
    /**
     * Question 2.1
     * <p>
     * Removes duplicates from an unsorted linked list
     * </p>
     * @param list unsorted linked list
     */
    public void removeDups(LinkedListNode list){
        if(list == null || list.next == null) return;
        Set<Integer> hs = new HashSet<>();
        hs.add(list.data);
        LinkedListNode cur = list.next;
        LinkedListNode prev = list;
        while(cur != null){
            if(hs.contains(cur.data)){
                prev.setNext(cur.next);
                cur.next.setPrevious(prev);
                cur = cur.next;
            }
            else{
                hs.add(cur.data);
                prev = cur;
                cur = cur.next;
            }
        }
        return;
    }
    
    /*
     * ----------------------------Chapter 8------------------------------------
     */
    /**
     * Question 8.1
     * <p>
     * Counts the number of ways to ascend a stair case only taking 1, 2, or 3
     * steps at a time
     * </p>
     * @param steps the number of steps
     * @return number of ways to ascend stair case
     */
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
    /**
     * Question 8.1 helper function
     * <p>
     * Counts the number of ways to ascend staircase using a look-up table
     * @param steps number of steps to ascend
     * @param memo look up table
     * @return number of ways to ascend
     */
    private int numWays(int steps, int[] memo){
        if(steps < 0)
            return 0;
        
        if(memo[steps] == 0)
            memo[steps] = numWays(steps - 1, memo) + numWays(steps - 2, memo)
                    + numWays(steps - 3, memo);
        return memo[steps];
    }
}
