package forceCast;

public class Main {
	public static void main(String[] args) {
//		Father father1 = new Son();
		Father father1 = new Father();
		Son son1 = (Son) father1;
	}
}


class Father {
	protected void beatSon() {
		System.out.println("I'am your father!");
	}
}

class Son extends Father {
	void repelFather() {
		System.out.println("No, you're not my father!");
	}
}
