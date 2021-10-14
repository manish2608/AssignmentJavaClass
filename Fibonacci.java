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
public class Fibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int t1=0, t2=1,nextTerm=0,i;
      
        int fib=0;
        if(N==0||N==1)
        {
            System.out.println(N);
        }
        else
        {
            nextTerm=t1+t2;
        }
        for(i=3;i<=N;++i)
        {
            t1=t2;
            t2=nextTerm;
            nextTerm=t1+t2;
        }
        System.out.println(nextTerm);
    }
}
