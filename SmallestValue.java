/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;


import java.util.Scanner;
/**
 *
 * @author itlabs
 */
public class SmallestValue 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three int values separated by spaces: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        int result = minimum(number1, number2, number3);
        
        System.out.println("Minimum is: " + result);
    }
    
    public static int minimum(int x, int y, int z)
        {
            int minimumValue = x;
            
            if (y < minimumValue)
            {
                minimumValue = y;
            }
            
            if (z < minimumValue)
            {
                minimumValue = z;
            }
            
            return minimumValue;
        }
    
}
