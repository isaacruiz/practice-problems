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
      
        CCI cci = new CCI();
        System.out.println(cci.tripleStep(4));
        
    }
    public static void printArray2D(int[][] arr){
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

