package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("panggil nama: ");
        input = inputUser.next();
        System.out.println(input);
        // ekspresinya berupa satuan (int, long, byte, short), String, atau enum
        switch (input){
            case "otong":
                System.out.println("Saya otong dan hardir Bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!!");
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }
        System.out.println("selesai program");
    }
}
