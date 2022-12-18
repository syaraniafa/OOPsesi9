package sesi9;

public class Trapesium extends BangunDatar implements Hitung{
	private double tinggi;
	
	public Trapesium(double num1, double num2, double tinggi) {
		super(num1, num2);
		this.tinggi = tinggi;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	@Override
	public double hitungLuas() {
		double hasil = (((num1 + num2) * tinggi) / 2);
		return hasil;
		
	}

}
