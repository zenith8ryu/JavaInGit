package codeBlock;

public class Main {
	public static void main(String[] args) {
		Test test1 = new Test();
//		test1.modify();
//		test1.modify_rev();
		System.out.println(test1.NAME);
	}
}

class Test {
	public static String NAME;
	
	{
		NAME = "Modified by construction block.";
	}
	
	public Test() {
//		NAME = "Modified by construction function.";
	}
	
	void modify() {
		NAME = "static name";
	}
	
	void modify_rev() {
		NAME = "static name_rev";
	}
}
