package stringTest;

public class Main {
	public static void main(String[] args) {
		String s = "game, game";
		StringBuffer sb = new StringBuffer();
		sb.append("test1");
		sb.append("test1");
		sb.insert(10, " test2 ");
		sb.delete(1, 2);
		
		System.out.println(sb);

		// Exam of Initial letter
//		if (s.startsWith("e", 3)) {
//			System.out.println("OK");
//		}
//		else {
//			System.out.println("NG");
//		}
		
		// Exam of replacement
//		System.out.println(s.replace("ga", "na"));
		
	}

}
