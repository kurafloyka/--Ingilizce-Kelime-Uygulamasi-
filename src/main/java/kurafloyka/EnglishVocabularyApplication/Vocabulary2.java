package kurafloyka.EnglishVocabularyApplication;

import java.util.TreeSet;

public class Vocabulary2 implements Comparable<Vocabulary2> {

	private String vocabulary;
	private TreeSet<AnlamCumle> t1 = new TreeSet<AnlamCumle>();

	public Vocabulary2(String vocabulary, TreeSet<AnlamCumle> t1) {
		super();
		this.vocabulary = vocabulary;
		this.t1 = t1;
	}

	public String getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
	}

	public TreeSet<AnlamCumle> getT1() {
		return t1;
	}

	public void setT1(TreeSet<AnlamCumle> t1) {
		this.t1 = t1;
	}

	public int compareTo(Vocabulary2 o) {
		// TODO Auto-generated method stub
		return this.vocabulary.compareTo(o.vocabulary);
	}

	@Override
	public String toString() {
		return "Vocabulary2 [vocabulary=" + vocabulary + ", t1=" + t1 + "]";
	}

}
