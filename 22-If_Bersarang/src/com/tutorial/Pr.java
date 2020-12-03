package com.tutorial;

public class Pr {

    public static void main(String[] args) {

        // nested if atau if bersarang
        int a = 10;

        System.out.println("ini adalah awal dari program");

        if (a == 5){
            System.out.println("Statement 1");
        } else if (a == 10){
            System.out.println("Statement 4");
        } else if (a == 15) {
            System.out.println("Statement 2");
        } else {
            System.out.println("Statement 3");
        }
        System.out.println("ini adalah akhir dari program");
    }
}
