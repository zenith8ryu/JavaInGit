package polymorPrct01;

public class JGJ extends Wine {
	public JGJ() {
		setName("JGJ");
	}

	/**
	 * ��д���෽����ʵ�ֶ�̬
	 */
	public String drink() {
		return "�ȵ��� " + getName();
	}

	/**
	 * ��дtoString()
	 */
	public String toString() {
		return "Wine : " + getName();
	}
}
