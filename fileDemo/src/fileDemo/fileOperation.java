package fileDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileOperation {

	public static void main(String[] args) {
		
		try {
            String dosyaYolu = ""; // write your path
            makefile(dosyaYolu);
        } catch (IOException e) {
            System.out.println("Dosya oluşturma veya yazma hatası: " + e.getMessage());
        }		
	}
	public static void makefile(String dosyaYolu) throws IOException {
        File dosya = new File(dosyaYolu);
        if (dosya.createNewFile()) {
            System.out.println("Dosya başarıyla oluşturuldu.");
        } else {
            System.out.println("Dosya zaten mevcut.");
        }
        Scanner scanner = new Scanner(System.in);
        String devam = "evet";

        while (devam.equalsIgnoreCase("evet")) {
            System.out.print("Bir araba markası girin: ");
            String marka = scanner.nextLine();
            System.out.print("Bir araba modeli girin: ");
            String model = scanner.nextLine();
            System.out.print("Bir araba yılı girin: ");
            int yil = scanner.nextInt();
            scanner.nextLine(); 

            FileWriter dosyaYazici = new FileWriter(dosya, true);
            dosyaYazici.write("Araba Markası: " + marka + "\n");
            dosyaYazici.write("Araba Modeli: " + model + "\n");
            dosyaYazici.write("Araba Yılı: " + yil + "\n");
            dosyaYazici.close();

            System.out.print("Başka bir araba bilgisi girmek istiyor musunuz? (evet/hayır): ");
            devam = scanner.nextLine();
        }

        System.out.println("Bilgiler başarıyla dosyaya yazıldı.");
    }
}
