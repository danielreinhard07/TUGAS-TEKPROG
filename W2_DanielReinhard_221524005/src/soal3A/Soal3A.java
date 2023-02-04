package soal3A;

public class Soal3A {

	public static void main(String[] args) {
		final double CM_PER_INCH = 2.54; 	//final menandakan bahwa value dari variabel tersebut tidak dapat diubah-ubah.
		double paperWidth = 8.5; 
		double paperHeight = 11; 
		System.out.println("Paper size in centimeters: " + 
		paperWidth * CM_PER_INCH + " by " + paperHeight * 
		CM_PER_INCH);
	}
}
