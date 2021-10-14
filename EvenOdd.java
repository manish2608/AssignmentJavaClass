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
public class EvenOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:-");
        int N=sc.nextInt();
        int i=0;
        int sumEven=0;
        int sumOdd=0;
         while(N>0)
        {
           
           if(N%2==0)
           {
               sumEven=sumEven+N%10;
           }
           else
           {
               sumOdd=sumOdd+N%10;
           }
            N=N/10;
           i++;
        }
         System.out.println("even:-"+sumEven);
         System.out.println("odd;-"+sumOdd);
    }
}
