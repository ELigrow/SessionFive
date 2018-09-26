package edu.eligrow.nuwrappers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        double num = keyboard.nextDouble();

        if(num <= Byte.MAX_VALUE && num % 1 == 0){
            System.out.println("This will be a byte");
        }else if (num <= Short.MAX_VALUE && num % 1 == 0){
            System.out.println("This will be a short");
        }else if (num <= Integer.MAX_VALUE && num % 1 == 0) {
            System.out.println("This will be an int");
        }else if (num <= Float.MAX_VALUE && num % 1 != 0){
                System.out.println("This will be a float");
        }else if (num <= Long.MAX_VALUE){
            System.out.println("This will be a long");
        }else if (num <= Double.MAX_VALUE && num % 1 == 0){
            System.out.println("This will be a double");
        }else{
            System.out.println("This number is too long.");
        }
    }
}
