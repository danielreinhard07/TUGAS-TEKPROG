package soal6;

import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner sc 		= new Scanner (System.in);
		BigInteger a 	= sc.nextBigInteger();	//menggunakan BigInteger agar bisa menginput bilangan yang besar.
		BigInteger b 	= sc.nextBigInteger();
		sc.close();
		BigInteger plus	= a.add(b);				//metode operasi penjumlahan pada BigInteger.
		BigInteger mult	= a.multiply(b);		//metode operasi perkalian pada BigInteger.
		System.out.println(plus);
		System.out.println(mult);

	}

}
