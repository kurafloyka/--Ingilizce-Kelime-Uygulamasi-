package kurafloyka.EnglishVocabularyApplication;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {

	static TreeSet<Vocabulary2> v1;
	static String sorgulanacakKelime, silinecekKelime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("##################Ingilizce Kelime Uygulamasi###################");
		System.out.println("################################################################");
		v1 = new TreeSet<Vocabulary2>();

		menu();

	}

	public static void menu() {

		int tercih = 0;

		while (true) {
			System.out.println("***********************MENU*************************");
			System.out.println("1. Tercih:Kelime Ekleme");
			System.out.println("2. Tercih:Kelime Sorgulama");
			System.out.println("3. Tercih:Kelime Silme");
			System.out.println("4. Tercih:Kelime Listeleme");
			System.out.println("5. Tercih:Kelime Guncelleme");
			System.out.println("6. Tercih:Uygulamadan Cıkıs");
			System.out.println("***********************MENU*************************");
			System.out.println("                                                    ");
			System.out.println("                                                    ");

			System.out.println("Lutfen Tercihinizi Giriniz!!!");
			Scanner oku1 = new Scanner(System.in);

			tercih = oku1.nextInt();

			switch (tercih) {
			case 1:
				kelimeEkleme();
				break;

			case 2:
				kelimeSorgulama();
				break;
			case 3:
				kelimeSilme();
				break;

			case 4:
				kelimeListeleme();
				break;
			case 5:
				// kelimeGuncelleme();
				break;

			case 6:
				System.out.println("Uygulamadan cikis yaptiniz...");
				return;

			}

		}
	}

	public static void kelimeEkleme() {

		String kelime, anlam, cumle;
		TreeSet<AnlamCumle> t3 = new TreeSet<AnlamCumle>();
		Vocabulary2 kelimeAmlamlarCumleler;

		Scanner oku = new Scanner(System.in);

		System.out.println("Lutfen eklenecek kelimeyi giriniz");
		kelime = oku.nextLine();
		while (true) {

			System.out.println("Lutfen eklenecek anlami ekleyiniz");
			anlam = oku.nextLine();

			System.out.println("Lutfen eklenecek cumleyi giriniz");
			cumle = oku.nextLine();

			t3.add(new AnlamCumle(anlam, cumle));

			System.out.println(
					kelime + " icin " + "Anlam olarak " + anlam + "----" + "Cumle olarak " + cumle + " eklendi....");

			System.out.println("Baska anlam eklemek istiyor musunuz? evet/hayir");
			String cevap;
			cevap = oku.nextLine();

			if (cevap.equals("hayir")) {
				System.out.println("\"Kelime eklemeden cikildi...\"");
				break;
			}
		}

		kelimeAmlamlarCumleler = new Vocabulary2(kelime, t3);
		v1.add(kelimeAmlamlarCumleler);

	}

	public static void kelimeListeleme() {

		Iterator<Vocabulary2> itr = v1.iterator();

		if (itr.hasNext() == false) {

			System.out.println("Listeye eklenmis herhangi bir kelime bulunamamistir.Lutfen Kelime ekleyiniz...");
		}

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

	public static void kelimeSorgulama() {

		Iterator itr = v1.iterator();

		if (itr.hasNext() == false) {
			System.out.println("Listeye eklenmis herhangi bir kelime bulunamamistir.Lutfen Kelime ekleyiniz...");

		} else {

			System.out.println("Sorgulamak istediginiz kelimeyi giriniz...");
			Scanner oku2 = new Scanner(System.in);
			sorgulanacakKelime = oku2.nextLine();
		}

		while (itr.hasNext()) {

			Vocabulary2 listedekiKelimeler = (Vocabulary2) itr.next();

			if (sorgulanacakKelime.equals(listedekiKelimeler.getVocabulary())) {

				System.out.println(listedekiKelimeler.toString());
			}

			else {
				System.out.println("Sistemde girilen kelime bulunamadi....");
			}

		}

	}

	public static void kelimeSilme() {
		Iterator itr = v1.iterator();

		if (itr.hasNext() == false) {
			System.out.println("Listeye eklenmis herhangi bir kelime bulunamamistir.Lutfen Kelime ekleyiniz...");

		} else {

			System.out.println("Silmek istediginiz kelimeyi giriniz...");
			Scanner oku2 = new Scanner(System.in);
			silinecekKelime = oku2.nextLine();
		}

		while (itr.hasNext()) {

			Vocabulary2 listedekiKelimeler = (Vocabulary2) itr.next();

			if (silinecekKelime.equals(listedekiKelimeler.getVocabulary())) {

				itr.remove();
				System.out.println(silinecekKelime + " kelimesi listeden silindi.....");
			}

			else {
				System.out.println("Sistemde girilen kelime bulunamadi....");
			}

		}

	}
}
