/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author drumm
 */
public class Mavenproject5 {

    public static void main(String[] args) 
    {
        int[] array = {0,2,0,5,4,3,4,0,1};
        
        for (int counter = 0; counter < array.length; counter++)
        {
            if (counter == 0)
            {
                System.out.println("The amount of employees that recieved $200-299: " + array[0]);
            }
            if (counter == 1)
            {
                System.out.println("The amount of employees that recieved $300-399: " + array[1]);
            }
            if (counter == 2)
            {
                System.out.println("The amount of employees that recieved $400-499: " + array[2]);
            }
            if (counter == 3)
            {
                System.out.println("The amount of employees that recieved $500-599: " + array[3]);
            }
            if (counter == 4)
            {
                System.out.println("The amount of employees that recieved $600-699: " + array[4]);
            }
            if (counter == 5)
            {
                System.out.println("The amount of employees that recieved $700-799: " + array[5]);
            }
            if (counter == 6)
            {
                System.out.println("The amount of employees that recieved $800-899: " + array[6]);
            }
            if (counter == 7)
            {
                System.out.println("The amount of employees that recieved $900-999: " + array[7]);
            }
            if (counter == 8)
            {
                System.out.println("The amount of employees that recieved $1000+ : " + array[8]);
            }
        }
    }
}
