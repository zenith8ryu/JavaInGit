package javaStudy.selfTraining.basic.polymorPrct01;

public class JNC extends polymorPrct01.Wine {
	public JNC() {
		setName("JNC");
	}

	/**
	 * 重写父类方法，实现多态
	 */
	public String drink() {
		return "喝的是 " + getName();
	}

	/**
	 * 重写toString()
	 */
	public String toString() {
		return "Wine : " + getName();
	}
}
