/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANISH KUMAR
 */
import java.util.Scanner;
public class fibonacciNumber {
    static int fib(int N)
    {
        if(N<=1)
            return N;
       return fib(N-1)+fib(N-2);        
            }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
        System.out.println(fib(N));
    }
}
