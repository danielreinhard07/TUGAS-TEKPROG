package soal6;

public class Soal6 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "java";
		String nama = s1.substring(0, 1).toUpperCase()+s1.substring(1).concat(" ")+ s2.substring(0, 1).toUpperCase()+s2.substring(1);
		char c1   = s1.charAt(0);	//mendapatkan char dari string indeks ke-0.
		char c2   = s2.charAt(0);	//mendapatkan char dari string indeks ke-0.
		int pos1  = c1 - 'a' + 1;	//proses mengubah char menjadi integer untuk mendapatkan urutan huruf ada di angka berapa.
		int pos2  = c2 - 'a' + 1;
		
		System.out.println(s1.length() + s2.length());
		if (pos1 > pos2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(nama);
	}
}
