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

public class genap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (antara 1 s.d. 1000): ");
        int N = scanner.nextInt();

        printPattern(N);

        scanner.close();
    }

    private static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.print("N=" + i + " ");

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); 
        }
    }
}
