package soal2;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner sc 		= new Scanner(System.in);
		String[] arr1 	= new String[3];
		int[] arr2		= new int[3]; 
		
		for (int i = 0 ; i < 3 ; i++) {
			arr1[i] 	= sc.next();
			arr2[i]		= sc.nextInt();
		}
		System.out.println("==================");
		for (int i = 0 ; i < 3 ; i++) {
			System.out.printf("%-15s%03d\n", arr1[i],arr2[i]);
		}
		System.out.println("==================");
		sc.close();

	}

}
