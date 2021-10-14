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
public class Fahrenheit_celsius {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a degree in strat Fahrenheit:-");
        double S=sc.nextDouble();
        System.out.println("Input a degree in end Fahrenheit:-");
        double E=sc.nextDouble();
        System.out.println("Input a degree in step size Fahrenheit:-");
        double W=sc.nextDouble();
        double i;
        double celsius;
        for(i=S;i<=E;i=i+W){
            celsius=((5*(i-32.0))/9.0);
            System.out.println(i+"  "+celsius);
       
        }
    }
}
