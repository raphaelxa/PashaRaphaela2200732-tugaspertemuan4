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

public class genap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        System.out.print("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
        displayPrimes(batasAwal, batasAkhir);

        System.out.print("\nBilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
        displayComposites(batasAwal, batasAkhir);

        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void displayPrimes(int batasAwal, int batasAkhir) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static void displayComposites(int batasAwal, int batasAkhir) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
