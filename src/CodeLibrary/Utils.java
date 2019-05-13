/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeLibrary;

/**
 *
 * @author Isaac
 */
public class Utils {
    public static void printArray2D(int[][] arr){
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
