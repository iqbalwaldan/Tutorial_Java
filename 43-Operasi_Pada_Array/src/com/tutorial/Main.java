package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n==============");
        printArray(arrayAngka1,"array");

        // mengkopi array
        System.out.println("\nMengkopi array\n==============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");

        System.out.println("\nmengkopi dengan loop");
        for(int i=0; i < arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1, "array 1");
        System.out.println(arrayAngka1);
        printArray(arrayAngka2, "array 2");
        System.out.println(arrayAngka2);

        System.out.println("\nmengkopi dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        printArray(arrayAngka1, "array 1");
        System.out.println(arrayAngka1);
        printArray(arrayAngka3, "array 2");
        System.out.println(arrayAngka3);

        System.out.println("\nmengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        printArray(arrayAngka1, "array 1");
        System.out.println(arrayAngka1);
        printArray(arrayAngka4, "array 2");
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nFill array\n==============");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5, "array");
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5, "hasil");

        // komparasi array
        System.out.println("\nkomparasi array\n==============");
        int[] arrayAngka6 = {1,2,3,4,9};
        int[] arrayAngka7 = {1,2,3,4,5};
        printArray(arrayAngka6, "array 1");
        printArray(arrayAngka7, "array 2");

        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        System.out.println("\nngecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nngecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        // sort array
        System.out.println("\nsort array asc\n==============");
        int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8, "array");
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8, "hasil");

        // search array
        System.out.println("\nsearch array\n==============");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi);

        // tugas -> sort kebalik,
        System.out.println("\nsort array desc\n==============");
        sortArrayDESC(arrayAngka8);

        // operasi tambah antara dua buah array
        System.out.println("\nmenjumlahkan array\n==============");
        menjumlahkanArray(arrayAngka8,arrayAngka1);

        // mengabungkan dua buah array,
        System.out.println("\nmenggabungkan array\n==============");
        menggabungkanArray(arrayAngka7,arrayAngka8);

    }

    private static void printArray(int[] dataArray, String pesan){

        System.out.println(pesan+" = " + Arrays.toString(dataArray));

    }

    private static void sortArrayDESC(int[] dataArray){

        printArray(dataArray, "array");
        int temp;
        for (int i = 0; i < dataArray.length - 1; i++) {
            for (int j = 1; j < (dataArray.length - i); j++) {
                if (dataArray[j - 1] < dataArray[j]) {
                    temp = dataArray[j];
                    dataArray[j] = dataArray[j - 1];
                    dataArray[j - 1] = temp;
                }
            }
        }
        printArray(dataArray, "hasil");

    }

    private static void menjumlahkanArray(int[] dataArray1, int[] dataArray2){

        printArray(dataArray1, "array 1");
        printArray(dataArray2, "array 2");
        System.out.println("Sesudah dijumlah");
        if (dataArray1.length < dataArray2.length){
            for (int i = 0; i < dataArray1.length; i++) {
                dataArray2[i] = dataArray1[i] + dataArray2[i];
            }
            printArray(dataArray2, "hasil");
        } else{
            for (int i = 0; i < dataArray2.length; i++) {
                dataArray1[i] = dataArray1[i] + dataArray2[i];
            }
            printArray(dataArray1, "hasil");
        }

    }

    private static void menggabungkanArray(int[] dataArray1, int[] dataArray2){

        printArray(dataArray1, "array 1");
        printArray(dataArray2, "array 2");
        int[] dataArray3 = new int[dataArray1.length + dataArray2.length];
        for (int i = 0; i < dataArray1.length; i++) {
            dataArray3[i] = dataArray1[i];
        }
        int lanjutan = dataArray1.length;
        for (int i = 0; i < dataArray2.length; i++) {
            dataArray3[lanjutan] = dataArray2[i];
            lanjutan++;
        }
        System.out.println("Sesudah digabungkan");
        printArray(dataArray3, "hasil");
    }

}