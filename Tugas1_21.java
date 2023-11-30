package Jobsheet14;

import java.util.Scanner;

public class Tugas1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n : ");
        n = sc.nextInt();

        System.out.println("Menggunakan rekursif : ");
        deretDescendingRekursif(n);
        System.out.println();
        System.out.println("Menggunakan iteratif : ");
        deretDescendingIteratif(n);

        sc.close();
    }

    public static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
