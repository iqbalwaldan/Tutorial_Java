package com.tutorial;

public class Main {

    public static void main (String[] args){

        // looping bersarang

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if ( (i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                } else if ( (i+j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\nTUGAS!!!\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if((j+i) == 4){
                    for(int k = 0; k < 5; k++){
                        System.out.print("* ");
                        if (i == k){
                            break;
                        }
                    }
                }
                System.out.print("  ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == j){
                    for(int k = 0; k < 5; k++){
                        System.out.print("* ");
                        if ((j+k) == 4){
                            break;
                        }
                    }
                }
                System.out.print("  ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if((i+j) == 4){
                    for (int k = 0; k <= i*2; k++) {
                        System.out.print("* ");
                    }
                } else if(i-j == 4){
                    for (int l = 0; l < (9-(j*2)); l++) {
                        System.out.print("* ");
                    }
                }
                System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
