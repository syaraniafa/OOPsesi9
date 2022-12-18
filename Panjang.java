package sesi9;

public class Panjang extends BangunDatar implements Hitung{

	public Panjang(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double hitungLuas() {
		double hasil = num1 * num2;
		return hasil;
	}

}
