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
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        int k = 265;
        DCP dcp = new DCP();
        System.out.println(list);
        System.out.println(dcp.Problem102(list, k));
    }
}

