/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *
 * @author Isaac
 */
public class PracticeProblems {
    /*
     * Write function that returns list of all permutations of given string
     */
    public static ArrayList<String> permutations(String s){
        ArrayList<String> result = new ArrayList();
        HashSet<String> permutations = new HashSet();
        return result;
    }
    private void permutationsHelper(String s, ArrayList<String> result){
        if(s.length() == result.get(0).length()) return;
        for(int i = 0; i < s.length(); i++){
            //permutations on left half, permutations on right half
        }
    }
    /*
     * Write function that takes two lists of characters as parameters and
     * returns two lists of characters. The first list contains characters that
     * were in the first paramter list that was not in the second and vice versa
     * for the second. If there are duplicate characters, the list will contain
     * duplicate characters equivalent to the number of times a character was
     * present in the list minus the number of times present in the other.
     */
	
    
    /*
     * Write a function that takes a string as input and returns the longest
     * palindrome substring in the input string (Assume that there is only one
     * longest palindrome
     */
    
    /*
     * Write a function that takes a string composed of one or more sentences
     * and a list of commonly used words and returns the most common word or
     * words used in the string that were not in the list of common words
     */
}
