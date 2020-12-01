package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // program untuk konversi data

        int nilaiInt = 256; // 32-bit
        System.out.println("nilai int = "+ nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = " + nilaiByte);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);

        // casting pembagian
        int a = 10;
        int b = 4;
        float c = a/b;
        System.out.printf("%d / %d = %f\n",a,b,c); // akan menghasilkan 2.0000

        // jika ingin menghasilkan 2.5 maka salah saty dari angka yang dibagi diubah menjadi float
        float d = 10;
        int e = 4;
        float f = d/e;
        System.out.printf("%f / %d = %f\n",d,e,f);

        // ada cara lain
        int x = 10;
        int y = 4;
        float z = (float)x/y; // dimana nilai x di konversi menjadi float lalu di bagi y
        System.out.printf("%d + %d = %f",x,y,z);
    }
}
