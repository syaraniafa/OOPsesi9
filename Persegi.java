package sesi9;

public class Persegi extends BangunDatar implements Hitung {
	
	public Persegi(double num1, double num2) {
		super(num1, num2);
		
	}

	public double hitungLuas() {
		double hasil = num1 * num2;
		return hasil;
	}
	
	
}
