
public class Kasa {
	private double toplamSatisMiktar = 0;
	private double gunlukKar = 0;
	private double salataKazanilanMiktar = 0;
	private int tatliSayi = 0;
	private int salataSayi =0;
	
	public Kasa() {
		System.out.println("Ho�geldiniz...");
	}
	
	public Kasa(String isim) {
		System.out.println("Ho�geldin " + isim);
	}
	
	public void hesapla(int secim,double fiyat) {
		topSatHesapla(fiyat);
		gunlukKarHesapla(secim,fiyat);
	}
	
	private void topSatHesapla(double fiyat) {
		toplamSatisMiktar += fiyat;
	}
	
	private void gunlukKarHesapla(int secim,double fiyat) {
		
		double kar = 0;
		
		switch(secim) {
			case 1:kar = fiyat*0.3; salataKari(kar);
				break;
			case 2:kar = fiyat*0.25; 
			break;
			case 3:kar = fiyat*0.35;
			break;
			case 4:kar = fiyat*0.25; tatliSayiArttir();
				break;
			default:
				break;
		}
		
		gunlukKar += kar;
		
	}
	
	private void salataKari(double kar) {
		salataKazanilanMiktar += kar;
		salataSayi++;
	}
	
	private void tatliSayiArttir() {
		tatliSayi++;
	}
	
	public void fisYazdir() {
		System.out.println("----------------------------------\n");
		System.out.println("Toplam Sat�� Fiyat�: " + toplamSatisMiktar);
		System.out.println("G�nl�k Kar: " + gunlukKar);
		System.out.println("Ortalama Salata Kar�: " + salataKazanilanMiktar/salataSayi);
		System.out.println("Tatl� Say�s�: " + tatliSayi);
		System.out.println("Salata Say�s�: " + salataSayi);
		System.out.println("\n----------------------------------");
	}
	
	
	
}
