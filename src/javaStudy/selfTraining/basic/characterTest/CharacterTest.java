package characterTest;

public class CharacterTest {
	public static void main(String[] args) {
//		Character x = new Character("123");
//		Character y = new Character("abc");

		Character x = new Character('1');
		Character y = new Character('a');

		if (y.isDigit(1))
		{
			System.out.println("It's a digit.");
		}
		else
		{
			System.out.println("It isn't a digit.");
		}
		
//		if (x.isLetter())
//		{
//			System.out.println("It's a letter.");
//		}
//		else
//		{
//			System.out.println("It isn't a letter.");
//		}
	}
	
//	private static void strChecker(final String x) {
//		char y = (char) x.getBytes()[0];
//		if (y.isLetter()) {
//			System.out.println("It's a letter.");
//		}
//		else if (x.isDigit()) {
//			System.out.println("It's a digit.");
//		}
//		else {
//			System.out.println("It's nothing.");
//		}
//	}
}
