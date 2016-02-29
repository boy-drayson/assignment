/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10531397;

/**
 *
 * @author randy
 */
import java.util.Scanner;
public class DumbCalculator 
{
    public static void main(String[] arg)
            
    {
        Scanner input=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Enter three numbers");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        
        double d= (a+b+c)/2;
        System.out.printf("Your answer is %g",d);
    }
    
}
