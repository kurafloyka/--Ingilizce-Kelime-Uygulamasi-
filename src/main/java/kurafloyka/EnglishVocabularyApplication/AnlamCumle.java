package kurafloyka.EnglishVocabularyApplication;

public class AnlamCumle implements Comparable<AnlamCumle> {

	private String anlam, cumle;

	public AnlamCumle(String anlam, String cumle) {
		super();
		this.anlam = anlam;
		this.cumle = cumle;
	}

	public String getAnlam() {
		return anlam;
	}

	public void setAnlam(String anlam) {
		this.anlam = anlam;
	}

	public String getCumle() {
		return cumle;
	}

	public void setCumle(String cumle) {
		this.cumle = cumle;
	}

	public int compareTo(AnlamCumle o) {
		// TODO Auto-generated method stub
		return this.anlam.compareTo(o.anlam);
	}

	@Override
	public String toString() { // TODO Auto-generated method stub
		return "anlam: " + anlam + " cumle:" + cumle;
	}

}
