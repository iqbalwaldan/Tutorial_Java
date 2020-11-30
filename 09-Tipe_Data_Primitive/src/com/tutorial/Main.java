package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // tipe data di java
        // integer, byte, short, long, double, float, char, boolean

        // Integer (satuan)
        int a = 10;
        System.out.println("======INTEGER======");
        System.out.println("nilai Integer a = " + (a + 1));
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("besar Integer = " + Integer.BYTES + " bytes");
        System.out.println("besar Integer = " + Integer.SIZE + " bit");

        // Byte (satuan)
        byte b = 10;
        System.out.println("======BYTE======");
        System.out.println("nilai Byte b = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("besar Byte = " + Byte.SIZE + " bit");

        // Short (satuan)
        short c = 10;
        System.out.println("======SHORT======");
        System.out.println("nilai Short c = " + c);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("besar Short = " + Short.BYTES + " bytes");
        System.out.println("besar Short = " + Short.SIZE + " bit");

        // Long (satuan)
        long d = 10L;
        System.out.println("======LONG======");
        System.out.println("nilai Long d = " + d);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("besar Long = " + Long.BYTES + " bytes");
        System.out.println("besar Long = " + Long.SIZE + " bit");

        // Double (koma, bilangan real)
        double e = -10.5d;
        System.out.println("======DOUBLE======");
        System.out.println("nilai Double e = " + e);
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("besar Double = " + Double.BYTES + " bytes");
        System.out.println("besar Double = " + Double.SIZE + " bit");

        // Float (koma, bilangan real)
        float f = -10.5f;
        System.out.println("======FLOAT======");
        System.out.println("nilai Float f = " + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("besar Float = " + Float.BYTES + " bytes");
        System.out.println("besar Float = " + Float.SIZE + " bit");

        // Char (Karakter) berdasarkan ASCII code
        char g = 'c';
        System.out.println("======Char======");
        System.out.println("nilai Char g = " + g);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("besar Char = " + Character.BYTES + " bytes");
        System.out.println("besar Char = " + Character.SIZE + " bit");

        // Boolean (true/false)
        boolean val = true;
        System.out.println("======BOOLEAN======");
        System.out.println("nilai Boolean val = " + val);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);

    }
}
