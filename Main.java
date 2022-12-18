package sesi9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scn = new Scanner(System.in);
	ArrayList<BangunDatar> List = new ArrayList<>();
	
	void Menu() {
		System.out.println("Menu");
		System.out.println("=====");
		System.out.println("1. Mencari Luas bangun datar");
		System.out.println("2. Tampilkan hasil");
		System.out.println("3. Selesai");
		System.out.print("Pilih [1 - 3]: ");
	}

	public Main() {
		int pilih;
		do {
			Menu();
			pilih = scn.nextInt();
			scn.nextLine();
			switch(pilih) {
			case 1:
				Jenis();
				break;
			case 2:
				Tampil();
				break;
			}
			
		}while(pilih != 3);
		System.out.println("Terima kasih!!");
	}
	
	private void Jenis() {
		int bentuk;
		double num1;
		double num2;
		double tinggi;
		do {
			System.out.println("\nPilih bangun datar:");
			System.out.println("1. Persegi");
			System.out.println("2. Persegi panjang");
			System.out.println("3. Belah ketupat");
			System.out.println("4. Segitiga siku-siku");
			System.out.println("5. Jajar genjang");
			System.out.println("6. Trapesium");
			System.out.print(">> ");
			bentuk = scn.nextInt();
		}while(bentuk<1 || bentuk>6);
		
		if(bentuk == 1) {
			System.out.print("Masukan a: ");
			num1 = scn.nextDouble();
			System.out.print("Masukan b: ");
			num2 = scn.nextDouble();
			
			List.add(new Persegi(num1, num2));
			
		}else if(bentuk == 2) {
			System.out.print("Masukan a: ");
			num1 = scn.nextDouble();
			System.out.print("Masukan b: ");
			num2 = scn.nextDouble();
			
			List.add(new Panjang(num1, num2));
		
		}else if(bentuk == 3) {
			System.out.print("Masukan a: ");
			num1 = scn.nextDouble();
			System.out.print("Masukan b: ");
			num2 = scn.nextDouble();
			
			List.add(new Ketupat(num1, num2));
			
		}else if(bentuk == 4) {
			System.out.print("Masukan a: ");
			num1 = scn.nextDouble();
			System.out.print("Masukan tinggi: ");
			num2 = scn.nextDouble();
			
			List.add(new Segitiga(num1, num2));
			
		}else if(bentuk == 5) {
			System.out.print("Masukan a: ");
			num1 = scn.nextDouble();
			System.out.print("Masukan b 2: ");
			num2 = scn.nextDouble();
			System.out.print("Masukan tinggi: ");
			tinggi = scn.nextDouble();
			
			List.add(new Trapesium(num1, num2, tinggi));
			
		}else if(bentuk == 6) {
			System.out.print("Masukan a: ");
			num1 = scn.nextDouble();
			System.out.print("Masukan tinggi: ");
			num2 = scn.nextDouble();
			
			List.add(new JajarGenjang(num1, num2));
		}
		System.out.println("");
		scn.nextLine();
	}

	private void Tampil() {
		int count = 0;
		if(List.isEmpty()) {
			System.out.println("Tidak ada data luas bangun datar");
			scn.nextLine();
			return;
		}else {
			System.out.println("\nData hasil mencari Luas bangun datar");
			System.out.println("===========================================");
			System.out.printf("| %-5s | %-5s | %-5s | %-7s | %-5s |\n", "no", "a", "b", "tinggi", "Luas");
			System.out.println("|-----------------------------------------|");
			for(BangunDatar i : List) {
				count++;
				if(i instanceof Persegi) {
					System.out.printf("| %-5s | %-5s | %-5s | %-7s | %-5s |\n", count, i.getNum1(), i.getNum2(), "-", ((Persegi)i).hitungLuas());
				}else if(i instanceof Panjang) {
					System.out.printf("| %-5s | %-5s | %-5s | %-7s | %-5s |\n", count, i.getNum1(), i.getNum2(), "-", ((Panjang)i).hitungLuas());
				}else if(i instanceof Ketupat) {
					System.out.printf("| %-5s | %-5s | %-5s | %-7s | %-5s |\n", count, i.getNum1(), i.getNum2(), "-", ((Ketupat)i).hitungLuas());
				}if(i instanceof Segitiga) {
					System.out.printf("| %-5s | %-5s | %-5s | %-7s | %-5s |\n", count, i.getNum1(), "-", i.getNum2(), ((Segitiga)i).hitungLuas());
				}else if(i instanceof JajarGenjang) {
					System.out.printf("| %-5s | %-5s | %-5s | %-7s | %-5s |\n", count, i.getNum1(),  "-", i.getNum2(), ((JajarGenjang)i).hitungLuas());
				}else if(i instanceof Trapesium) {
					System.out.printf("| %-5s | %-5s | %-5s | %-7s | %-5s |\n", count, i.getNum1(), i.getNum2(), ((Trapesium)i).getTinggi(), ((Trapesium)i).hitungLuas());
				}
			}
			System.out.println("===========================================");
			System.out.println("");
			scn.nextLine();
		}
	}

	public static void main(String[] args) {new Main();}

}
