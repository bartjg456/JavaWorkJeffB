/*
 * Jeff Bartunek
 * Java Programming In Class Assignment 1
 * 1/30/2023
 */
package com.mycompany.javaassignment_jeffb;
import java.util.Scanner;
/**
 *
 * @author itlabs
 */
public class NewClass 
{
    public static void main(String[] args)
    {
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five digit number: ");
        myNumber = scanner.nextInt();
        int digit1 = myNumber / 10000;
        System.out.println("first digit: " + digit1);
    }
}
