package soal1;

import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kata = sc.nextLine();
		sc.close();

		String str[] = kata.split("[', ?.@]+");
		System.out.println(str.length);

		
		for(String s : str)
			System.out.println(s);
	}
}
