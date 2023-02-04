package soal3;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		System.out.println("Berhitung");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("5. Sisa Bagi");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nMasukkan nilai A: ");
		int a = sc.nextInt();
		System.out.print("\nMasukkan nilai B: ");
		int b = sc.nextInt();
		System.out.println("\nPilih input 1 - 5");
		int input = sc.nextInt();
		sc.close();
		
		switch(input) {
			case 1:
				System.out.println("Hasil dari penjumlahan adalah " +(a + b));
				break;
			case 2:
				System.out.println("Hasil dari penjumlahan adalah " +(a - b));
				break;
			case 3:
				System.out.println("Hasil dari penjumlahan adalah " +(a * b));
				break;
			case 4:
				System.out.println("Hasil dari penjumlahan adalah " +(a / b));
				break;
			case 5:
				System.out.println("Hasil dari penjumlahan adalah " +(a % b));
				break;
		}
	}
}
