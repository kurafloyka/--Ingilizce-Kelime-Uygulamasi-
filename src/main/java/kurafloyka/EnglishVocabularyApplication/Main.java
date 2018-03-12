package kurafloyka.EnglishVocabularyApplication;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	static LinkedList<Vocabulary> vocabularies;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingilizce Kelime Uygulamasi");
		vocabularies = new LinkedList<Vocabulary>();

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
				// kelimeSorgulama();
				break;
			case 3:
				// kelimeSilme();
				break;

			case 4:
				kelimeListeleme();
				break;
			case 5:
				// kelimeGuncelleme();
				break;

			case 6:
				return;

			}

		}
	}

	public static void kelimeEkleme() {

		LinkedList<String> anlamlar = new LinkedList<String>();
		LinkedList<String> cumleler = new LinkedList<String>();

		String kelime, anlam, cumle;

		Scanner oku = new Scanner(System.in);

		System.out.println("Lutfen eklenecek kelimeyi giriniz");
		kelime = oku.nextLine();

		while (true) {
			System.out.println("Lutfen eklenecek anlami ekleyiniz");
			anlam = oku.nextLine();

			System.out.println("Lutfen eklenecek cumleyi giriniz");
			cumle = oku.nextLine();

			anlamlar.add(anlam);
			cumleler.add(cumle);

			System.out.println("Baska anlam eklemek istiyor musunuz? evet/hayir");
			String cevap;
			cevap = oku.nextLine();

			if (cevap.equals("hayir")) {
				System.out.println("Kelime eklendi...");
				break;
			}

		}
		Vocabulary s1 = new Vocabulary(kelime, anlamlar, cumleler);
		vocabularies.add(s1);

	}

	public static void kelimeListeleme() {

		ListIterator<Vocabulary> itr = vocabularies.listIterator();
		while (itr.hasNext()) {

			Vocabulary v1 = (Vocabulary) itr.next();

			System.out.println("***********Kelimeler*************");

			System.out.println("İngilizce Kelime:" + v1.getVocabulary());

			System.out.println("***********Kelimenin Anlamlari*************");

			LinkedList<String> v1Means = v1.getMeans();

			for (String temp : v1Means) {

				System.out.println("Kelimenin anlamlari:" + temp);
			}

			System.out.println("***********Kelime Cumleleri*************");

			LinkedList<String> v1Sentences = v1.getSentences();

			for (String temp : v1Sentences) {

				System.out.println("Kelimenin Cumlesi:" + temp);

			}

		}

	}
}
