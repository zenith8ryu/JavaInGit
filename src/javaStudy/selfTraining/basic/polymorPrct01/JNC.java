package polymorPrct01;

public class JNC extends Wine {
	public JNC() {
		setName("JNC");
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
