import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deneme {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kasa Seç: ");
		int kasaSec = Integer.parseInt(reader.readLine()); 
		
		if(kasaSec == 1) {
			kasa1();
		}else if(kasaSec == 2) {
			System.out.print("Ýsminiz: ");
			String isim = reader.readLine();
			kasa2(isim);
		}
		
		

	}
	
	static void kasa1() throws IOException {
		Kasiyer kasiyer1 = new Kasiyer();
		kasiyer1.isVakti();	
	}
	
	static void kasa2(String isim) throws IOException {
		Kasiyer kasiyer2 = new Kasiyer(isim);
		kasiyer2.isVakti();
	}
	
	
	
	
	
	

}
