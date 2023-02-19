/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;
/**
 *
 * @author drumm
 */
public class Mavenproject4 {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two ints: ");
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.println(a);
        System.out.println(b);
        int quotient = a/b;
        System.out.println("The quotient is: " + quotient);
        int remainder = a%b;
        System.out.println("The remainder is: " + remainder);
        displayDigits();
    }
    public static void displayDigits()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter five digits: ");
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int d = reader.nextInt();
        int e = reader.nextInt();
        System.out.println("The digits are: " + a + "  " + b + "  " + c + "  " + d + "  " + e);
    }
}
