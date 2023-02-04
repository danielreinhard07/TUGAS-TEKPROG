package soal5;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		Scanner sc 	= new Scanner(System.in);
		int[] plat  = new int[4]; 
		for(int i = 0; i < 4 ; i++) {
			plat[i]	= sc.nextInt();
		}		
		if(plat[3] - 99!= 0) {
			System.out.println("berhenti");
		} else {
			System.out.println("jalan");
		}
		sc.close();
		
	}

}
