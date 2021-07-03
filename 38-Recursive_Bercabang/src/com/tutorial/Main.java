package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai n = ");
        int nilai = userInput.nextInt();
        int nilai_fibonacci = fibonacci(nilai);
        System.out.println("nilai fibonacci ke-"+ nilai +" adalah " + nilai_fibonacci);
    }


    private static int fibonacci(int n){
        if (n == 1 || n == 0){
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}