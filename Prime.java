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
public class Prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:-");
       int N=sc.nextInt();
       int i=0;
       int j=0;
       String primeNumber=" ";
       for(i=1;i<=N;i++)
       {
           int counter=0;
           for(j=i;j>=1; j--)
           {
               if(i%j==0)
               {
                   counter=counter+1;
               }
           }
           if(counter==2)
           {
               primeNumber=primeNumber+i+"\n";
           }
           
       }
        System.out.println("All prime number 1 to N:-");
        System.out.println(primeNumber);
       
      
    }
}
