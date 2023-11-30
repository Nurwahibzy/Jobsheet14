package Jobsheet14;

import java.util.Scanner;

public class Tugas4_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bulanKe;

        System.out.print("Masukkan bulan : ");
        bulanKe = sc.nextInt();

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulanKe + " adalah : " + menghitungFibonacci(bulanKe));
    }

    public static int menghitungFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return menghitungFibonacci(n - 1) + menghitungFibonacci(n - 2);
        }
    }
}
