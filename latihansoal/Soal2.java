package latihansoal;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka ke-1 : ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka ke-2 : ");
        int angka2 = input.nextInt();

        System.out.println("Masukkan angka ke-3 : ");
        int angka3 = input.nextInt();

        if (angka1 > angka2 && angka1 > angka3) {
            System.out.println("Angka terbesar adalah : " + angka1);
        } else if (angka2 > angka3 && angka2 > angka1) {
            System.out.println("Angka terbesar adalah : " + angka2);
        } else {
            System.out.println("Angka terbesar adalah : " + angka3);
        }

    }
}
