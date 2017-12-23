package extendsInCasting;

public class MainPrg {
	public static void main(String[] args) {
		test();
	}

	public static class Father {
		void beatSon() {
			System.out.println("A father can beat his son.");
		}
	}

	public static class Son extends Father {
		void revoltFather() {
			System.out.println("A son can revlot his father.");
		}
	}
	
	public static void test() {
		Father f1 = new Son();
		Son s1 = (Son)f1;
		s1.beatSon();

		Father f2 = new Father();
		Son s2 = (Son)f2;
		s2.beatSon();
		
//		Son s3 = new Father(); // ¡û Compile Err
	}
	
}