package Jobsheet14;

import java.util.Scanner;

public class Tugas2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, hasil;
        System.out.print("Masukkan nilai f : ");
        f = sc.nextInt();
        
        System.out.println("Proses penjumlahan : ");
        prosesPenjumlahanRekursif(f);
        hasil = penjumlahanRekursif(f);
        System.out.println(" = " + hasil);
    }

    public static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + penjumlahanRekursif(n - 1));
        }
    }

    public static void prosesPenjumlahanRekursif(int n) {
        if (n == 1) {
            System.out.print("1");
        } else {
            prosesPenjumlahanRekursif(n - 1);
            System.out.print(" + " + n);
        }
    }
}
