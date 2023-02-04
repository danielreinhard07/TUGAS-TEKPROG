package soal2;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input : ");
		double i = input.nextDouble();
		input.close();
		
		if(i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE) {
			System.out.println("Can be fitted in: Byte, Short, Integer, Long");
		} else if ( i >= Short.MIN_VALUE && i <= Short.MAX_VALUE) {
			System.out.println("Can be fitted in: Short, Integer, Long");
		} else if ( i >= Integer.MIN_VALUE && i <= Integer.MAX_VALUE) {
			System.out.println("Can be fitted in: Integer, Long");
		} else if ( i >= Long.MIN_VALUE && i <= Long.MAX_VALUE) {
			System.out.println("Can be fitted in: Long");
		} else {
			System.out.println("Cannot be fitted in");
		}

	}

}
