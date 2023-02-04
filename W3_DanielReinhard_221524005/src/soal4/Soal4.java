package soal4;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int Sold = sc.nextInt();
		sc.close();
		int Gaji  = 500000;
		int Price = 50000;
		int Result;
		
        if (Sold < 15) {
        	Result = (int)(Gaji - ((15 - Sold) * 0.15 * Price));
        } else if (Sold >= 40 && Sold <= 80) {
        	Result = (int)(Gaji + (Sold * Price * 0.25));
        } else if (Sold > 80) {
        	Result = (int)(Gaji + (Sold * Price * 0.35));
        } else {
        	Result = (int)(Gaji + (Sold * Price * 0.1));
        }
        System.out.println(Result);

	}

}
