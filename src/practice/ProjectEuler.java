/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
import java.io.*;
/**
 *
 * @author Isaac
 */
public class ProjectEuler {
    
//returns the sume of all multiples of 3 and 5 below n
    public static int multiplesOf3and5(int n){
        /*Naive approach*/
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            if (i % 5 == 0 || i % 3 == 0)
                sum += i;
        }
        
        return sum;
    }
    
    /*Finds the sum of the Fibonacci numbers whose values do not exceed 4 million*/
    public static int evenFibonacci(){
        int sum = 0;
        ArrayList<Integer> fib = new  ArrayList<Integer>();
        fib.add(0);
        fib.add(1);
        
        int result = fib.get(0) + fib.get(1);
        int i = 2;
        do{
            result = fib.get(i-1) + fib.get(i-2);
            fib.add(result);
            if(result % 2 == 0)
                sum += result;
            i++;
        }while(result < 4000000);
        
        
        return sum;
    }
    /*finds the largest prime factor of a number*/
    public static long largestPrimeFactor(long n){
        //Store a running list of found primes
        for(long i = 2; i * i < n; i++){
            while (n % i == 0)
                n = n / i;
         
        }
        return n;
    }
    //Problem 13
    public static int[] largeSum(String file){
        FileInputStream in = null;
        int[] nums = new int[10];
        
        try{
            in =  new FileInputStream(file);
        }
        
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally{
            return nums;
        }
    }
    
    
    
}
