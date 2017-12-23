package innerClass;

public class MainPrg {
	public static void main(String[] args) {
		IC1 a = new IC1();
		IC2 b = new IC2();
		a.test(); // ← private内部类可以读取外部类的private变量
		b.test(); // ← public内部类可以读取外部类的private变量
	}

	private static final String x = "string";

	static private class IC1 {
		void test() {
			System.out.println(x + " in tc1");
		}
	}

	static public class IC2 {
		void test() {
			System.out.println(x+  " in tc2");
		}
	}
}
