package Jobsheet14;

import java.util.Scanner;

public class Tugas3_21 {
    static boolean cekPrima(int n, int i) {
        if (n <= 1) {
            return false; // Bilangan negatif dan 1 jelas bukan bilangan prima
        } else if (i == 1) {
            return true; // Basis kasus: jika mencapai 1, bilangan tersebut prima
        } else {
            if (n % i == 0) {
                return false; // Jika n habis dibagi oleh i, bukan bilangan prima
            } else {
                return cekPrima(n, i - 1); // Rekursi: cek bilangan prima untuk i-1
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan : ");
        bilangan = sc.nextInt();

        boolean hasil = cekPrima(bilangan, bilangan / 2);

        if (hasil) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}
