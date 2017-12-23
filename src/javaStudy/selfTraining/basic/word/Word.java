package word;

public class Word {
	public static void main(String[] args) {
		System.out.println(nonVowelCount("apple"));
	}

	static int nonVowelCount(String word) {
		String letter;
		int cnt = 0;

		for (int i = 0; i <= word.length() - 1; i++) {
			letter = word.substring(i, i + 1).toLowerCase();
			if (letter.equals("a")) {
				cnt++;
			}
			if (letter.equals("i")) {
				cnt++;
			}
			if (letter.equals("u")) {
				cnt++;
			}
			if (letter.equals("e")) {
				cnt++;
			}
			if (letter.equals("o")) {
				cnt++;
			}
		}
		
		return word.length() - cnt;
	}
}
