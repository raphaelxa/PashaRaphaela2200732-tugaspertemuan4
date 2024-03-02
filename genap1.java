/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author pasha
 */
import java.util.Scanner;

public class genap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        cekDanTampilkanHasil(angka1);

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        cekDanTampilkanHasil(angka2);

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = scanner.nextInt();
        cekDanTampilkanHasil(angka3);
    }

    public static void cekDanTampilkanHasil(int angka) {
        if (angka >= 1000 && angka <= 9999) {
            System.out.println(angka + " merupakan angka ribuan.");
        } else {
            System.out.println(angka + " bukan angka ribuan.");
        }
    }
}
