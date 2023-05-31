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
				System.out.println("L�tfen ge�erli bir de�er girin. ");
				yemekKodlariYazdir();
				continue;
			}
			System.out.print("�r�n fiyat�: ");
			double fiyat = Double.parseDouble(reader.readLine());
			System.out.println("--------------\n");

			_kasa.hesapla(kod,fiyat);
		}while(kod != 5);


		_kasa.fisYazdir();
		
	}

	public void yemekKodlariYazdir(){
		String yemekKodlar� = "[1]- Salata\n[2]- Hamburger\n[3]- Pizza\n[4]- Tatl�\n[5]-Kasay� kapat(Fi� yazd�r.)";

		System.out.println(yemekKodlar�);
		System.out.println("\n-------------------\n");
	}

}
