package sesi9;

public class Segitiga extends BangunDatar implements Hitung{
	
	public Segitiga(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double hitungLuas() {
		double hasil = ((num1 * num2) / 2);
		return hasil;
	}
	
}
