/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Isaac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DCP dcp = new DCP();
        LinkedList<Character> word = new LinkedList<>();
        word.add('a');
        word.add('b');
        word.add('d');
        word.add('d');
        word.add('b');
        word.add('a');
        Iterator left = word.iterator();
        
        System.out.println(dcp.Problem104A(word));
    }
}

