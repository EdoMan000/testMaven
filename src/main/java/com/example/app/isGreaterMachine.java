package com.example.app;

import java.util.Scanner;

public class isGreaterMachine {
    /**
     * @param args
     */
    public static void main(String[] args) {
        printTitle();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter first number below: ");
        int x = reader.nextInt();
        System.out.println("Enter second number below: ");
        int y = reader.nextInt();
        reader.close();
        System.out.println("\n");
        boolean res;
        System.out.println("\n isGreaterMachine is thinking... \n\n");
        try {
            res = isGreater(x, y);
        } catch (sameNumberException e) {
            System.out.println("YOU INSERTED THE SAME NUMBER!!");
            return;
        }
        if(res){
            System.out.println(x + " IS GREATER THAN " + y);
        }else {
            System.out.println(y + " IS GREATER THAN " + x);
        }
    }

    private static void printTitle() {
        System.out.println("""
                ================================
                |  WELCOME TO "IS GREATER THAN" |
                ================================

                """);
    }


    /**
     * this function returns true if the first parameter 'x'
     * is greater than the second parameter 'y'
     * @param x
     * @param y
     * @return
     * @throws sameNumberException
     */
    public static boolean isGreater(int x, int y) throws sameNumberException{
        if(x == y){
            throw new sameNumberException();
        }
        return x>y;
    }
}