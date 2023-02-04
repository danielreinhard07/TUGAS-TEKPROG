package soal5;

public class Soal5 {
	static short methodOne(long l){
	 int i = (int) l;		//mendeklarasikan value i dengan nilai l yang awalnya long menjadi integer.
	 return (short)i;
	}
	public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d; //mengubah tipe data d menjadi float.
		byte b = (byte) methodOne((long) f); //mengubah tipe data fungsi methodeOne menjadi byte
											 //dan f sebagai parameter dari methodOne menjadi long.
		System.out.println(b);

	}

}
