package kurafloyka.EnglishVocabularyApplication;

import java.util.LinkedList;

public class Vocabulary {

	private String vocabulary;
	private LinkedList<String> means = new LinkedList<String>();
	private LinkedList<String> sentences = new LinkedList<String>();

	public Vocabulary(String vocabulary, LinkedList<String> means, LinkedList<String> sentences) {

		this.vocabulary = vocabulary;
		this.means = means;
		this.sentences = sentences;

	}

	public String getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
	}

	public LinkedList<String> getMeans() {
		return means;
	}

	public void setMeans(LinkedList<String> means) {
		this.means = means;
		System.out.println("kullanici olusturuldu");
	}

	public LinkedList<String> getSentences() {
		return sentences;
	}

	public void setSentences(LinkedList<String> sentences) {
		this.sentences = sentences;
	}

}
