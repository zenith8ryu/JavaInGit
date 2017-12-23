package getSentence;

public class MainProg {
	public static void main(String[] args) {
		System.out.println(getFirstSentence());
		System.out.println(getSecondSentence());
		System.out.println(getWordOccurence(book, word));
	}

	private static String book = "" + "Udacity is a good site, as a product of him." + "So let's dance."
			+ "You're a son of bitch, just like him." + "Dipatch him from this planet within two weeks.";

	private static String word = "him";

	private static String getFirstSentence() {
		int endOfFirstSentence = book.indexOf(".");
		return book.substring(0, endOfFirstSentence + 1);
	}

	private static String getSecondSentence() {
		int endOfFirstSentence = book.indexOf(".");
		int endOfSecondSentence = book.indexOf(".", endOfFirstSentence + 1);
		return book.substring(endOfFirstSentence + 2, endOfSecondSentence + 1);
	}

	private static int getWordOccurence(String article, String x) {
		int originLen = article.length();
		int modifiedLen = article.replace(x, "").length();
		int widthOfWord = x.length();
		return (originLen - modifiedLen) / widthOfWord;
	}

}
