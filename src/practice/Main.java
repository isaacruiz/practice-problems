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
        String s = "ebbbbebbia";
        char[] set = {'a', 'e', 'i'};
        DCP dcp = new DCP();
        
        System.out.println(dcp.Problem103(s, set));
    }
}

