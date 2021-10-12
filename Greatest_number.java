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
public class Greatest_number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the frist number");
        int num=sc.nextInt();
        System.out.println("Enter the sceond number");
        int num1=sc.nextInt();
        System.out.println("Enter the tharid number");
        int num2=sc.nextInt();
        if(num>num1&&num>num2)
        {
            System.out.println("Greatest number is num:-"+num);
        }
        else if(num1>num&&num1>num2)
        {
            System.out.println("greatest number is num1:-"+num1);
        }
        else
        {
            System.out.println("greatest number is num2:-"+num2);
        }
    }
}
