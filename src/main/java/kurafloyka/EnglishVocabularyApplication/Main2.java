package kurafloyka.EnglishVocabularyApplication;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<AnlamCumle> t = new TreeSet<AnlamCumle>(Collections.reverseOrder());

		t.add(new AnlamCumle("abc", "def"));
		t.add(new AnlamCumle("araa", "ttt"));
		t.add(new AnlamCumle("def", "sss"));
		t.add(new AnlamCumle("abfc", "cumle"));

		TreeSet<AnlamCumle> t2 = new TreeSet<AnlamCumle>(Collections.reverseOrder());

		t2.add(new AnlamCumle("acsbc", "def"));
		t2.add(new AnlamCumle("aaa", "ttt"));
		t2.add(new AnlamCumle("deff", "sss"));
		t2.add(new AnlamCumle("abck", "cumle"));

		TreeSet<AnlamCumle> t3 = new TreeSet<AnlamCumle>(Collections.reverseOrder());

		t3.add(new AnlamCumle("abc", "def"));
		t3.add(new AnlamCumle("aaa", "ttt"));
		t3.add(new AnlamCumle("def", "sss"));
		t3.add(new AnlamCumle("abc", "cumle"));

		System.out.println("--------------------------------------------");

		TreeSet<Vocabulary2> v1 = new TreeSet<Vocabulary2>(Collections.reverseOrder());

		v1.add(new Vocabulary2("faruk", t));
		v1.add(new Vocabulary2("AHMET", t2));
		v1.add(new Vocabulary2("elif", t3));
		v1.add(new Vocabulary2("elif", t)); // kopyasini eklemez

		Iterator<Vocabulary2> itr = v1.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
