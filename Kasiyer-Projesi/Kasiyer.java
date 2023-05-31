import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kasiyer {
	
	private Kasa _kasa;
	
	public Kasiyer() {
		_kasa = new Kasa();
	}
	
	
	public Kasiyer(String isim) {
		_kasa = new Kasa(isim);
	}
	
	public void isVakti() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		yemekKodlariYazdir();
		int kod = 0;
		
		
		do {
			System.out.print("Kod: ");
			kod = Integer.parseInt(reader.readLine());
			if(kod == 5) {
				break;
			}else if(kod >5) {
				System.out.println("Lütfen geçerli bir deðer girin. ");
				yemekKodlariYazdir();
				continue;
			}
			System.out.print("Ürün fiyatý: ");
			double fiyat = Double.parseDouble(reader.readLine());
			System.out.println("--------------\n");

			_kasa.hesapla(kod,fiyat);
		}while(kod != 5);


		_kasa.fisYazdir();
		
	}

	public void yemekKodlariYazdir(){
		String yemekKodlarý = "[1]- Salata\n[2]- Hamburger\n[3]- Pizza\n[4]- Tatlý\n[5]-Kasayý kapat(Fiþ yazdýr.)";

		System.out.println(yemekKodlarý);
		System.out.println("\n-------------------\n");
	}

}
